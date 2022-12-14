package com.adriamilan.ptecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.ptecnica.dto.Mensaje;
import com.adriamilan.ptecnica.service.MensajeServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MensajeController {

	@Autowired
	MensajeServiceImpl mensajeserv;
	
	@GetMapping("/mensajes")
	public List<Mensaje> listMensajes() {
		return mensajeserv.listMensajes();
	}
	
	@GetMapping("/mensajes/{usuario}") 
	public Mensaje mensajeXUsuario(@PathVariable(name="usuario") String usuario) {
		return mensajeserv.mensajeXUsuario(usuario);
	}
	
	@GetMapping("/mensajes/{grupo}")
	public Mensaje mensajeXGrupo(@PathVariable(name="grupo") String grupo) {
		return mensajeserv.mensajeXGrupo(grupo);
	}
	
	@GetMapping("/mensajes/{id}")
	public Mensaje mensajeXID(@PathVariable(name="id") Long id) {
		return mensajeserv.mensajeXID(id);
	}
	
	@PostMapping("/mensajes")
	public Mensaje saveMensaje(@RequestBody Mensaje mensaje) {
		return mensajeserv.saveMensaje(mensaje);
	}
	
	@PutMapping("/mensajes/{id}")
	public Mensaje editMensaje(@PathVariable(name="id") Long id, @RequestBody Mensaje mensaje) {
		Mensaje mensajeSelected = new Mensaje();
		Mensaje mensajeUpdated = new Mensaje();
		
		mensajeSelected = mensajeserv.mensajeXID(id);
		mensajeSelected.setMensaje(mensaje.getMensaje());
		
		mensajeUpdated = mensajeserv.editMensaje(mensajeSelected);
		
		return mensajeUpdated;
	}
	
	@DeleteMapping("/mensajes/{id}")
	public String deleteMensaje(@PathVariable(name="id") Long id) {
		return mensajeserv.deleteMensaje(id);
	}
	
}
