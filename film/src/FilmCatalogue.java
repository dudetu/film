import java.util.ArrayList;
import java.util.List;

public class FilmCatalogue {
    private List<Film> films;

    public FilmCatalogue() {
        this.films = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void removeFilm(Film film) {
        films.remove(film);
    }

    public void updateFilm(Film oldFilm, Film newFilm) {
        int index = films.indexOf(oldFilm);
        if (index != -1) {
            films.set(index, newFilm);
        }
    }

    public List<Film> searchByTitle(String title) {
        List<Film> results = new ArrayList<>();
        for (Film film : films) {
            if (film.getTitle().equals(title)) {
                results.add(film);
            }
        }
        return results;
    }

    public List<Film> searchByReleaseYear(int releaseYear) {
        List<Film> results = new ArrayList<>();
        for (Film film : films) {
            if (film.getReleaseYear() == releaseYear) {
                results.add(film);
            }
        }
        return results;
    }

    public List<Film> searchByGenres(List<String> genres) {
        List<Film> results = new ArrayList<>();
        for (Film film : films)
            if (film.getGenres().containsAll(genres)) {
                results.add(film);
            }
        return results;
    }

}
