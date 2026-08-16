/*JAVA - AVERAGE - PART003
ProgramID-226
SKILLRACK
Next Number Palindrome
Given a number N, the program must print the next palindromic number P.
Boundary Conditions: 9 < N < 100000
Input Format:
First line will contain the number N
Output Format:
First line will contain the next palindromic number P.
Sample Input/Output:
Example 1: Input: 909
Output: 919
Example 2:
Input: 2131
Output: 2222 */

import java.util.Scanner;

public class skillrack_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            long next = n + 1;
            
            while (!isPalindrome(next)) {
                next++;
            }
            
            System.out.println(next);
        }
        sc.close();
    }

    private static boolean isPalindrome(long num) {
        long original = num;
        long reversed = 0;
        
        while (num > 0) {
            long digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return original == reversed;
    }
}
