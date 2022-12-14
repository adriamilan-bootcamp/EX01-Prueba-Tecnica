package com.adriamilan.ptecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.ptecnica.dao.IMensajeDAO;
import com.adriamilan.ptecnica.dto.Mensaje;

@Service
public class MensajeServiceImpl implements IMensajeService {

	@Autowired
	IMensajeDAO mensajedao;

	@Override
	public List<Mensaje> listMensajes() {
		return mensajedao.findAll();
	}

	@Override
	public Mensaje mensajeXID(Long id) {
		return mensajedao.findById(id).get();
	}

	@Override
	public Mensaje mensajeXUsuario(String usuario) {
		return mensajedao.findByUsuario(usuario);
	}

	@Override
	public Mensaje mensajeXGrupo(String grupo) {
		return mensajedao.findByGrupo(grupo);
	}

	@Override
	public Mensaje saveMensaje(Mensaje mensaje) {
		return mensajedao.save(mensaje);
	}

	@Override
	public Mensaje editMensaje(Mensaje mensaje) {
		return mensajedao.save(mensaje);
	}

	@Override
	public String deleteMensaje(Long id) {
		mensajedao.deleteById(id);
		return "Mensaje eliminado";
	}
	
	
	
}
