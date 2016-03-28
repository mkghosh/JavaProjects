package com.mithun;


import com.mithun.fibonacci.Fibonacci;

public class Test {

    public static void main(String[] args) {
	// write your code here
        double[] fibonacciNumbers;
        Fibonacci fib = new Fibonacci();
        fibonacciNumbers = fib.findFibonacciNumbers(100);
        System.out.println("The fibonacci numbers upto 100 are : ");
        for(double num : fibonacciNumbers) {
            System.out.println(num);
        }
//        for(int i = 0; i < 50; i++) {
//            System.out.println("The " + i + "th fibonacci number is : " + fib.fibonacciNumberRecur(i) );
//        }
    }
}
