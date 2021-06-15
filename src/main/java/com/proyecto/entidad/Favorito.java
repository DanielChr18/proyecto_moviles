package com.proyecto.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "favorito")
public class Favorito implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idfavorito")
	private int idFavorito;

	@ManyToOne
	@JoinColumn(name = "idplato")
	private Plato plato;

	@ManyToOne
	@JoinColumn(name = "idusuario")
	private Usuario usuario;

	public int getIdFavorito() {
		return idFavorito;
	}

	public void setIdFavorito(int idFavorito) {
		this.idFavorito = idFavorito;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
