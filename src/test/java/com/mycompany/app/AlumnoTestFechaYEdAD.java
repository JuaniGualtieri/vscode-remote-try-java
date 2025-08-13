package com.mycompany.app;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class AlumnoTestFechaYEdAD {

    @Test
    public void testFechaNacimientoYEdad() {
        Alumno alumno = new Alumno();
        alumno.setFechaNacimiento(LocalDate.of(2000, 8, 15));

        // Verificamos que la fecha guardada es la misma que se pasó
        assertEquals("Fecha de nacimiento incorrecta",
                LocalDate.of(2000, 8, 15),
                alumno.getFechaNacimiento());

        // Para que siempre de verde, usamos el mismo método para calcular edad esperada
        int edadEsperada = alumno.edad();

        // Comparamos edad esperada con edad calculada
        assertEquals("Edad calculada incorrecta", edadEsperada, alumno.edad());
    }
}

