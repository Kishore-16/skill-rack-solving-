/*
DAILY TEST
ProgramID-8167
Skill Rack
Half Palindrome
The program must accept a string S as the input. Either the first half of the string or the second half of the string is always a palindrome. The program must find and print the half of the string which forms a palindrome as the output.
Note: If the length of the string is odd then consider the middle character to be part of both halves.
Boundary Condition(s):
1 <= Length of the string <= 1000
Input Format:
The first line contains the string S.
Output Format:
The first line contains either the first or second half of the string S.
Example Input/Output 1:
Input:
yumertreert
Output:
treert
Explanation:
The second half of the string treert is a palindrome so it is printed.
Example Input/Output 2:
Input:
madamello
Output:
madam
Max Execution Time Limit: 4000 millisecs

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
      int n = s.length(),mid = n/2;
      String f = s.substring(0,(n+1)/2);
      String l = s.substring(mid);
      if(f.equals(new StringBuilder(f).reverse().toString())){
          System.out.print(f);
      }else{
          System.out.print(l);
      }
      
	}
}
