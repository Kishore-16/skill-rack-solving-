/*
DAILY TEST
ProgramID-8182
Skill Rack
Sum with Unit Digit X
The program must accept N integers and an integer X as the input. The program must print the sum of integers (among N integers) which are having X as their unit digit as the output.
Boundary Condition(s): 1 <= N <= 1000 0 <= X <= 9
Input Format:
The first line contains N and X separated by space(s).
The second line contains N integers separated by space(s).
Output Format:
The first line contains an integer.
Example input/Output 1:
Input:
58 23 68 21 8 42
Output:
76
Explanation:
The integers with unit digit as 8 are 68 and 8. Their sum is 76.
Example Input/Output 2:
Input:
89 79 80 71 59 55 18 69 68
Output: 207
Max Execution Time Limit: 4000 millisecs

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     //sc.next();
     int x = sc.nextInt();
     //sc.next();
     int sum=0;
    // System.out.print(n+" "+x);
     for(int i =0 ; i<n ;i++){
         int temp =sc.nextInt();
        // sc.next();
         if(temp%10 == x){
             sum+= temp;
             
         }
     }
     System.out.print(sum);
     
	}
}
