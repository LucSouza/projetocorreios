package com.projetocorreios.apirest.repository;

import com.projetocorreios.apirest.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findById(long cpf);

}
