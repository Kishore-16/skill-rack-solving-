/*
DAILY CHALLENGE
ProgramID-7843
Skill Rack
Patttern - Asterisk with Alphabets
The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.
Boundary Condition(s):
1 <= N <= 26
Input Format:
The first line contains the value of N.
Output Format:
The first N lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
4
Output:
**ABA
*ABCBA
ABCDCBA
Example Input/Output 2:
Input:
7
Output:
****ABCBA
***ABCDCBA
**ABCDEDCВА
*ABCDEFEDCBA
ABCDEFGFEDCBA

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i =1; i<=n;i++){
        for(int j=1 ; j<=n-i;j++){
            System.out.print("*");
        }
        for( int j =0;j<i;j++){
            System.out.print((char) ('A'+j));
        }
        for(int j =i-2;j>=0;j--){
            System.out.print((char)('A'+j));
        }
        System.out.print("\n");
    }
	}
}
