package org.ajp2522;

public class Fibonacci {
    static final int lowerLimit = 0;
    static final int upperLimit = 100;

    public static String FibonacciSequence(int limit)
    {
        String result;

        // validate
        if (IsValidElement(limit))
        {
            // calculate
            result = "";

            long[] sequence = new long[limit+1];

            for (int n=1; n <= limit; n++) {

                if (n <=2) {
                    sequence[n] = 1;
                }
                else {
                    sequence[n] = sequence[n-1] + sequence[n-2];
                }

                result += sequence[n] + ",";
            }
        }
        else
        {
            result = "Error Invalid limit";
        }

        // return
        return result;
    }

    public static long FibonacciElement(int element)
    {
        // validate
        if (IsValidElement(element)) {
            // calculate the whole sequence and return the last element
            long[] sequence = new long[element + 1];

            for (int n = 1; n <= element; n++) {

                if (n <= 2) {
                    sequence[n] = 1;
                } else {
                    sequence[n] = sequence[n - 1] + sequence[n - 2];
                }

            }
            return sequence[element];
        }
        else
        {
            return 0;
        }
    }

    private static boolean IsValidElement(int n)
    {
        return ( (n > lowerLimit) && (n < upperLimit) );

    }
}
