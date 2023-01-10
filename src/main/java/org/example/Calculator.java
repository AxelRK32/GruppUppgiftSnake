package org.example;

public class Calculator {
    int num1 = 2;
    int num2 = 3;

    public void setNum1(int number){

        num1 = number;
    }
    public void setNum2(int number){

        num2 = number;
    }

    public int addition(){
        return num1 + num2;
    }

    public int subtraction(){
        return num1 - num2;
    }
}
