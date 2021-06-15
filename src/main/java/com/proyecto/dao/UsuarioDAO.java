package com.proyecto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.entidad.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

}
