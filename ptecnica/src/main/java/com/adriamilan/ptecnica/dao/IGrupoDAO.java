package com.adriamilan.ptecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.ptecnica.dto.Grupo;

public interface IGrupoDAO extends JpaRepository<Grupo, Long> {

	Grupo findByNombre(String nombre);
	
}
