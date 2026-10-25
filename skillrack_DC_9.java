/*
DAILY CHALLENGE
ProgramID-7915
SkillRack
Check the Alphabet
The program must accept a string value S and an integer X as the input. The program much print yes if xth position letter in the alphabetical order is present at least once in S. Else the program must print no as the output.
Note: The string S must contain only lowercase alphabets.
Boundary Condition(s):
1 <= Length of S <= 100 1 <= X <= 26
Input Format:
The first line contains the string S.
The second line contains the integer X.
Output Format:
The first line contains either yes or no.
Example Input/Output 1:
Input:
kickstart
20
Output:
yes
Explanation:
In the alphabetical order, the alphabet in 20th position is t.
In the string "kicks ar", the alphabet t have occurred twice.
Hence the output is yes
Example Input/Output 2:
Input:
fruit 1
Output: по
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     int n = sc.nextInt();
     char c = (char) (97+n-1);
    // System.out.print(c);
     if(s.contains(Character.toString(c))){
         System.out.print("yes");
     }
     else{
     System.out.print("no");
     }
	}
}
