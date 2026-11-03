/*
DAILY TEST
ProgramID-8024
Skill Rack
Outermost Ring Elements
The program must accept an integer matrix of size RxC as the input. The program must retain the same value for the elements present in the boundary of the matrix and the remaining elements are replaced by *. Finally, the program must print the modified matrix as the output.
Boundary Condition(s):
1 <= R, C <= 100
Input Format:
The first line contains the values for R and C separated by a space.
The next R lines contain C integers separated by space(s).
Output Format:
The first R lines contain the modified matrix.
Example Input/Output 1:
Input:
34
9863
5275
8912
Output:
9863
5**5
8912
Example Input/Output 2:
Input:
53
10 20 30
90 80 40
80 40 20
50 60 70
55 45 25
Output:
10 20 30
90*40
80*20
50*70
55 45 25
Max Execution Time Limit: 4000 millisecs.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int m = sc.nextInt();
      for(int i =0 ; i<n;i++){
          for( int j =0 ; j<m ;j++){
              int a = sc.nextInt();
              if(i==0||i==n-1 || j==0 || j==m-1){
                  System.out.print(a+" ");
              }else{
                  System.out.print("* ");
              }
          }
          System.out.print("\n");
      }
	}
}
