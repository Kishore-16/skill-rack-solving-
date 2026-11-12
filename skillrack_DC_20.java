/*
DAILY CHALLENGE
ProgramID-7842
Skill Rack
Product of X and Sum of Digits
The program must accept two integers N and X as the input. The program must print the product of X and the sum of digits in N as the output.
Boundary Condition(s):
x <= 10 ^ 9 1 <= N
Input Format:
The first line contains the value of N.
The second line contains the value of X.
Output Format:
The first line contains the product of X and the sum of digits in N.
Example Input/Output 1:
Input:
2345 4
Output:
56
Explanation:
The sum of digits in 2345 is 14.
The product of 4 and 14 is 56.
Hence the output is 56
Example Input/Output 2:
Input:
1000 99999
Output: 99999
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    while(n>0){
        sum+=n%10;
        n/=10;
    }
    sum*=sc.nextInt();
    System.out.print(sum);
    }
}
