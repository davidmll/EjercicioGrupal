package com.projecto.java.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projecto.java.Dao.ArticuloRepository;
import com.projecto.java.entity.Articulo;
import com.projecto.java.service.ArticuloService;

public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	private ArticuloRepository articuloRepository;
	
	@Override
	public List<Articulo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo findById(Long id_articulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo save(Articulo articulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id_articulo) {
		// TODO Auto-generated method stub
		
	}

}
