package com.tecgurus.whattimeisit.data.layer.model;

// Generated Jul 1, 2013 8:45:16 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Movimiento generated by hbm2java
 */
@Entity
@Table(name = "Movimiento")
public class Movimiento implements java.io.Serializable {

	private Integer idMovimiento;
	private Date fecha;
	private BigDecimal monto;
	private int idCuenta;
	private int idTipoMovimiento;

	public Movimiento() {
	}

	public Movimiento(Date fecha, BigDecimal monto, int idCuenta,
			int idTipoMovimiento) {
		this.fecha = fecha;
		this.monto = monto;
		this.idCuenta = idCuenta;
		this.idTipoMovimiento = idTipoMovimiento;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idMovimiento", unique = true, nullable = false)
	public Integer getIdMovimiento() {
		return this.idMovimiento;
	}

	public void setIdMovimiento(Integer idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "monto", nullable = false, precision = 9)
	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	@Column(name = "idCuenta", nullable = false)
	public int getIdCuenta() {
		return this.idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	@Column(name = "idTipoMovimiento", nullable = false)
	public int getIdTipoMovimiento() {
		return this.idTipoMovimiento;
	}

	public void setIdTipoMovimiento(int idTipoMovimiento) {
		this.idTipoMovimiento = idTipoMovimiento;
	}

}
