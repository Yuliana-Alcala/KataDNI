package dev.katadni.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class DniModelTest {

    
    @Test
    void testGetNumberDNI() {
        DniModel numberDni = new DniModel(99999998);

        int expectedResult = numberDni.getNumberDNI();

        assertThat(expectedResult, is(99999998));

    }

   
}
