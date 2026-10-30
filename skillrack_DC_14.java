/*
DAILY CHALLENGE
ProgramID-7932
Skill Rack
Prime or Even
The program must accept an integer N as the input. The program must print valid if N is a prime number or an even number. Else the program must print invalid as the output.
Boundary Condition(s):
1 <= N <= 10 ^ 5
Input Format:
The first line contains the integer N.
Output Format:
The first line contains either valid or invalid.
Example Input/Output 1:
Input:
53
Output: valid
Explanation:
The integer 53 is a prime number. Hence the output is valid
Example Input/Output 2:
Input:
100
Output:
valid
Explanation:
The integer 100 is an even number. Hence the output is valid
Example Input/Output 3:
Input:
27
Output:
invalid
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {
    
    public static boolean isprime(int n ){
        for( int i =2 ; i<= Math.sqrt(n) ;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(isprime(num) || num%2==0){
        System.out.print("valid");
    }
    else{
        System.out.print("invalid");
    }
	}
}
