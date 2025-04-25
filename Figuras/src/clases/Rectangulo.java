package clases;

public class Rectangulo {
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public int perimetro() {
		return 2* (this.base + this.altura);
	}
	
	public int getBase() {
		return this.base;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public int area() {
		return this.altura * this.base /2;
	}
	
	
}
