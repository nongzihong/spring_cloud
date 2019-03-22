package com.example.demo.dao;

import com.example.demo.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsMapper extends JpaRepository<News,Integer> {
}
