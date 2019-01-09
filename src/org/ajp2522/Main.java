package org.ajp2522;

import static org.ajp2522.Fibonacci.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("hello fibonacci");

        System.out.println("fibonacci to 7 = " + FibonacciSequence(7));

        System.out.println("fibonacci to 49 = " + FibonacciSequence(49));

        System.out.println("fibonacci to 101 = " + FibonacciSequence(101));

        System.out.println("fibonacci element 7 = " + FibonacciElement(7));

        System.out.println("fibonacci element 43 = " + FibonacciElement(43));

        System.out.println("fibonacci element 109 = " + FibonacciElement(109));

        System.out.println("finished");
    }
}
