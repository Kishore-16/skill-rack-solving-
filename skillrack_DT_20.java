/*
DAILY TEST
ProgramID-8328
SkillRack
Expand Number
The program must accept an integer N as the input. The program must replace each digit D by repeating it for D times. Finally, the program must print the modified value of N as the output. If the digit is 0 then the digit is not printed.
Boundary Condition(s):
1 <= N <= 10 ^ 8
Input Format:
The first line contains the value of N.
Output Format:
The first line contains the modified value of N.
Example Input/Output 1:
Input:
253
Output: 2255555333
Explanation:
The first digit is 2. So replace the digit 2 by repeating it for 2 times.
The second digit is 5. So replace the digit 5 by repeating it for 5 times.
The third digit is 3. So replace the digit 3 by repeating it for 3 times.
Hence the output is 2255555333
Example Input/Output 2:
Input:
9012
Output:
999999999122
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
   for( int i=0 ;i<n.length();i++){
       int d = n.charAt(i)-'0';
       System.out.print(String.valueOf(d).repeat(d));
   }
	}
}
