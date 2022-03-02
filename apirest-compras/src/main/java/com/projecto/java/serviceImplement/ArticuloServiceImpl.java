package com.projecto.java.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.projecto.java.Dao.ArticuloRepository;
import com.projecto.java.entity.Articulo;
import com.projecto.java.service.ArticuloService;

public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	private ArticuloRepository articuloRepository;
	
	@Override
	@Transactional(readOnly=true)
	public List<Articulo> findAll() {
		return (List<Articulo>) articuloRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Articulo findById(Long id_articulo) {
		// TODO Auto-generated method stub
		return articuloRepository.findById(id_articulo).orElse(null);
	}

	@Override
	@Transactional
	public Articulo save(Articulo articulo) {
		return articuloRepository.save(articulo);
	}

	@Override
	@Transactional
	public void delete(Long id_articulo) {
		articuloRepository.deleteById(id_articulo);
		
	}

}
