package com.example.internship_mini_project.entities;

import lombok.Builder;

import java.time.LocalDateTime;


public record ExceptionResponse(String path,
                                String message,
                                int statusCode,
                                LocalDateTime localDateTime) {
}
