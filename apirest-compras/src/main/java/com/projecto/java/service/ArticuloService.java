package com.projecto.java.service;

import java.util.List;
import java.util.Optional;

import com.projecto.java.entity.Articulo;



public interface ArticuloService {
	
	public List<Articulo> findAll();
	
	public Articulo findById(Long codArticulo);
	
	public Articulo save(Articulo codArticulo);
	
	public void delete(Long codArticulo);
	
	public Optional<Articulo> findByNombre(String nombre);
	
}