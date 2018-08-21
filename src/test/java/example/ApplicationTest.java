package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ApplicationTest {

    @Test
    void should_throw_illegal_argument_exception_when_number_illegal(){
        assertThrows(IllegalArgumentException.class, () -> Application.verifyParameterLegal(3,1));
        assertThrows(IllegalArgumentException.class, () -> Application.verifyParameterLegal(-3,1));
        assertThrows(IllegalArgumentException.class, () -> Application.verifyParameterLegal(3,-1));
        assertThrows(IllegalArgumentException.class, () -> Application.verifyParameterLegal(3,3));
    }

    @Test
    void should_print_multiply_table_when_number_right(){
        String expect = "1 * 1 = 1\t\n" +
                "1 * 2 = 2\t2 * 2 = 4\t\n" +
                "1 * 3 = 3\t2 * 3 = 6\t3 * 3 = 9\t\n";
        assertEquals(expect, Application.buildMultiplicationTable(1,3));
    }
}