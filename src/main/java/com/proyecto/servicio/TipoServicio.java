package com.proyecto.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.TipoDAO;
import com.proyecto.entidad.Tipo;

@Service
public class TipoServicio {

	@Autowired
	private TipoDAO dao;
	
	public List<Tipo> listar() {
		return dao.findAll();
	}
}
