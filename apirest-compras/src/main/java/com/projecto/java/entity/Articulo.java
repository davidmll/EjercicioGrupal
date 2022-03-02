package com.projecto.java.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="articulos")
public class Articulo implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codArticulo;

	private int unidades_stock;
	private int stock_seguridad;
	
	private String imagen;
	private String descripcion;
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private double precio_unidad;
	
	@OneToMany(mappedBy = "articulo")
	private Set<Compra> compras;
	
//	Getters and Setters


	public String getNombre() {
		return nombre;
	}

	public Long getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(Long codArticulo) {
		this.codArticulo = codArticulo;
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

	public Set<Compra> getCompras() {
		return compras;
	}
	
	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}
	
}
