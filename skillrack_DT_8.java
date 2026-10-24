/*
DAILY CHALLENGE
ProgramID-7913
SkillRack
Reverse First Three digits
The program must accept an integer N as the input. The program must reverse and print the first three digits of N as the output.
Boundary Condition(s):
100 <= N <= 10 ^ 15
Input Format:
The first line contains the integer N.
Output Format:
The first line contains the reverse of the first three digits in the integer N.
Example Input/Output 1:
Input:
32653
Output:
623
Explanation:
The first three digits in 32653 are 3, 2 and 6.
So the reverse of 326 is
Hence the output is 623
Example Input/Output 2:
Input: 100236
Output: 1
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
   Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();
   int n = Integer.parseInt(new StringBuilder(s.substring(0,3)).reverse().toString());
   System.out.print(n);
	}
}
