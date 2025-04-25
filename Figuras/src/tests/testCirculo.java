package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.circulo;

class testCirculo {

	@Test
	void testArea() {
		circulo c = new circulo(2);
		double areaEsperada = 12.57;
		double areaObtenida = Math.round(c.area() * 100.0)/ 100.0;
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testPerimetro() {
		circulo c = new circulo(2);
		double perimetroEsperado = 12.57;
		double perimetroObtenido = Math.round(c.perimetro() * 100.0)/ 100.0;
		assertEquals(perimetroEsperado, perimetroObtenido);
	}

}
