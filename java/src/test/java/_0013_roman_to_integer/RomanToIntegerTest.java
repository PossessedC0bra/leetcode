package _0013_roman_to_integer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {
    private Solution solution;

    @BeforeEach
    public void beforeEach() {
        solution = new Solution();
    }

    @Test
    public void case1() {
        final String s = "III";
        assertEquals(3, solution.romanToInt(s));
    }

    @Test
    public void case2() {
        final String s = "LVIII";
        assertEquals(58, solution.romanToInt(s));
    }

    @Test
    public void case3() {
        final String s = "MCMXCIV";
        assertEquals(1994, solution.romanToInt(s));
    }
}
