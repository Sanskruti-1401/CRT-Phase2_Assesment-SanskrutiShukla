package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;

@Service
public interface MovieService {

    Movie save(Movie obj);

    List<Movie> getAll();

    Movie getById(int id);

    Movie update(Movie obj);

    String delete(int id);
}
