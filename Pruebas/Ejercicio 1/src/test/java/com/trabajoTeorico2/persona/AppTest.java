package com.trabajoTeorico2.persona;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.main(new String[] {});
        String[] lines = outContent.toString().split("\n");
        PersonaTest.testEsElegibleParaMatricularse();
        System.setOut(System.out);
    }
}
