/*
DAILY TEST
ProgramID-8183
Skill Rack
First Even Integer
The program must accept N integers as the input. The program must print the integers starting from the first even integer as the output.
Note: There will be at least one even integer.
Boundary Condition(s):
1 <= N <= 1000
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the integers separated by a space.
Example Input/Output 1:
Input:
7
13467-215
Output:
467-215
Explanation:
The first occurring even integer among N integers is 4.
So all the integers from 4 are printed as the output.
Example Input/Output 2:
Input:
10
37 841 791 843 35 727 600 831 764 366
Output:
600 831 764 366
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
boolean flag =false;
for( int i =0 ; i< n ;i++){
    int a = sc.nextInt();
    if(a%2==0){
        flag=true;
    }
    if(flag){
        System.out.print(a+" ");
    }
}
	}
}
