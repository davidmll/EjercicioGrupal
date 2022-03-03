package com.projecto.java.service;

import java.util.List;
import java.util.Optional;

import com.projecto.java.entity.Cliente;

public interface ClienteService {
	public List<Cliente> findAll();
	public Cliente findById(Long codCliente);	
	public Cliente save(Cliente cliente);
	public void delete(Long codCliente);
	public Cliente deleteConRetorno(Long codCliente);
	public Optional<Cliente> findByNombre(String nombre);
}
