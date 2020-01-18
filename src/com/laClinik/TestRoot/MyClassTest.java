package com.laClinik.TestRoot;

import com.laClinik.main.Calculator;
import com.laClinik.main.Dna;
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
    public void testFizzBuzz() {
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

    //DnaStrand Problem
    @Test
    public void testDna() {
        Dna dna = new Dna();

        Assert.assertThat(dna.checkDna("A"), is("T"));
        Assert.assertThat(dna.checkDna("C"), is("G"));
        Assert.assertThat(dna.checkDna("T"), is("A"));
        Assert.assertThat(dna.checkDna("G"), is("C"));
    }
    @Test
    public void shouldTestDna() {
        Dna dna = new Dna();

        Assert.assertThat(dna.checkDna("AAA"), is("TTT"));
        Assert.assertThat(dna.checkDna("TTT"), is("AAA"));
        Assert.assertThat(dna.checkDna("CCC"), is("GGG"));
        Assert.assertThat(dna.checkDna("GGG"), is("CCC"));
        Assert.assertThat(dna.checkDna("GCA"), is("CGT"));
        Assert.assertThat(dna.checkDna("CATA"), is("GTAT"));
        Assert.assertThat(dna.checkDna("ACGT"), is("TGCA"));

    }

}