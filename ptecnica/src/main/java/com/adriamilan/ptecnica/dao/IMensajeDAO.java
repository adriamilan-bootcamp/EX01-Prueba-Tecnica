package com.adriamilan.ptecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.ptecnica.dto.Mensaje;

public interface IMensajeDAO extends JpaRepository<Mensaje, Long> {

	Mensaje findByUsuario(String usuario);
	
	Mensaje findByGrupo(String grupo);
	
}
