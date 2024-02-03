package consultations.cons25_01.repository;

import consultations.cons25_01.entity.Film;

public class RepositoryService {

    public void addFilmToRepository(Film film,FilmRepository repository){
        repository.getFilms().add(film);
    }

}
