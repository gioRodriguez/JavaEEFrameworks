package com.tecgurus.whattimeisit.webii.models;

public class HelloWorldModel {
	private String nombre;

	private int userId;

	private String[] sabores;
	
	private String saborSelecionado;

	private boolean mayor;
	
	private PadreModel padreModel;

	public PadreModel getPadreModel() {
		return padreModel;
	}

	public void setPadreModel(PadreModel padreModel) {
		this.padreModel = padreModel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String[] getSabores() {
		return sabores;
	}

	public void setSabores(String[] sabores) {
		this.sabores = sabores;
	}

	public boolean isMayor() {
		return mayor;
	}

	public void setMayor(boolean mayor) {
		this.mayor = mayor;
	}

	public String getSaborSelecionado() {
		return saborSelecionado;
	}

	public void setSaborSelecionado(String saborSelecionado) {
		this.saborSelecionado = saborSelecionado;
	}
}
