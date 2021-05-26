package com.backend.tienda.security.serviceimpl;

import com.backend.tienda.security.entity.Rol;
import com.backend.tienda.security.enums.RolNombre;
import com.backend.tienda.security.repository.RolRepository;
import com.backend.tienda.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolServiceImpl implements RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){ //Método para buscar rol por nombre
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){ //Método para guardar un nuevo rol, se utilizó con la clase CreateRoles para no hacerlo desde la BD
        rolRepository.save(rol);
    }
}
