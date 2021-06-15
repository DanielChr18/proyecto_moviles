package com.proyecto.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.PlatoDAO;
import com.proyecto.entidad.Plato;

@Service
public class PlatoServicio {

	@Autowired
	private PlatoDAO dao;

	public List<Plato> listar() {
		return dao.findAll();
	}

	public void registrar(Plato bean) {
		dao.save(bean);
	}

	public void modificar(Plato bean) {
		dao.save(bean);
	}

	public void eliminar(int id) {
		dao.deleteById(id);
	}

	public Plato consultaID(int id) {
		return dao.findById(id).get();
	}

	public List<Plato> consultaNombre(String nombre) {
		return dao.findByNombre(nombre);
	}
}
