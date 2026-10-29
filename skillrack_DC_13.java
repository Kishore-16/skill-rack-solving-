/*
DAILY CHALLENGE
ProgramID-7931
Skill Rack
Triangle Digit Pattern
The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.
Boundary Condition(s):
1 <= N <= 10 ^ 15
Input Format:
The first line contains the integer N.
Output Format:
The list of lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
43785
Output:
4
33
777
8888
55555
Example Input/Output 2:
Input:
10001
Output:
1
00
000
0000
11111
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
   Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();
   int n = s.length();
   for( int i =0 ; i<n;i++){
       for( int j=0 ; j<=i ;j++){
           System.out.print(s.charAt(i));
       }
       System.out.print("\n");
   }
	}
}
