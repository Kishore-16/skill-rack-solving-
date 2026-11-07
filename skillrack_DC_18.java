/*
DAILY CHALLENGE
ProgramID-7986
Skill Rack
Binary Representation of Digits
The program must accept an integer N as the input. The program must print the 4-bit binary representation of each digit in N as the output.
Boundary Condition(s): 1 <= N <= 10 ^ 15
Input Format:
The first line contains the integer N.
Output Format:
The lines contain the 4-bit binary representation of each digit in N.
Example Input/Output 1:
Input:
4653
Output:
0100
0110
0101
0011
Explanation:
The 4-bit binary representation of the first digit in 4653 is 0100.
The 4-bit binary representation of the second digit in 4653 is 0110.
The 4-bit binary representation of the third digit in 4653 is 0101.
The 4-bit binary representation of the fourth digit in 4653 is 0011.
Example Input/Output 2:
Input:
102
Output:
0001
0000
0010
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {
    public static String binstr(int n ){
        StringBuilder s = new StringBuilder();
        while(n>0){
            s.append(n%2);
            n/=2;
        }
        while(s.length()<4){
            s.append("0");
        }
        return new String(s.reverse());
    }
    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      String s1=sc.nextLine();
      for( int i=0; i<s1.length();i++){
    String a = String.valueOf(s1.charAt(i));
   System.out.println(binstr(Integer.parseInt(a)));
      }
      
	}
}
