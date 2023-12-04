package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 implements Day {
    static GameBreakdown limits = null;

    public static GameBreakdown limits() {
        if(limits != null) return limits;
        limits = new GameBreakdown("12 red, 13 green, 14 blue");
        return limits;
    }

    @Override
    public String part1(List<String> input) {
        return input
                .stream()
                .map((inputLine) -> new GameBreakdown(inputLine))
                .reduce(0, (sum, gameBreakdown) -> { return sum + (gameBreakdown.lessThan(limits()) ? gameBreakdown.id() : 0); }, (a,b) -> a + b)
                .toString();

    }

    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

}
