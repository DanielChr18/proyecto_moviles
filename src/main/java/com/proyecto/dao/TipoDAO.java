package com.proyecto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.entidad.Tipo;

public interface TipoDAO extends JpaRepository<Tipo, Integer> {

}
