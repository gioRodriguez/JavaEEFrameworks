package com.tecgurus.whattimeisit.webii.models;

public class HijoModel {
	private static HijoModel instance;
	
	private String nombreHijo;
	
	private int edad;

	public String getNombreHijo() {
		return nombreHijo;
	}

	public void setNombreHijo(String nombreHijo) {
		this.nombreHijo = nombreHijo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
