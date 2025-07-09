package com.prueba.inclusion.inclusion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.inclusion.inclusion.dto.TestCaseRequest;
import com.prueba.inclusion.inclusion.service.ModuloService;

@SpringBootTest
class InclusionApplicationTests {
	
	private final ModuloService servicio = new ModuloService();

	@Test
    void testComputeResults() {
        // Arrange: crea datos de entrada
        List<TestCaseRequest> casos = List.of(
            new TestCaseRequest(7, 5, 12345),   // resultado esperado: 12339
            new TestCaseRequest(5, 0, 4),       // resultado esperado: 0
            new TestCaseRequest(10, 5, 15)      // resultado esperado: 15
        );

        // Act: ejecuta el método
        List<Integer> resultados = servicio.computeResults(casos);

        // Assert: verifica resultados esperados
        assertEquals(List.of(12339, 0, 15), resultados);
    }

}
