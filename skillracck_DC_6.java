/*
DAILY CHALLENGE
ProgramID-7912
Skill Rack
Sum of Middle Integers
The program must accept N integers as the input. If N is even, the program must print the sum of middle four integers among N integers as the output. Else the program must print the sum of middle three integers among N integers as the output.
Boundary Condition(s):
5 <= N <= 100
1 <= Each Integer Value <= 9999
Input Format:
The first line contains the integer N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains either the sum of middle four integers or the sum of middle three integers among N integers.
Example Input/Output 1:
Input:
5 23576
Output:
15
Explanation:
Here N = 5 which is odd.
So the middle 3 integers are 3, 5 and 7.
The sum of the middle three integers is 15 (3 + 5 + 7)
Hence the output is 15
Example Input/Output 2:
Input: 6 23 47 63 52 77 56
Output: 239
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for( int i =0 ; i<n; i++){
         arr[i]=sc.nextInt();
     }
     int mid = n/2,sum=0;
    
     if(n%2!=0){
         sum= arr[mid-1]+arr[mid]+arr[mid+1];
     }
     else{
         sum= arr[mid-2]+arr[mid-1]+arr[mid]+arr[mid+1];
     }
     System.out.print(sum);
	}
}
