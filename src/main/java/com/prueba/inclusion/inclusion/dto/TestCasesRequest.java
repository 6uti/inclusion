package com.prueba.inclusion.inclusion.dto;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class TestCasesRequest {
	
	@NotNull(message = "testCases no puede ser nulo")
	@NotEmpty(message = "Debe enviar al menos un caso de prueba")
    @Valid
    private List<@Valid TestCaseRequest> testCases;
	
	public TestCasesRequest() {
	    this.testCases = new ArrayList<>();
	}

    public TestCasesRequest(List<TestCaseRequest> testCases2) {
    	this.testCases = testCases2;
	}

	public List<TestCaseRequest> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<TestCaseRequest> testCases) {
        this.testCases = testCases;
    }
}
