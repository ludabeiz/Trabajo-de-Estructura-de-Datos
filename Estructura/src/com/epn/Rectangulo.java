package com.epn;

public class Rectangulo extends Figura {
	
	private Punto origen;
	private int alto;
	private int ancho;
	
	public Rectangulo() {
		super();
	}
	public Rectangulo(Punto origen, int alto, int ancho) {
		super();
		this.origen = new Punto();
		this.alto = alto;
		this.ancho = ancho;
	}
	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	@Override
	public double calArea() {
	
		return alto*ancho;
	}
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
}