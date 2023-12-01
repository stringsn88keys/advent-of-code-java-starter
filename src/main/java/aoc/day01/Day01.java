package aoc.day01;


import aoc.Day;

import java.util.List;
import java.util.Map;

public class Day01 implements Day {
    static Map<String, String> numberWords = Map.of(
            "one", "o1e",
            "two", "t2o",
            "three", "th3ee",
            "four", "f4ur",
            "five", "fi5ve",
            "six", "s6x",
            "seven", "se7en",
            "eight", "ei8ht",
            "nine", "n9ne"


    );
    public static String getDigits(String inputLine) {
//        System.out.println(inputLine);
        return inputLine.replaceAll("^\\D*(\\d).*$", "$1")
                + inputLine.replaceAll("^.*(\\d)\\D*$", "$1");
    }

    public static String subFirstWordOccurences(String inputLine) {
        int pos=0;
        String line=inputLine;
        String newLine;
        while(pos < line.length() - 1) {
            for (String word: numberWords.keySet() ) {
                newLine = line.replaceAll("^(" + ".".repeat(pos)+ ")" + word, "$1" + numberWords.get(word));
                if (newLine.compareTo(line) != 0) {
                    line = newLine;
                    break;
                }
            }
            pos++;
        }
        return line;
    }
    public static String getDigitsWithWords(String inputLine) {
        return getDigits(subFirstWordOccurences(inputLine));
    }

    @Override
    public String part1(List<String> input) {
        return input
                .stream()
                .map((inputLine) -> Integer.parseInt(getDigits(inputLine)))
                .reduce(0, (sum, digits) -> sum + digits)
                .toString();
    }

    @Override
    public String part2(List<String> input) {
        return input
                .stream()
                .map((inputLine) -> Integer.parseInt(getDigitsWithWords(inputLine)))
                .reduce(0, (sum, digits) -> sum + digits)
                .toString();
    }

}
