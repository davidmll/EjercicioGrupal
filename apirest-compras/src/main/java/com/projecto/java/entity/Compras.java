package com.projecto.java.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="compras")
public class Compras implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToMany(cascade = CascadeType.ALL)
	
	private Long codCliente;
	@ManyToMany(cascade = CascadeType.ALL)
	private Long id_articulo;
	
	private Date fecha;
	private int unidades;
	
	public Long getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Long codCliente) {
		this.codCliente = codCliente;
	}
	public Long getId_articulo() {
		return id_articulo;
	}
	public void setId_articulo(Long id_articulo) {
		this.id_articulo = id_articulo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	

}
