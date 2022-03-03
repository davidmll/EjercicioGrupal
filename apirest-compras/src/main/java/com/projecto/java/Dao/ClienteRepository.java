package com.projecto.java.Dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projecto.java.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

	public Optional<Cliente> findByNombre(String nombre);
}
