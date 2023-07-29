package br.edu.ifpe.recife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    void shouldSumTwoNumbers() {
        int result = Library.sum(1, 1);

        assertEquals(2, result);
    }

    @Test
    void shouldReturnCorrectNumbers() {
        int result = Library.sum(1, 3);

        assertEquals(4, result);
    }
}
