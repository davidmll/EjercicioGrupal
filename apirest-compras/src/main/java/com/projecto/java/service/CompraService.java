package com.projecto.java.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.projecto.java.entity.Compra;

public interface CompraService {

	public List<Compra> findAll();

	public Compra findById(Long id);

	public Compra save(Compra compra);

	public void delete(Long id);
	
	public void deleteCompra(Compra c);
	
	public Optional<Compra> findByFecha(Date fecha);
}