package com.prueba.inclusion.inclusion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prueba.inclusion.inclusion.dto.TestCasesRequest;
import com.prueba.inclusion.inclusion.dto.TestCasesResponse;
import com.prueba.inclusion.inclusion.service.ModuloService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class ModuloController {

    @Autowired
    private ModuloService moduloService;

    @PostMapping("/solve")
    public TestCasesResponse solveModulo(@RequestBody @Valid TestCasesRequest request) {
    	
        return new TestCasesResponse(moduloService.computeResults(request.getTestCases()));
    }
}
