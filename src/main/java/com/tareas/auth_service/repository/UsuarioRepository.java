package com.tareas.auth_service.repository;

import com.tareas.auth_service.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    Optional<UsuarioEntity> findByNickusuario(String nickusuario);
}
