package aoc.day01;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test {

    @Test
    public void testGetDigits() {
        assertEquals("12", Day01.getDigits("1abc2"));
        assertEquals("12", Day01.getDigits("1abc2n"));
        assertEquals("13", Day01.getDigits("1abc2n3"));
        assertEquals("11", Day01.getDigits("a1abcd"));
    }

    @Test
    public void testGetDigitsWithWords() {
        assertEquals("13", Day01.getDigitsWithWords("oneabc2n3"));
        assertEquals("53", Day01.getDigitsWithWords("fiveabc2nthree"));
        assertEquals("24", Day01.getDigitsWithWords("xtwone3four"));
    }
    @Test
    public void testPart1(){
        // Given
        List<String> input = aoc.App.loadInput(1, "part1sample");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("142", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = aoc.App.loadInput(1, "part2sample");

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals("281", result);
    }
}
