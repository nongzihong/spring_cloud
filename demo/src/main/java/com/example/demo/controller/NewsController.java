package com.example.demo.controller;


import com.example.demo.entity.News;
import com.example.demo.service.Impl.NewsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController{


    @Autowired
    private NewsServiceImp newsServiceImp;

    //查询
    @RequestMapping(value = "/listNews", method = RequestMethod.GET)
    public ResponseEntity getNews() {
        List<News> news = newsServiceImp.listAll();
        return ResponseEntity.ok(news);
    }


}
