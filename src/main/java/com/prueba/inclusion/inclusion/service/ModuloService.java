package com.prueba.inclusion.inclusion.service;

import org.springframework.stereotype.Service;

import com.prueba.inclusion.inclusion.dto.TestCaseRequest;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ModuloService {

    public List<Integer> computeResults(List<TestCaseRequest> testCases) {
        return testCases.stream()
                .map(tc -> {
                    int x = tc.getX();
                    int y = tc.getY();
                    int n = tc.getN();
                    return n - (n - y) % x;
                })
                .collect(Collectors.toList());
    }
}
