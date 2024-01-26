package consultations.cons25_01.service;

import consultations.cons25_01.entity.Film;
import consultations.cons25_01.repository.FilmRepository;

import java.util.ArrayList;
import java.util.List;

public class FilmFinderByGenre {
    private final FilmFinderByGenre matcher;

    public FilmFinderByGenre(FilmFinderByGenre matcher) {
        this.matcher = matcher;
    }

    public List<Film> findFilmsByGenre(String genre, FilmRepository repository){

        List<Film> filmsByGenre = new ArrayList<>();
        for (Film film : repository.getFilms()) {
            if(film.getGenre().equals(genre)){
                filmsByGenre.add(film);
            }
        }
        return filmsByGenre;
    }
}
