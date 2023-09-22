import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        for (long i = 0L; i <= n; i++) {

            while (scan.hasNext()) {

                try {

                    long number = scan.nextLong();

                    System.out.println(number + " can be fitted in:");

                    if ((number >= -128) && (number <= 127)) {
                        System.out.println("* byte");
                    }

                    if ((number >= -32768) && (number <= 32767)) {
                        System.out.println("* short");
                    }

                    if ((number >= -Math.pow(2, 31)) && (number <= (Math.pow(2, 31) - 1))) {
                        System.out.println("* int");
                    }

                    if ((number >= -Math.pow(2, 63)) && (number <= (Math.pow(2, 63) - 1))) {
                        System.out.println("* long");
                    }

                } catch (Exception e) {
                    System.out.println(scan.next() + " can't be fitted anywhere.");
                }

            }
        }
    }
}