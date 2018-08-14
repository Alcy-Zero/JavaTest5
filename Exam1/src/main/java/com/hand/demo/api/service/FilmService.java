package com.hand.demo.api.service;

import com.hand.demo.domain.entity.Film;
import com.hand.demo.domain.Page;

import java.util.List;

public interface FilmService {
    List<Film> findAllFilm(Page page);
}
