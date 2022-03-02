package com.projecto.java.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codArticulo;

	private int unidades_stock;
	private int stock_seguridad;

	private String imagen;
	private String descripcion;

	@OneToMany(mappedBy = "articulo")
	private Set<Compra> compras;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private double precio_unidad;

	public Long getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(Long codArticulo) {
		this.codArticulo = codArticulo;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(double precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

}
