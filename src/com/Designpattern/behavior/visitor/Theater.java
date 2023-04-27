 package src.com.Designpattern.behavior.visitor;

 import java.util.ArrayList;
 import java.util.List;

 public class Theater {

    private List<Movie> movieList = new ArrayList<>();

    public void add(Movie movie){
        movieList.add(movie);
    }

    public void remove(Movie movie){
        movieList.remove(movie);
    }

    public void accept(Visitor visitor){
        for (Movie movie : movieList) {
            movie.accept(visitor);
        }
    }
}
