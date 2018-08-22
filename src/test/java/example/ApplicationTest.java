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
    void should_print_multiply_table(){
        String expect = "1 * 1 = 1 \n" +
                "1 * 2 = 2 2 * 2 = 4 \n" +
                "1 * 3 = 3 2 * 3 = 6 3 * 3 = 9 \n";
        assertEquals(expect, Application.buildMultiplicationTable(1,3));
    }

    @Test
    void should_print_multiply_table_when_input_two_big_numbers(){
        String expect = "100000 * 100000 = 10000000000 \n" +
                "100000 * 100001 = 10000100000 100001 * 100001 = 10000200001 \n";
        assertEquals(expect, Application.buildMultiplicationTable(100000,100001));
    }
}