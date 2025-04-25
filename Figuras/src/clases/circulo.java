package clases;

public class circulo {
	double pi;
	double radio;
	
	public circulo(int radio) {
		pi = Math.PI;
		this.radio = radio;
	}
	/**
	 * Calcula el area de un circulo
	 * @return el area del circulo calculada
	 * */
	public double area() {
		return (pi* Math.pow(radio, 2));
	}
	/**
	 * Calcula el perimetro de un circulo
	 * @return el perimetro del circulo calculada
	 * */
	public double perimetro() {
		return (2 * pi)* radio;
	}
}
