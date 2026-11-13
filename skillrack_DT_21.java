/*
DAILY TEST
ProgramID-8329
Skill Rack
Same First and Last Digits
The program must accept N integers as the input. The program must print the integers which are having the same first and last digits. If there is no such integer then the program must print -1 as the output.
Boundary Condition(s):
10 <= Each integer value <= 10^8 1 <= N <= 1000
Input Format:
The first line contains the value of N.
The second line contains N integer values separated by space(s).
Output Format:
The first line contains the integer values separated by a space.
Example Input/Output 1:
Input: 6 959 7829 6366 50 525 44
Output: 959 6366 525 44.
Explanation:
The first integer is 5. The first digit and the last digit are the same. so 959 is printed.
The second integer is 7829. The first digit and the last digit are not the same. so 7829 is not printed.
The third integer is 36. The first digit and the last digit are the same. so 6366 is printed.
The fourth integer is 50. The first digit and the last digit are not the same. so 50 is not printed.
The fifth integer is 2. The first digit and the last digit are the same. so 525 is printed.
The sixth integer is. The first digit and the last digit are the same. so 44 is printed.
Hence the output is 959 6366 525 44
Example Input/Output 2:
Input:
5 419 327 268 230 132
Output: -1
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     boolean flag=false;
     while(n>0){
         String s = sc.next();
         if(s.charAt(0)==s.charAt(s.length()-1)){
             System.out.print(s+" ");
             flag = true;
         }
         n-=1;
     }
     if(!flag){
         System.out.print(-1);
     }
	}
}
