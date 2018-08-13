package com.hand.demo.dao;

import com.hand.demo.domain.Film;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmDao {

    List<Film> findAllFilm();
}
