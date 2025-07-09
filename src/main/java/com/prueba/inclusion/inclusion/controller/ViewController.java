package com.prueba.inclusion.inclusion.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prueba.inclusion.inclusion.dto.TestCaseRequest;
import com.prueba.inclusion.inclusion.dto.TestCasesRequest;
import com.prueba.inclusion.inclusion.service.ModuloService;

@Controller
public class ViewController {
	
	@Autowired
    private ModuloService moduloService;
	
	@GetMapping("/")
    public String showForm(Model model) {
        // Preparamos un TestCasesRequest con una lista vacía de 3 inputs por defecto
        List<TestCaseRequest> cases = Arrays.asList(new TestCaseRequest(7,5,12345),new TestCaseRequest(5,0,4),new TestCaseRequest(10,5,15),new TestCaseRequest(17,8,54321),new TestCaseRequest(499999993,9,1000000000), new TestCaseRequest(10,5,187), new TestCaseRequest(2,0,999999999));
        model.addAttribute("request", new TestCasesRequest(cases));
        return "index.html";
    }
    
    @PostMapping("/solve-form")
    public String solveForm(@ModelAttribute TestCasesRequest request, Model model) {
        List<Integer> results = moduloService.computeResults(request.getTestCases());
        model.addAttribute("results", results);
        return "result";
    }
	
}
