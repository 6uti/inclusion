package com.prueba.inclusion.inclusion.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageNotReadableException;

import java.util.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationErrors(MethodArgumentNotValidException ex) {
        Map<String, String> errores = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            String campo = error.getField();
            String mensaje = error.getDefaultMessage();
            errores.put(campo, mensaje);
        });
        return new ResponseEntity<>(errores, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<?> handleJsonParseError(HttpMessageNotReadableException ex) {
	    return ResponseEntity.badRequest().body("Formato de entrada no válido: se esperaba un número.");
	}

}
