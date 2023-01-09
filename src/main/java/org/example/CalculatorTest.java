package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void plus(){
        var calculator = new Calculator2();
        assertEquals(4,calculator.add(2,2));
    }
    @Test
    public void minus(){
        var calculator = new Calculator2();
        assertEquals(0,calculator.subtract(2,2));
    }
    @Test
    public void times(){
        var calculator = new Calculator2();
        assertEquals(81,calculator.multiply(9,9));
    }
    @Test
    public void dividedby(){
        var calculator = new Calculator2();
        assertEquals(5,calculator.divide(25,5));
    }
}