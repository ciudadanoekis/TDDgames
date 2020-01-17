package com.laClinik.TestRoot;

import com.laClinik.main.Calculator;
import com.laClinik.main.FizzBuzz;
import com.laClinik.main.Greetings;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MyClassTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void getMessage_whenInitWithGreet_returnsGreet() {
        Greetings greetings = new Greetings("Hello World");
        Assert.assertThat(greetings.greet(), is("Hello World"));
    }
    //Fizz Buzz
    @Test
    public void testeo() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertThat(fizzBuzz.process(1), is("1"));
        Assert.assertThat(fizzBuzz.process(2), is("2"));
    }


}
