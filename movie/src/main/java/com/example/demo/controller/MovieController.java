package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping("/add")
    public Movie add(@RequestBody Movie obj) {
        return service.save(obj);
    }

    @GetMapping("/all")
    public List<Movie> getAll() {
        return service.getAll();
    }

    @GetMapping("/find/{id}")
    public Movie getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/update")
    public Movie update(@RequestBody Movie obj) {
        return service.update(obj);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return service.delete(id);
    }
}

