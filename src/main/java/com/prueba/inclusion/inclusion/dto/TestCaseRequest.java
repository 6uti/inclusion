package com.prueba.inclusion.inclusion.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.prueba.inclusion.inclusion.exception.BlankToNullIntegerDeserializer;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class TestCaseRequest {
	@NotNull(message = "El valor x es obligatorio")
	@Min(value = 0, message = "El valor x siempre debe tener valores numericos")
	@PositiveOrZero(message = "Debe ser mayor o igual a cero")
	@JsonDeserialize(using = BlankToNullIntegerDeserializer.class)
    private int x;
	
	@NotNull(message = "El valor y es obligatorio")
	@Min(value = 0, message = "El valor y siempre debe tener valores numericos")
	@PositiveOrZero(message = "Debe ser mayor o igual a cero")
	@JsonDeserialize(using = BlankToNullIntegerDeserializer.class)
    private int y;
	
	@NotNull(message = "El valor n es obligatorio")
	@Min(value = 0, message = "El valor n siempre debe tener valores numericos")
	@PositiveOrZero(message = "Debe ser mayor o igual a cero")
	@JsonDeserialize(using = BlankToNullIntegerDeserializer.class)
    private int n;

	public TestCaseRequest(int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
    }
	public TestCaseRequest() {
		// TODO Auto-generated constructor stub
	}
	// Getters and setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int getN() { return n; }
    public void setN(int n) { this.n = n; }
}