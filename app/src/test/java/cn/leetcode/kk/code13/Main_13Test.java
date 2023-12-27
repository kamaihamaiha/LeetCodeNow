package cn.leetcode.kk.code13;

import static org.junit.Assert.*;

import org.junit.Test;

public class Main_13Test {

    @Test
    public void testRomanToInt() {
        assertEquals(3, Main_13.romanToInt("III"));
        assertEquals(4, Main_13.romanToInt("IV"));
        assertEquals(9, Main_13.romanToInt("IX"));
        assertEquals(58, Main_13.romanToInt("LVIII"));
        assertEquals(1994, Main_13.romanToInt("MCMXCIV"));
    }
}