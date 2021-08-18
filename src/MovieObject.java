public class MovieObject {
    String title;
    String genre;
    int rating;
    void PlayIt(){
        System.out.println("Playing the movie");
    }
}
class MovieTest {
    public static void main(String[] args) {
        MovieObject one = new MovieObject();
        one.title = "Gone in 60 Seconds";
        one.genre = "Adventure";
        one.rating = 4;
        MovieObject two = new MovieObject();
        two.title = "Avengers";
        two.genre = "Action";
        two.rating = 5;
        MovieObject three = new MovieObject();
        three.title = "Conjuring";
        three.genre = "Horror";
        three.rating = 3;

    }
}

