package com.proyecto.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.UsuarioDAO;
import com.proyecto.entidad.Usuario;

@Service
public class UsuarioServicio {

	@Autowired
	private UsuarioDAO dao;
	
	public List<Usuario> listar() {
		return dao.findAll();
	}

	public void registrar(Usuario bean) {
		dao.save(bean);
	}

	public void modificar(Usuario bean) {
		dao.save(bean);
	}

	public void eliminar(int id) {
		dao.deleteById(id);
	}
}
