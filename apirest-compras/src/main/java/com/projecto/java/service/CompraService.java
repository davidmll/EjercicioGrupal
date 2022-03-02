package com.projecto.java.service;

import java.util.List;

import com.projecto.java.entity.Compra;

public interface CompraService {

	public List<Compra> findAll();

	public Compra findById(Long id);

	public Compra save(Compra compra);

	public void delete(Long id);
}