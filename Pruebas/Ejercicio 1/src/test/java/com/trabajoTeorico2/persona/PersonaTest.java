package com.trabajoTeorico2.persona;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class PersonaTest {

	@Test
	public static void testEsElegibleParaMatricularse() {
	    // Persona Perfecta
	    Persona persona1 = new Persona();
	    persona1.setFechaNacimiento(LocalDate.of(2000, 1, 1));
	    persona1.setTitulacion("Máster");
	    persona1.setNacionalidad("España");
	    persona1.setNumeroTelefono("612345678");
	    persona1.setCorreoElectronico("juan@example.com");
	    assertTrue(persona1.esElegibleParaMatricularse(), "La persona debería ser elegible para matricularse en el doctorado.");

	    // Persona menor de 18 años 
	    Persona persona2 = new Persona();
	    persona2.setFechaNacimiento(LocalDate.of(2010, 1, 1));
	    persona2.setTitulacion("Máster");
	    persona2.setNacionalidad("España");
	    persona2.setNumeroTelefono("612345678");
	    persona2.setCorreoElectronico("juan@example.com");
	    assertFalse(persona2.esElegibleParaMatricularse(), "La persona no debería ser elegible debido a ser menor de edad.");

	    // Persona con titulación incorrecta
	    Persona persona3 = new Persona();
	    persona3.setFechaNacimiento(LocalDate.of(2000, 1, 1));
	    persona3.setTitulacion("Licenciatura"); 
	    persona3.setNacionalidad("España");
	    persona3.setNumeroTelefono("612345678");
	    persona3.setCorreoElectronico("juan@example.com");
	    assertFalse(persona3.esElegibleParaMatricularse(), "La persona no debería ser elegible debido a la titulación no válida.");

	    // Persona con nacionalidad no europea
	    Persona persona4 = new Persona();
	    persona4.setFechaNacimiento(LocalDate.of(2000, 1, 1));
	    persona4.setTitulacion("Máster");
	    persona4.setNacionalidad("EE.UU.");
	    persona4.setNumeroTelefono("612345678");
	    persona4.setCorreoElectronico("juan@example.com");
	    assertFalse(persona4.esElegibleParaMatricularse(), "La persona no debería ser elegible debido a que no es europea.");

	    // Persona con número de teléfono incorrecto
	    Persona persona5 = new Persona();
	    persona5.setFechaNacimiento(LocalDate.of(2000, 1, 1));
	    persona5.setTitulacion("Máster");
	    persona5.setNacionalidad("España");
	    persona5.setNumeroTelefono("61234"); 
	    persona5.setCorreoElectronico("juan@example.com");
	    assertFalse(persona5.esElegibleParaMatricularse(), "La persona no debería ser elegible debido al número de teléfono inválido.");

	    // Persona con correo electrónico incorrecto
	    Persona persona6 = new Persona();
	    persona6.setFechaNacimiento(LocalDate.of(2000, 1, 1));
	    persona6.setTitulacion("Máster");
	    persona6.setNacionalidad("España");
	    persona6.setNumeroTelefono("612345678");
	    persona6.setCorreoElectronico("juan@com");
	    assertFalse(persona6.esElegibleParaMatricularse(), "La persona no debería ser elegible debido al correo electrónico inválido.");
	
	
	}
	

}
