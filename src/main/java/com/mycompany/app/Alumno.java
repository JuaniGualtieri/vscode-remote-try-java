package com.mycompany.app;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private String nombre;
    private LocalDate fechaNacimiento;

    // SET y GET para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // SET y GET para fecha de nacimiento
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Método para calcular la edad
    public int edad() {
        if (fechaNacimiento == null) {
            throw new IllegalStateException("La fecha de nacimiento no está establecida");
        }
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}
