package com.adriamilan.ptecnica.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="videojuego")
	private String videojuego;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grupo")
	private List<UsuariosGrupos> usuariosGrupos;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grupo")
	private List<Mensaje> mensajes;
	
	// Constructor por defecto
	public Grupo() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param videojuego
	 */
	public Grupo(Long id, String nombre, String videojuego) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.videojuego = videojuego;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the videojuego
	 */
	public String getVideojuego() {
		return videojuego;
	}

	/**
	 * @param videojuego the videojuego to set
	 */
	public void setVideojuego(String videojuego) {
		this.videojuego = videojuego;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @return the usuariosGrupos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "UsuariosGrupos")
	public List<UsuariosGrupos> getUsuariosGrupos() {
		return usuariosGrupos;
	}

	/**
	 * @param usuariosGrupos the usuariosGrupos to set
	 */
	public void setUsuariosGrupos(List<UsuariosGrupos> usuariosGrupos) {
		this.usuariosGrupos = usuariosGrupos;
	}
	
	/**
	 * @return the mensaje
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensaje")
	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	@Override
	public String toString() {
		return "Grupos [id=" + id + ", nombre=" + nombre + ", videojuego=" + videojuego + "]";
	}
	
}
