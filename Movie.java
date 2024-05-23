package oopAssignment;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public static Movie[] getPG(Movie[] movies){
        if (movies==null||movies.length==0){
            return null;
        }
        ArrayList<Movie> PGMovies = new ArrayList<>(movies.length);
        for (Movie movie:movies)
            if (movie.rating.equals("PG"))
                PGMovies.add(movie);

        return (Movie[]) PGMovies.toArray();

    }

    public static void main(String[] args) {
        Movie movie = new Movie("“Casino Royal","Eon Productions","PG13");
    }
}