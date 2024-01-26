package consultations.cons25_01.service;

import consultations.cons25_01.entity.Film;

public class FilmMatcherByDirector implements FilmMatcher{

    public FilmMatcherByDirector(String director) {
        this.director = director;
    }

    private String director;

    @Override
    public boolean match(Film film) {
        return film.getDirector().equals(director);
    }
}
