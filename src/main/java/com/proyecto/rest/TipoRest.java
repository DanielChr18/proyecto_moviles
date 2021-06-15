package com.proyecto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entidad.Tipo;
import com.proyecto.servicio.TipoServicio;

@RestController
@RequestMapping("/tipo")
public class TipoRest {

	@Autowired
	private TipoServicio servico;
	
	@GetMapping("/lista")
	@ResponseBody
	public List<Tipo> lista(){
		return servico.listar();
	}
	
}
