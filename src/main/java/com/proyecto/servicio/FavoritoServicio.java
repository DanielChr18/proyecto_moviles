package com.proyecto.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.FavoritoDAO;
import com.proyecto.entidad.Favorito;

@Service
public class FavoritoServicio {
	
	@Autowired
	private FavoritoDAO dao;

	public List<Favorito> listar() {
		return dao.findAll();
	}

	public void registrar(Favorito bean) {
		dao.save(bean);
	}

	public void modificar(Favorito bean) {
		dao.save(bean);
	}

	public void eliminar(int id) {
		dao.deleteById(id);
	}

	public List<Favorito> consultaUsuario(int usuario) {
		return dao.consultaUsuario(usuario);
	}
}
