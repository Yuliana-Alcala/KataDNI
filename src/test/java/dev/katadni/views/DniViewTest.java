package dev.katadni.views;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class DniViewTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        // Inicializar el ByteArrayOutputStream y redirigir la salida
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out; // Guardar la salida original
        System.setOut(new PrintStream(outputStream)); // Redirigir System.out al outputStream
    }
    @Test
    void testAskNumberDni() {
        
    }

    @Test
    void testShowsLetterDni() {
        char letterDni = 'T';
        int dni = 12345678;

        // Call the method
        DniView.showsLetterDni(letterDni, dni);

        // Capture the output
        String output = outputStream.toString().trim();

        // Verify the expected output
        String expectedOutput = "--------------------------------\nThe DNI letter is: T\nThe Full Identification number is: T12345678";
        assertThat(output, is(expectedOutput));

        // Reset output stream
        System.setOut(originalOut);

    }
}
