package com.mithun;

/**
 * Created by Mithun Kumer Ghose on 2/29/2016.
 */
public class Fibonacci {

    /**
     * <h1>Gives the nth fibonacci number.</h1>
     * <p>This is a poor implementation of fibonacci number generation.</p>
     * <p>This method can successfully compute upto 50th fibonacci number with more time but will take much more time to determine after that.</p>
     * @param number {@link Integer} the nth number.
     * @return {@link Long} fibonacci number.
     */
    public long fibonacciNumberRecur(int number) {
        if(number < 0)
            System.out.println("There is no fibonacci number less than zero");
        else if(number == 0)
            return 0L;
        else if(number == 1 || number == 2)
            return 1L;
        else
            return fibonacciNumberRecur(number - 1) + fibonacciNumberRecur(number - 2);
        return 0;
    }

    /**
     * <h1>Generates an array of fibonacci numbers upto the given number.</h1>
     * <p>The efficient algorithm to determine the fibonacci numbers. This algorithm can handles very big fibonacci number.</p>
     * <p>This method can calculate the 100th fibonacci number in just a few seconds.</p>
     * @param num {@link Integer} this is number upto which you want to calculate the fibonacci series.
     * @return {@link Double} returns the whole series of fibonacci numbers including the given number.
     */
    public double[] findFibonacciNumbers(int num) {
        double[] fibNumbers = new double[num];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
        for(int i = 2; i < num; i++ ) {
            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
        }
        return fibNumbers;
    }

}
