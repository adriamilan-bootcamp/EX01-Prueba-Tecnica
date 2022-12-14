package com.adriamilan.ptecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.ptecnica.dao.IGrupoDAO;
import com.adriamilan.ptecnica.dto.Grupo;

@Service
public class GrupoServiceImpl implements IGrupoService {

	@Autowired
	IGrupoDAO grupodao;

	@Override
	public List<Grupo> listGrupos() {
		return grupodao.findAll();
	}

	@Override
	public Grupo grupoXID(Long id) {
		return grupodao.findById(id).get();
	}
	
	@Override
	public Grupo grupoXNombre(String nombre) {
		return grupodao.findByNombre(nombre);
	}

	@Override
	public Grupo saveGrupo(Grupo grupo) {
		return grupodao.save(grupo);
	}

	@Override
	public Grupo editGrupo(Grupo grupo) {
		return grupodao.save(grupo);
	}

	@Override
	public String deleteGrupo(Long id) {
		grupodao.deleteById(id);
		return "Grupo eliminado";
	}
	
}
