package com.Dto;

/**
 *
 * @author stive
 * En esta clase creamos los respectivos atributos y sus metodos de accesos
 * para este ejemplo estamos implementando el principio de responsabilidad unica
 * esta clase es responsable de sus atributos y metodos de accesos
 */
public class UsuarioDto {
    
    private String id;
    
    private String nombres;
    
    private String apellidos;
    
    private String correo;
    
    private String telefono;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public UsuarioDto() {
    }
}
