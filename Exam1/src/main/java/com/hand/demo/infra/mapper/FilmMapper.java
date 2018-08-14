package com.hand.demo.infra.mapper;

import com.hand.demo.domain.entity.Film;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmMapper {

    List<Film> findAllFilm();
}
