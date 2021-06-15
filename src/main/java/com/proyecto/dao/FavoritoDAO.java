package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.entidad.Favorito;

public interface FavoritoDAO extends JpaRepository<Favorito, Integer> {

	@Query("select f from Favorito f where f.usuario.idUsuario = :param_usuario")
	List<Favorito> consultaUsuario(@Param("param_usuario") int usuario);
}
