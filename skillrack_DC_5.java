/*
DAILY CHALLENGE
ProgramID-7863
Skill Rack
Reverse Last X Digits
The program must accept two integers N and X as the input. The program must reverse the last X digits in N. Then the program must print the modified value of N as the output.
Boundary Condition(s):
1 <= X <= 15 1 <= N <= 10 ^ 15
Input Format:
The first line contains the integer N.
The second line contains the integer X.
Output Format:
The first line contains the modified value of N.
Example Input/Output 1:
Input: 12345 3
Output:
12543
Explanation:
The last 3 digit in 12345 is 345.
The reverse of 345 is 543.
Hence the output is 12543
Example Input/Output 2:
Input:
6745424 4
Output: 6744245
Max Execution Time Limit: 4000 millisecs
*/



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
       Scanner sc = new Scanner(System.in);
       String  s= sc.nextLine();
       int n = sc.nextInt();
       String fin ="";
       fin+= s.substring(0,s.length()-n);
      String last =s.substring(s.length()-n);
       fin += new StringBuilder(last).reverse().toString();
       System.out.print(fin);
	}
}
