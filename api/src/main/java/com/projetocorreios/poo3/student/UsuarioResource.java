package com.projetocorreios.poo3.student;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UsuarioResource {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/students")
	public List<Usuario> retrieveAllStudents() {
		return usuarioRepository.findAll();
	}

	@GetMapping("/students/{id}")
	public Usuario retrieveStudent(@PathVariable long id) {
		Optional<Usuario> student = usuarioRepository.findById(id);

		if (!student.isPresent())
			throw new UsuarioNotFoundException("id-" + id);

		return student.get();
	}

	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable long id) {
		usuarioRepository.deleteById(id);
	}

	@PostMapping("/students")
	public ResponseEntity<Object> createStudent(@RequestBody Usuario usuario) {
		Usuario savedUsuario = usuarioRepository.save(usuario);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUsuario.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Usuario usuario, @PathVariable long id) {

		Optional<Usuario> studentOptional = usuarioRepository.findById(id);

		if (!studentOptional.isPresent())
			return ResponseEntity.notFound().build();

		usuario.setId(id);
		
		usuarioRepository.save(usuario);

		return ResponseEntity.noContent().build();
	}
}
