/*
DAILY CHALLENGE
ProgramID-7811
SkillRack
First and Last N Characters
The program must accept a string S contains only alphabets and an integer N as the input. The program must print the first N alphabets in the string and then print the last N alphabets in the string as the output.
Boundary Condition(s):
2 <= Length of S <= 100
1 <= N <= Length of S
Input Format:
The first line contains the string S.
The second line contains the integer N.
Output Format:
The first line contains the first N alphabets and the last N alphabets.
Example Input/Output 1:
Input:
Engineering
3
Output:
Enging
Explanation:
The first 3 alphabets in the string "Engineering" are Eng.
The last 3 alphabets in the string "Engineering" are ing.
Hence the output is Enging
Example Input/Output 2:
Input:
first 5
Output:
firstfirst
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String fin = "";
      int n = sc.nextInt();
      fin = ""+ s.substring(0,n)+ s.substring(s.length()-n,s.length());
      System.out.print(fin);
	}
}
