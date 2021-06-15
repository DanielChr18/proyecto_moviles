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
@Table(name = "plato")
public class Plato implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idplato")
	private int idPlato;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "tiempopreparacion")
	private String tiempoPreparacion;

	@Column(name = "cantidadpersonas")
	private String cantidadPersonas;

	@Column(name = "preparacion")
	private String preparacion;

	@Column(name = "ingredientes")
	private String ingredientes;

	@ManyToOne
	@JoinColumn(name = "idtipo")
	private Tipo tipo;

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(String tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public String getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(String cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public String getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
