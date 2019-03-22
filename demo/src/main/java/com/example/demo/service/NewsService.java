package com.example.demo.service;


import com.example.demo.entity.News;

import java.util.List;


public interface NewsService {
    List<News> listAll();
    void add (News news);
    void del (int id);
    void update(News news);
}
