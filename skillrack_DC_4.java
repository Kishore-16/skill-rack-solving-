/*
Step Pattern
The program must accept a string S and an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.
Boundary Condition(s):
2 <= Length of S <= 100
2 <= N <= Length of S
Input Format:
The first line contains the string S.
The second line contains the integer N.
Output Format:
The list of lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
abcdefghijk
3
Output:
a
*b
**C
*d
e
*f
**g
*h
i
**k
Example Input/Output 2:
Input:
accelerate 8
Output:
a
C
**C
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int n = sc.nextInt();
     int starc =0 ,dir =1;
     for ( int i =0 ; i<s.length();i++){
         System.out.print("*".repeat(starc)+s.charAt(i)+"\n");
         if(starc == n-1 ){
             dir = -1;
         }
         if(starc == 0){
             dir= 1;
         }
         starc+=dir;
     }
	}
}
