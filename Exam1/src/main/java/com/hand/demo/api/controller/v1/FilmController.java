package com.hand.demo.api.controller.v1;


import com.hand.demo.DemoApplication;
import com.hand.demo.domain.entity.Film;
import com.hand.demo.domain.Page;
import com.hand.demo.api.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/films")
public class FilmController {

    protected static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @Autowired
    private FilmService filmService;

    @GetMapping("/list")
    //http://localhost:9090/v1/films/list?pageNum=5&pageSize=3(参数有默认值，可不传)
    public List<Film> findAllFilm(Page page) {
        //查看sort的值
        logger.debug("页码："+page.getPageNum());
        logger.debug("每页："+page.getPageSize());
        logger.debug("排序"+page.getSort());
        return filmService.findAllFilm(page);
    }
}
