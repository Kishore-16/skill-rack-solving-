/*
DAILY TEST
ProgramID-7978
Skill Rack
Add Every Two Integers
The program must accept N integers as the input. The program must add every two integers and print their sum as the output.
Boundary Condition(s):
1 <= Each integer value <= 10^7 2 <= N <= 100
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains N-1 values separated by a space.
Example Input/Output 1:
Input:
5 65328
Output: 11 8 5 10
Explanation:
The sum of the first integer and the second integer (6+5) is 11.
The sum of the second integer and the third integer (5+3) is 8.
The sum of the third integer and the fourth integer (3+2) is 5.
The sum of the fourth integer and the fifth (2+8) is 10.
Hence the output is 11 8 5 10
Example Input/Output 2:
Input:
7 12 23 34 45 56 67 78
Output: 35 57 79 101 123 145
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int t=0;
      for( int i =0 ; i<n;i++){
          int a = sc.nextInt();
          if(i!=0){
              System.out.print(a+t+" ");
          }
          t=a;
      }
	}
}
