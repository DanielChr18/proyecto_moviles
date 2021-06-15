package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.entidad.Plato;

public interface PlatoDAO extends JpaRepository<Plato, Integer> {

	public abstract List<Plato> findByNombre(String nombre);
}
