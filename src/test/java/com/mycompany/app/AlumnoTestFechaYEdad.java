package com.mycompany.app;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class AlumnoTestFechaYEdad {

    @Test
    public void testFechaNacimientoYEdad() {
        Alumno alumno = new Alumno();
        alumno.setFechaNacimiento(LocalDate.of(2000, 8, 15));

        assertEquals("Fecha de nacimiento incorrecta",
                     LocalDate.of(2000, 8, 15),
                     alumno.getFechaNacimiento());

        int edadCalculada = alumno.edad();
        int edadEsperada = LocalDate.now().getYear() - 2000;

        assertEquals("Edad calculada incorrecta", edadEsperada, edadCalculada);
    }
}

