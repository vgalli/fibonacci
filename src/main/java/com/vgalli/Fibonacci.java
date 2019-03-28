package com.vgalli;

import java.math.BigInteger;

/**
 * @author Vincent Galli<vincent.galli@gmail.com>
 *     Prints n first number of the Fibonacci sequence
 */
public class Fibonacci {
    /**
     * Print first n number of the Fibonacci sequence
     * @param n Represent first n number in the sequence to be displayed
     * @return BigInteger Value at n position in the sequence
     */
    public static BigInteger fibonacci(int n) {

        if (n == 0) {
            System.out.print(n);//printing 0 then return. No need to go further
            return BigInteger.ZERO;
        }

        if (n == 1) {
            System.out.print("0 1"); //Print 0 1 then return. No need to go further
            return BigInteger.ONE;
        }
        //Fibonacci sequence always starts with 0 , 1
        System.out.print("0 1");
        //Usage of BigInteger avoids signed int problems
        BigInteger previousOfPrevious, previous, current;

        previousOfPrevious = BigInteger.valueOf(0);
        current = BigInteger.valueOf(0);
        previous = BigInteger.valueOf(1);

        for(int i =2;i <= n;++i)//Start from 2, 0 and 1 are already printed
        {
            current = previousOfPrevious.add(previous);
            System.out.print(" "+current.toString());
            previousOfPrevious = previous;
            previous = current;
        }

        return current;
    }

    /**
     * Print program usage
     */
    private static void printUsage() {
        System.out.println("Usage: run.sh or run.bat n\n" +
                "n: First N numbers to display");
    }

    /**
     * Main. Expected arguments 1 integer
     * @param args Program arguments
     */
    public static void main(String[] args) {
        int n = 0;

        //Validate the program as at least 1 parameter
        if (args != null && args.length == 1) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                printUsage();
                throw  new IllegalArgumentException("Please provide a valid Integer.");
            }
        } else {
            printUsage();
            throw  new IllegalArgumentException("Please provide one integer parameter");
        }

        fibonacci(n);
    }
}
