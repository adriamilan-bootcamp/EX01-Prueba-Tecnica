package com.adriamilan.ptecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.ptecnica.dto.UsuariosGrupos;

public interface IUsuariosGruposDAO extends JpaRepository<UsuariosGrupos, Long> {

	UsuariosGrupos findByUsuario(String nombre);
	
	UsuariosGrupos findByGrupo(String grupo);
	
}
