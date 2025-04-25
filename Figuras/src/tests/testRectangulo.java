package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Rectangulo;

class testRectangulo {

	@Test
	void testPerimetro() {
		Rectangulo r = new Rectangulo(1,2);
		int perimetroEsperado = 6;
		int perimetroObtenido = r.perimetro();
		assertEquals(perimetroEsperado, perimetroObtenido);
	}

	@Test
	void testArea() {
		Rectangulo r = new Rectangulo(1,2);
		int areaEsperada = 2;
		int areaObtenida = r.area()+1;
		assertEquals(areaEsperada, areaObtenida);
	}

}
