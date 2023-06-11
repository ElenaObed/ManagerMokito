import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerMovieTest {

    @Test
    public void addMoviesAddOne() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.allFilm();

        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void addMoviesAddZero() {
        ManagerMovie manager = new ManagerMovie();

        String[] expected = {};
        String[] actual = manager.allFilm();

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void addMoviesAddTree() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 1", "Film 2","Film 3"};
        String[] actual = manager.allFilm();

        Assertions.assertArrayEquals(expected,actual);

    }
    ManagerMovie manager = new ManagerMovie(3);
    @BeforeEach
    public void setup() {
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");

    }
    @Test
    public void lastMovieTree() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");


        String[] expected = {"Film 5","Film 4","Film 3", "Film 2","Film 1"};
        String[] actual = manager.lastFilm();

        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void lastMovieEqualLimit() {

        manager.addMovie("Film 3");



        String[] expected = {"Film 3","Film 2","Film 1"};
        String[] actual = manager.lastFilm();

        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void lastMovieAbovelLimit() {

        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");



        String[] expected = {"Film 5","Film 4","Film 3"};
        String[] actual = manager.lastFilm();

        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void lastMovieBelowlLimit() {

        String[] expected = {"Film 2","Film 1"};
        String[] actual = manager.lastFilm();

        Assertions.assertArrayEquals(expected,actual);

    }
}
