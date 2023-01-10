package org.example;

import org.testng.annotations.Test;

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
    @Test
    public void notNullTest(){
        var calculator = new Calculator();
        assertNotNull(calculator.addition());
    }
    @Test
    public void subtractionTest(){
        var calculator = new Calculator();
        int result = -1;
        assertEquals(result, calculator.subtraction());
    }

    @Test
    public void changeNumberTest(){
        var calculator = new Calculator();
        calculator.setNum1(5);
        assertEquals(5,calculator.num1);
        calculator.setNum2(10);
        assertEquals(10,calculator.num2);
    }
}