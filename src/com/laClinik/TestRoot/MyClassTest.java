package com.laClinik.TestRoot;

import com.laClinik.main.Calculator;
import com.laClinik.main.FizzBuzz;
import com.laClinik.main.Greetings;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MyClassTest {
    //Calculator
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(4, calculator.add(2,2));
    }
    //Greetings
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
        Assert.assertThat(fizzBuzz.process(3), is("Fizz"));
        Assert.assertThat(fizzBuzz.process(5), is("Buzz"));
        Assert.assertThat(fizzBuzz.process(6), is("Fizz"));
        Assert.assertThat(fizzBuzz.process(10), is("Buzz"));
        Assert.assertThat(fizzBuzz.process(15), is("Fizz Buzz"));
    }

    @Test
    public void shouldExecute() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertThat(fizzBuzz.execute(new int[] {1}), is("1"));
        Assert.assertThat(fizzBuzz.execute(new int[] {1, 2, 3, 5, 6, 10, 15, 30}),
                is("1, 2, Fizz, Buzz, Fizz, Buzz, Fizz Buzz, Fizz Buzz"));
    }

}
