/*JAVA - AVERAGE - PART004
ProgramID-235
SKILLRACK
Toggle Case
Simon wishes to convert lower case alphabets to upper case and vice versa. Help Simon by writing a program which will accept a
string value S as input and toggle the case of the alphabets.
Numbers and special characters remain unchanged.
Input Format:
First line will contain the string value S
Output Format:
First line will contain the string value with the case of the alphabets toggled.
Constraints:
Length of S is from 2 to 100
Sample Input/Output:
Example 1:
Input: GooD MORniNg12_3
Output: gOOd MorNInG12_3
Example 2:
Input: R@1nBow
Output: r@1NbOW
Max Execution Time Limit: 5000 millisecs
 */

import java.util.*;

public class skillrack_38 {

    public static void main(String[] args) {
		//Your Code Here
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int i =0;
       while(i<s.length()){
           char c = s.charAt(i);
           if(Character.isLetter(c)){
           if(Character.isUpperCase(c)){
               System.out.print(Character.toLowerCase(c));
           }else{
               System.out.print(Character.toUpperCase(c));
           }}
           else{
               System.out.print(c);
           }
           i++;
       }
	}
}
