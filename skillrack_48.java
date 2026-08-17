/*
JAVA-VERY-EASY-PART002
ProgramID-1910
SKILLRACK
Find Pencils Sold
Chintoo runs a shop near a school and hence sells a lot of pencils. Chintoo wants to write a program to find the number of pencils sold every day. The program will accept the number of pencils at N the beginning of the day and the number of pencils E at the end of the day (N >= E). The program must print the number of pencils sold on that particular day.
Input Format:
The first line denotes N
The second line denotes E
Output Format:
The first line denotes the number of pencils sold on that day.
Example Input/Output:
Input:
40
12
Output:
28
Max Execution Time Limit: 5000 millisecs */

import java.util.*;

public class skillrack_48 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a - b);
        sc.close();

    }
}
