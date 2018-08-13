package com.hand.demo.controller;

import com.hand.demo.DemoApplication;
import com.hand.demo.domain.Film;
import com.hand.demo.service.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {

    protected static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @Autowired
    private FilmService filmService;

    @RequestMapping(value = "/api/film/all", method = RequestMethod.GET)
    public List<Film> findAllFilm(@RequestParam("pagenum") int pageNum,@RequestParam("pagesize") int pageSize) {
        return filmService.findAllFilm(pageNum,pageSize);
    }
}
