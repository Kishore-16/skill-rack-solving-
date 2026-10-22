/*
DAILY TEST
ProgramID-8164
Skill Rack
N Integers Formed Using Digits of X
The program must accept N integers and an integer X as the input. The program must print YES if every integer is equal to any one of the digits in X. Else the program must print NO as the output.
Boundary Condition(s):
0 <= Each integer value <= 9 1 <= X <= 10 ^ 8 1 <= N <= 1000
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
The third line contains the value of X.
Output Format:
The first line contains either YES or NO.
Example Input/Output 1:
Input:
6 211371 7132
Output: YES
Explanation:
All the integers (2, 1, 1, 3, 7 and 1) are formed from the digits of 7132.
Hence the output is YES
Example Input/Output 2:
Input: 5 43081 4301
Output: NO
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		String from = sc.nextLine();
		String flag ="YES";
		for( int i =0 ;i<n;i++){
		    if(!from.contains(s[i])){
		        flag="NO";
		        break;
		    }
		}
		System.out.print(flag);
	}
}
