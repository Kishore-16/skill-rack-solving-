/*
DAILY TEST
ProgramID-7814
Skill Rack
Sum or Product of Digits
The program must accept an integer N as the input. The program must print the sum of the digits in N if N is even. Else the program must print the product of digits in N as the output.
Boundary Condition(s):
1 <= N <= 10 ^ 18
Input Format:
The first line contains the integer N.
Output Format:
The first line contains either the sum of the digits in N or the product of digits in N.
Example Input/Output 1:
Input:
453652
Output:
25
Explanation:
The integer 453652 is odd. So the sum of the digits in 453652 is 25 (4 + 5 + 3 + 6 + 5 + 2) Hence the output is 25
Example Input/Output 2:
Input: 21841
Output: 64
Max Execution Time Limit: 4000 millisecs
*/




import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      int fin =0;
      if(n%2==0){
      while(n>0){
          fin += n%10;
          n/=10;
      }
      }
      else{
          fin=1;
          while(n>0){
              fin *= n%10;
              n/=10;
          }
      }
      System.out.print(fin);
	}
}
