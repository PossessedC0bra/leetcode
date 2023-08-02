package _0871_minimum_number_of_refueling_stops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfRefuelingStopsTest {
    private Solution solution;

    @BeforeEach
    public void beforeEach() {
        solution = new Solution();
    }

    @Test
    public void case1() {
        final int target = 1;
        final int startFuel = 1;
        final int[][] stations = {{}};

        assertEquals(0, solution.minRefuelStops(target, startFuel, stations));
    }

    @Test
    public void case2() {
        final int target = 100;
        final int startFuel = 1;
        final int[][] stations = {{10, 100}};

        assertEquals(-1, solution.minRefuelStops(target, startFuel, stations));
    }

    @Test
    public void case3() {
        final int target = 100;
        final int startFuel = 10;
        final int[][] stations = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};

        assertEquals(2, solution.minRefuelStops(target, startFuel, stations));
    }
}
