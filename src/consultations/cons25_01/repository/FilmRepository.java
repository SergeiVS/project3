package consultations.cons25_01.repository;

import consultations.cons25_01.entity.Film;

import java.util.ArrayList;
import java.util.List;

public class FilmRepository {

    private List<Film> films;

    public FilmRepository() {
        this.films = new ArrayList<>();
    }

    public List<Film> getFilms() {
        return films;
    }
}
