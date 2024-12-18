package com.trabajoTeorico2.persona;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setFechaNacimiento(LocalDate.of(2000, 1, 1));
        persona.setTitulacion("Licenciatura");
        persona.setNacionalidad("España");
        persona.setNumeroTelefono("612345678");
        persona.setCorreoElectronico("juan@example.com");
        System.out.println("Es elegible para matricularse: " + persona.esElegibleParaMatricularse());
    }
}


