package com.backend.tienda.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.tienda.security.entity.Rol;
import com.backend.tienda.security.enums.RolNombre;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre); //Busca rol por nombre
}
