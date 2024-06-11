package oopAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Movie {
    private String title,studio,rating ;


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

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public static Movie[] getPGArray(Movie[] movies){
        if (movies==null)
            throw new IllegalArgumentException("input array can't be null");


        Movie[] moviesPG = new Movie[movies.length];
        int j =0;
        for (int i=0;i<movies.length;i++)
            if (movies[i].rating.equalsIgnoreCase("PG"))
                moviesPG[j++] = movies[i];

        return moviesPG;

    }

    public static ArrayList<Movie> getPGArrayList(Movie[] movies){
        if (movies==null)
            throw new IllegalArgumentException("input array can't be null");


        ArrayList<Movie> moviesListPG = new ArrayList<>();
        for (Movie movie:movies)
            if (movie.rating.equalsIgnoreCase("PG"))
                moviesListPG.add(movie);

        return moviesListPG;

    }

    public static List<Movie> getPGList(Movie[] movies){
        if (movies==null)
            throw new IllegalArgumentException("input array can't be null");


        var moviesListPG = Arrays.stream(movies)
                .filter(movie -> movie.rating.equalsIgnoreCase("pg"))
                .collect(Collectors.toList());

        return moviesListPG;

    }
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royal","Eon Productions","PG");
        Movie movie2 = new Movie("Casino Royal","Eon Productions","PG13");
        Movie[] movies = new Movie[]{movie1,movie2,movie2,movie1};

        try {
            var moviesPG = Movie.getPGList(movies);
            for (Movie m:moviesPG){
                System.out.println(m);
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}