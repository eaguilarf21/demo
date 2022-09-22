package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/*@Entity
@Table(catalog ="basededatos", name="datosclientes")*/
public class Clientes {
    private Integer dni;
    private String nombre;
    private String apellidop;

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }
}
