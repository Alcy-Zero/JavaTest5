package com.hand.demo.service.Impl;

import com.github.pagehelper.PageHelper;
import com.hand.demo.dao.FilmDao;
import com.hand.demo.domain.Film;
import com.hand.demo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmDao filmDao;

    public List<Film> findAllFilm(int pageNum,int pageSize) {
        //手动分页
        PageHelper.startPage(pageNum, pageSize);
        return filmDao.findAllFilm();
    }
}
