package com.projecto.java.service;

import java.util.List;

import com.projecto.java.entity.Articulo;



public interface ArticuloService {
	
	public List<Articulo> findAll();
	
	public Articulo findById(Long id_articulo);
	
	public Articulo save(Articulo articulo);
	
	public void delete(Long id_articulo);
	
	
	
}