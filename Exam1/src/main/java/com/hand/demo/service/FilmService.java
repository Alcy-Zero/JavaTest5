package com.hand.demo.service;

import com.hand.demo.domain.Film;

import java.util.List;

public interface FilmService {
    List<Film> findAllFilm(int pageNum,int pageSize);
}
