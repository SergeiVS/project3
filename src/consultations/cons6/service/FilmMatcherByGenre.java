package consultations.cons25_01.service;

import consultations.cons25_01.entity.Film;

public class FilmMatcherByGenre implements FilmMatcher{
    private String genre;
    @Override
    public boolean match(Film film) {
        return film.getGenre().equals(genre);
    }
}
