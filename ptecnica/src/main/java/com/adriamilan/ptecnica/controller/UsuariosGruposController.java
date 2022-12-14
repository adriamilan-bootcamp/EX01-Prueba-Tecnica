package com.adriamilan.ptecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.ptecnica.dto.UsuariosGrupos;
import com.adriamilan.ptecnica.service.UsuarioGruposServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UsuariosGruposController {

	@Autowired
	UsuarioGruposServiceImpl ugservice;
	
	@GetMapping("/uniones")
	public List<UsuariosGrupos> listUsuariosGrupos() {
		return ugservice.listUsuariosGrupos();
	}
	
	@GetMapping("/grupos/{usuario}")
	public UsuariosGrupos usuariosGruposXUsuario(@PathVariable(name="usuario") String nombre) {
		return ugservice.usuariosGruposXUsuario(nombre);
	}
	
	@GetMapping("/grupos/{grupo}")
	public UsuariosGrupos usuariosGruposXGrupo(@PathVariable(name="grupo") String grupo) {
		return ugservice.usuariosGruposXGrupo(grupo);
	}
	
	@PostMapping("/unir/grupo")
	public UsuariosGrupos saveUsuariosGrupos(@RequestBody UsuariosGrupos usuariosGrupos) {
		return ugservice.saveUsuariosGrupos(usuariosGrupos);
	}
	
	@DeleteMapping("salir/grupo/{id}")
	public String deleteUsuariosGrupos(@PathVariable(name="id") Long id) {
		return ugservice.deleteUsuariosGrupos(id);
	}
	
}
