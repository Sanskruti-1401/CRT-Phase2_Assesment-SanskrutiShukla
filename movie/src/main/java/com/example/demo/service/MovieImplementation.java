package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepo;

@Service
public class MovieImplementation implements MovieService {

    @Autowired
    private MovieRepo repository;

    @Override
    public Movie save(Movie obj) {
        return repository.save(obj);
    }

    @Override
    public List<Movie> getAll() {
        return repository.findAll();
    }

    @Override
    public Movie getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Movie update(Movie obj) {
        return repository.save(obj);
    }
    @Override
    public String delete(int id) {
        repository.deleteById(id);
        return "Deleted Successfully";
    }

}
