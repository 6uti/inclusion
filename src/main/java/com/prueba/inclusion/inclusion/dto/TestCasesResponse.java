package com.prueba.inclusion.inclusion.dto;

import java.util.List;

public class TestCasesResponse {
    private List<Integer> results;

    public TestCasesResponse(List<Integer> results) {
        this.results = results;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }
}
