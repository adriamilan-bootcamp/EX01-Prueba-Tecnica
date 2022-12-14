package com.adriamilan.ptecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.ptecnica.dao.IUsuariosGruposDAO;
import com.adriamilan.ptecnica.dto.UsuariosGrupos;

@Service
public class UsuarioGruposServiceImpl implements IUsuariosGruposService {

	@Autowired
	IUsuariosGruposDAO ugdao;

	@Override
	public List<UsuariosGrupos> listUsuariosGrupos() {
		return ugdao.findAll();
	}

	@Override
	public UsuariosGrupos usuariosGruposXID(Long id) {
		return ugdao.findById(id).get();
	}

	@Override
	public UsuariosGrupos usuariosGruposXUsuario(String nombre) {
		return ugdao.findByUsuario(nombre);
	}

	@Override
	public UsuariosGrupos usuariosGruposXGrupo(String grupo) {
		return ugdao.findByGrupo(grupo);
	}

	@Override
	public UsuariosGrupos saveUsuariosGrupos(UsuariosGrupos usuariosGrupos) {
		return ugdao.save(usuariosGrupos);
	}

	@Override
	public UsuariosGrupos editUsuariosGrupos(UsuariosGrupos usuariosGrupos) {
		return ugdao.save(usuariosGrupos);
	}

	@Override
	public String deleteUsuariosGrupos(Long id) {
		ugdao.deleteById(id);
		return "El usuario ha salido del grupo";
	}
	
}
