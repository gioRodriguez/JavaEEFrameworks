package com.tecgurus.whattimeisit.webii.models;

import java.util.List;

public class PadreModel {
	private String nombrePadre;

	private List<HijoModel> hijosModel;

	public String getNombrePadre() {
		return nombrePadre;
	}

	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}

	public List<HijoModel> getHijosModel() {
		return hijosModel;
	}

	public void setHijosModel(List<HijoModel> hijosModel) {
		this.hijosModel = hijosModel;
	}
}
