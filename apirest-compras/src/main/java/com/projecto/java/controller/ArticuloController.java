package com.projecto.java.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projecto.java.entity.Articulo;
import com.projecto.java.service.ArticuloService;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	private ArticuloService servicio;
	
	@GetMapping({"/articulos","/todos"})
	public List<Articulo> index(){
		return servicio.findAll();
	}
	
	@GetMapping("articulos/{id}")
	public ResponseEntity<?>  findProductoById(@PathVariable Long codArticulo) {
		Articulo articulo = null;
		Map<String, Object> response=new HashMap<>();
		
		try {
			articulo = servicio.findById(codArticulo);
		}catch (DataAccessException e) {//MUY ESPECÍFICO, EXCEPCIONES SOBRE EL DAO
			response.put("mensaje", "Error al rellenar la consulta a base de datos");
			response.put("error", e.getMessage().concat(e.getMostSpecificCause().getMessage()));
			
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(articulo ==null) {
		response.put("mensaje", "El Código de articulo: ".concat(codArticulo.toString().concat(" no existe en la base de datos")));
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		
		}
		return new ResponseEntity<Articulo>(articulo, HttpStatus.OK);
	}
	
	
	
	
}
