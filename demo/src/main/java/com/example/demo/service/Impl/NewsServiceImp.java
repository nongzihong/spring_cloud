package com.example.demo.service.Impl;

import com.example.demo.dao.NewsMapper;
import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NewsServiceImp implements NewsService {


    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> listAll() {
        return newsMapper.findAll();
    }

    @Override
    public void add(News news) {
        newsMapper.save(news);

    }

    @Override
    public void del(int id) {
        newsMapper.deleteById(id);
    }

    @Override
    public void update(News news) {
        newsMapper.save(news);
    }
}
