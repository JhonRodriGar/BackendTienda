package com.backend.tienda.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.backend.tienda.security.entity.Rol;
import com.backend.tienda.security.enums.RolNombre;
import com.backend.tienda.security.service.RolService;


/**
 * Al correr el proyecto sin comentar el código de este método,
 * se crea los roles en la tabla roles.
 * <p>
 * El programa sólo se debe ejecutar una vez con este código para crear los roles,
 * después se debe comentar.
 */

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {

        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_VENDEDOR);
        Rol rolCliente = new Rol(RolNombre.ROLE_CLIENTE);
        Rol rolProveedor = new Rol(RolNombre.ROLE_PROVEEDOR);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
        rolService.save(rolCliente);
        rolService.save(rolProveedor);

    }
}
