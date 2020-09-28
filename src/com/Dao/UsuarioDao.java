package com.Dao;

import com.Dto.UsuarioDto;

/**
 *
 * @author stive
 * En esta clase la creamos para que sea respondable de los accesos a la base de datos
 * por ende estamoa implementando el principio de responsabilidad absoluta
 */
public class UsuarioDao implements UsuarioDB{
    
    @Override
    public void crearUsuario(UsuarioDto usuario){
        System.out.println("Nombre: " + usuario.getNombres());
        System.out.println("Apellidos: " + usuario.getApellidos());
        System.out.println("Se ha creado el usuario exitosamente");
    }
}
