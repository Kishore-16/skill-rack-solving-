/*
DAILY CHALLENGE
ProgramID-8178
Skill Rack
Greater than Previous
N integers are passed as the input to the program. The program must print the integers which are greater than the previous integer. The first integer will always be printed.
Boundary Condition(s):
1 <= N <= 100
Input Format:
The first line contains the value of N.
The second line contains the N integers separated by a space.
Output Format:
The first line contains the integers separated by a space.
Example Input/Output 1:
Input:
7 10-90 66 0 22 0-14
Output: 10 66 22
Explanation:
being the first integer it is always printed.
-90 is less than 10 and hence it is not printed.
is greater than -90 and hence it is printed.
O is less than 66 and hence it is not printed.
is greater than 0 and hence it is printed.
0 is less than 22 and hence it is not printed.
-14 is less than 0 and hence it is not printed.
Example Input/Output 2:
Input:
5 10 20 30 25 40
Output: 10 20 30 40
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int t=-1;
     for(int i=0 ;i<n;i++){
         int a = sc.nextInt();
         if(i==0||a>t){
             System.out.print(a+" ");
         }
         t=a;
     }
	}
}
