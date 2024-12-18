package com.trabajoTeorico2.persona;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.main(new String[] {});
        String[] lines = outContent.toString().split("\n");
        assertEquals("Es elegible para matricularse: false", lines[0].trim(), "La primera línea no es la esperada.");
        System.setOut(System.out);
    }
}
