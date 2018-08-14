package com.hand.demo.api.service.Impl;


import com.github.pagehelper.PageHelper;
import com.hand.demo.api.service.FilmService;
import com.hand.demo.infra.mapper.FilmMapper;
import com.hand.demo.domain.entity.Film;
import com.hand.demo.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    public List<Film> findAllFilm(Page page) {
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        return filmMapper.findAllFilm();
    }
}
