package com.example.spring_boot_autorization_service.advice;

import com.example.spring_boot_autorization_service.exception.UnauthorizedUser;
import com.example.spring_boot_autorization_service.exception.InvalidCredentials;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("com.example.spring_boot_autorization_service.exception")
public class ControllerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> icHandler(RuntimeException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> uuHandler(RuntimeException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}