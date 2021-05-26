package com.backend.tienda.security.service;

import com.backend.tienda.security.entity.Rol;
import com.backend.tienda.security.enums.RolNombre;

import java.util.Optional;

public interface RolService {

    public Optional<Rol> getByRolNombre(RolNombre rolNombre);

    public void save(Rol rol);
}
