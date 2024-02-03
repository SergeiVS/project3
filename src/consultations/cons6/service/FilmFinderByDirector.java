package consultations.cons25_01.service;

import consultations.cons25_01.entity.Film;
import consultations.cons25_01.repository.FilmRepository;

import java.util.ArrayList;
import java.util.List;

public class FilmFinderByDirector {

    private final FilmFinderByDirector matcher;
    public FilmFinderByDirector(FilmFinderByDirector matcher) {
        this.matcher = matcher;
    }

    public List<Film> findFilmsByDirector(String director, FilmRepository repository){

        List<Film> filmsByGenre = new ArrayList<>();
        for (Film film : repository.getFilms()) {
            if(film.getGenre().equals(director)){
                filmsByGenre.add(film);
            }
        }
        return filmsByGenre;
    }
}

