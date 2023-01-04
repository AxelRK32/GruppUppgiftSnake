package org.example;

public class Calculator {
    int num1 = 2;
    int num2 = 3;

    private void setNum1(){
        num1 = 5;
    }
    private void setNum2(){
        num2 = 10;
    }

    public int addition(){
        return num1 + num2;
    }

    public int subtraction(){
        return num1 - num2;
    }
}
