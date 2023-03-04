import java.util.ArrayList;
import java.util.List;

public class Film {


        private String title;
        private int releaseYear;
        private List<String> genres;
        private double rating;
        private List<String> directors;
        private List<String> producers;
        private List<String> cast;

        public Film(String title, int releaseYear, List<String> genres, double rating) {
            this.title = title;
            this.releaseYear = releaseYear;
            this.genres = genres;
            this.rating = rating;
            this.directors = new ArrayList<>();
            this.producers = new ArrayList<>();
            this.cast = new ArrayList<>();
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public List<String> getDirectors() {
            return directors;
        }

        public void setDirectors(List<String> directors) {
            this.directors = directors;
        }

        public List<String> getProducers() {
            return producers;
        }

        public void setProducers(List<String> producers) {
            this.producers = producers;
        }

        public List<String> getCast() {
            return cast;
        }

        public void setCast(List<String> cast) {
            this.cast = cast;
        }

        @Override
        public String toString() {
            return "Title: " + title +
                    "\nRelease year: " + releaseYear +
                    "\nGenres: " + genres +
                    "\nRating: " + rating +
                    "\nDirectors: " + directors +
                    "\nProducers: " + producers +
                    "\nCast: " + cast;
        }
    }





