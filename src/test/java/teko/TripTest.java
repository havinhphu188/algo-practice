package teko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {
    @Test
    public void testCase1() {
        assertEquals(6, Trip.solve(7, 6));
        assertEquals(4, Trip.solve(4, 2));
        assertEquals(2, Trip.solve(3, 6));
        assertEquals(3, Trip.solve(3, 1));
        assertEquals(1, Trip.solve(2, 1));
        assertEquals(1, Trip.solve(2, 2));
    }
    @Test
    public void testCase3() {
        assertEquals(30, Trip.solve(10, 3));
    }

    @Test
    public void testCase4() {
        assertEquals(11, Trip.solve(12, 89));
    }

    @Test
    public void testCase5() {
        assertEquals(167, Trip.solve(32, 15));
    }
    @Test
    public void testCase6() {
        assertEquals(2926, Trip.solve(77, 1));
    }

    @Test
    public void testCase7() {
        assertEquals(1, Trip.solve(2, 56));
    }

    @Test
    public void testCase8() {
        assertEquals(99, Trip.solve(100, 100));
    }

    @Test
    public void testCase9() {
        assertEquals(3016, Trip.solve(91, 14));
    }

    @Test
    public void testCase10() {
        assertEquals(119, Trip.solve(92, 84));
    }

    @Test
    public void testCase11() {
        assertEquals(41, Trip.solve(42, 41));
    }

    @Test
    public void testCase12() {
        assertEquals(190, Trip.solve(20, 1));
    }

    @Test
    public void testCase13() {
        assertEquals(190, Trip.solve(20, 1));
    }
}