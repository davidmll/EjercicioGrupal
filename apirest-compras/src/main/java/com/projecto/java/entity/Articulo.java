package com.projecto.java.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulo implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@MapsId("codCliente")
	@JoinColumn(name = "codCliente")
	private Long codCliente;
	@ManyToOne 
	@MapsId("id_articulo") 
	@JoinColumn(name = "id_articulo") 
	private Long id_articulo;
	
	@Column(nullable=false)
	private String nombre;
	
	private String descripcion;
	
	@Column(nullable=false)
	private double precio_unidad;
	
	private int unidades_stock;
	private int stock_seguridad;
	
	private String imagen;

	public Long getId_articulo() {
		return id_articulo;
	}

	public void setId_articulo(Long id_articulo) {
		this.id_articulo = id_articulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(double precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	public int getUnidades_stock() {
		return unidades_stock;
	}

	public void setUnidades_stock(int unidades_stock) {
		this.unidades_stock = unidades_stock;
	}

	public int getStock_seguridad() {
		return stock_seguridad;
	}

	public void setStock_seguridad(int stock_seguridad) {
		this.stock_seguridad = stock_seguridad;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	
}
