package consultations.cons25_01;

import consultations.cons25_01.entity.Film;
import consultations.cons25_01.repository.FilmRepository;

public class FilmApp {
    public static void main(String[] args) {

        FilmRepository repository = new FilmRepository();

        Film film1 = new Film("title1", "genre1", "director1");
        Film film2 = new Film("film2","genre1", "director2");

    }
}
