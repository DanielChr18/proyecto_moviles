package com.proyecto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entidad.Favorito;
import com.proyecto.servicio.FavoritoServicio;

@RestController
@RequestMapping("/favorito")
public class FavoritoRest {
	
	@Autowired
	private FavoritoServicio servico;

	@GetMapping("/lista")
	@ResponseBody
	public List<Favorito> lista() {
		return servico.listar();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody Favorito bean) {
		servico.registrar(bean);
	}

	@PutMapping("/modificar")
	public void modificar(@RequestBody Favorito bean) {
		servico.modificar(bean);
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") int id) {
		servico.eliminar(id);
	}

	@GetMapping("/consultaUsuario/{usuario}")
	@ResponseBody
	public List<Favorito> consultaUsuario(int usuario) {
		return servico.consultaUsuario(usuario);
	}
}
