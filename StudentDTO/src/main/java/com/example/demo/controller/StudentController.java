package com.example.demo.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @PostMapping
    public ResponseEntity<?> createStudent(
            @Valid @RequestBody StudentDTO studentDTO,
            BindingResult result) {

        if (result.hasErrors()) {
            return ResponseEntity
                    .badRequest()
                    .body(result.getFieldError().getDefaultMessage());
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Student created successfully");
    }
}
