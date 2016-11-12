package com.epn;

public class Linea extends Punto{

	Punto coordenada1;
	Punto coordenada2;
	
	public Linea() {
		super();
		coordenada1=new Punto();
		coordenada2= new Punto();
	}
	public Linea(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public Linea(Punto coordenada1, Punto coordenada2) {
		super();
		this.coordenada1 = coordenada1;
		this.coordenada2 = coordenada2;
	}
	public Punto getCoordenada1() {
		return coordenada1;
	}
	public void setCoordnada1(Punto coordenada1) {
		this.coordenada1 = coordenada1;
	}
	public Punto getCoordenada2() {
		return coordenada2;
	}
	public void setCoordenada2(Punto coordenada2) {
		this.coordenada2 = coordenada2;
	}
	
	public double distancia(){	
		double d;
		d= Math.hypot(coordenada1.getY()-coordenada2.getY(), coordenada1.getX()-coordenada2.getX());
		return d;
	}
	@Override
	public String toString() {
		return "Linea [coord1=" + coordenada1.toString() + ", coord2=" + coordenada2.toString() + "]"
				+"\n y la distancia es: "+ distancia() ;
	}		
}