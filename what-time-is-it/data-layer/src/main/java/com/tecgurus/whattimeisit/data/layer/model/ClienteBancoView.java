package com.tecgurus.whattimeisit.data.layer.model;

// Generated Jul 3, 2013 8:59:44 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ClienteBancoView generated by hbm2java
 */
@Entity
@Table(name = "ClienteBancoView")
public class ClienteBancoView implements java.io.Serializable {

	private ClienteBancoViewId id;

	public ClienteBancoView() {
	}

	public ClienteBancoView(ClienteBancoViewId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCliente", column = @Column(name = "idCliente", nullable = false)),
			@AttributeOverride(name = "clienteNombre", column = @Column(name = "clienteNombre", nullable = false, length = 50)),
			@AttributeOverride(name = "appMaterno", column = @Column(name = "appMaterno", nullable = false, length = 50)),
			@AttributeOverride(name = "appPaterno", column = @Column(name = "appPaterno", nullable = false, length = 30)),
			@AttributeOverride(name = "clienteEdad", column = @Column(name = "clienteEdad", nullable = false)),
			@AttributeOverride(name = "idBanco", column = @Column(name = "idBanco", nullable = false)),
			@AttributeOverride(name = "bancoNombre", column = @Column(name = "bancoNombre", nullable = false, length = 50)) })
	public ClienteBancoViewId getId() {
		return this.id;
	}

	public void setId(ClienteBancoViewId id) {
		this.id = id;
	}

}
