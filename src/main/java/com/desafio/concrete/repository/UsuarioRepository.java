package com.desafio.concrete.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.concrete.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
