package it.dst.formazione.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static it.dst.formazione.esercitazione1.Soluzioni_esercitazione.*;
import static org.junit.Assert.*;


public class Esercitazione1Test {

    @Test
    public void testClassification() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<String, List<Integer>> result = classifyNumbers(input);

        assertTrue(result.containsKey("Pari"));
        assertTrue(result.containsKey("Dispari"));
        assertEquals(Arrays.asList(2, 4, 6), result.get("Pari"));
        assertEquals(Arrays.asList(1, 3, 5), result.get("Dispari"));
    }

    @Test
    public void testValidInput() {
        assertTrue(isValidInput("1 2 3 4 -5"));
        assertFalse(isValidInput("1 2 three 4"));
        assertFalse(isValidInput("123a"));
    }

    @Test
    public void testCalculateSum() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        assertEquals(15, calculateSum(input));
    }

}
