package com.adriamilan.ptecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.ptecnica.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}