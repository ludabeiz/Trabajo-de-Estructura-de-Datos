package com.epn;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Punto");		
		Punto punto = coordPunto();
		JOptionPane.showMessageDialog(null, punto.toString());
		JOptionPane.showMessageDialog(null, "Linea\n Ingrese las coordenadas de X , Y");
		Punto linea1= new Linea(coordPunto(), coordPunto());
		JOptionPane.showMessageDialog(null, linea1 );
		
	}

	
	public static Punto coordPunto(){
		Punto aux;
		String linea= JOptionPane.showInputDialog("PUNTO\nIngrese las coordenadas en X , Y");
		StringTokenizer tokens= new StringTokenizer(linea, ",");
		int x= Integer.parseInt(tokens.nextToken());
		int y= Integer.parseInt(tokens.nextToken());
		aux= new Punto(x,y);
		return aux;
	}
}



	
		
