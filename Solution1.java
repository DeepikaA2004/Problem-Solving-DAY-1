import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (-100 <= a && a <= 100) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}