package com.projecto.java.Dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projecto.java.entity.Articulo;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, Long> {

	public Optional<Articulo> findByNombre(String nombre);
}
