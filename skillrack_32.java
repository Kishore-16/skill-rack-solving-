/*JAVA - AVERAGE - PART003
ProgramID-225
SKILLRACK
Character B follows A
Given a string S and two characters A, B the program must print the number of occurrences where A is followed by B.
Boundary Conditions:
Length of the string S is between 2 and 200.
Input Format:
First line will contain the string value S.
Second line will contain the value of A.
Third line will contain the value of B.
Output Format:
First line will contain the integer which represents the number of occurrences in sring S where A is followed by B
Sample Input/Output:
Example 1:
Input:
malayalam
a
l
Output:
2
Explanation:
The two occurrences where a is followed by l.
Example 2:
Input:
engine
e
n
Output: 1
 */

// completed in 5 mins

import java.util.*;

public class skillrack_32 {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     String s= sc.nextLine();
     char a = sc.nextLine().charAt(0);
     char l = sc.nextLine().charAt(0);
     int i=0,ctr=0;
     while(i<s.length()-1){
         if(s.charAt(i)==a && s.charAt(i+1)==l){
             ctr++;
         }
         i++;
     }
     System.out.print(ctr);
	}
}
