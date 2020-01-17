package com.laClinik.main;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {

    public String process(int i) {
        
        if(isMultipleOfThree(i) && isMultipleOfFive(i)) {
            return "Fizz Buzz";
        }
        if(isMultipleOfThree(i)) {
            return "Fizz";
        }
        if(isMultipleOfFive(i)) {
            return "Buzz";
        }

        return String.valueOf(i);
    }
    public boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }
    public boolean isMultipleOfFive(int i) {
        return i % 5 == 0;
    }

    public String execute(int[] number) {
        return Arrays.stream(number)
                .mapToObj(this::process)
                .collect(Collectors.joining(", "));
    }
}
