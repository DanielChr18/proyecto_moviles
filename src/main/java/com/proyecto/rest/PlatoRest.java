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

import com.proyecto.entidad.Plato;
import com.proyecto.servicio.PlatoServicio;

@RestController
@RequestMapping("/plato")
public class PlatoRest {

	@Autowired
	private PlatoServicio servico;

	@GetMapping("/lista")
	@ResponseBody
	public List<Plato> lista() {
		return servico.listar();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody Plato bean) {
		servico.registrar(bean);
	}

	@PutMapping("/modificar")
	public void modificar(@RequestBody Plato bean) {
		servico.modificar(bean);
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") int id) {
		servico.eliminar(id);
	}

	@GetMapping("/consultaNombre/{nombre}")
	@ResponseBody
	public List<Plato> consultaNombre(@PathVariable("nombre") String nombre) {
		return servico.consultaNombre(nombre);
	}

	@GetMapping("/consultaNombre/{id}")
	@ResponseBody
	public Plato consultaId(@PathVariable("id") int id) {
		return servico.consultaID(id);
	}
}
