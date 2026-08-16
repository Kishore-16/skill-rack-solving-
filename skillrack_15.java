/*Given a string S, the program must print the count of sub palindromes (with a minimum length of two characters) in the string S.
Boundary Conditions:
Length of the string is between 2 and 200.
Input Format:
First line will contain the string value S.
Output Format:
First line will contain the integer which represents the count of sub palindromes in the string S.
Sample Input/Output:
Example 1:
Input:
everest
Output:
2
Explanation:
The sub palindromes are eve, ere
Example 2:
Input:
abccbaab
Output:
5
Explanation:
The sub palindromes are cc, bccb, aa, baab, abccba */

import java.util.*;

public class skillrack_15 {

    public static void main(String[] args) {
		//Your Code Here
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int len = s.length();
       int c=0;
       for(int i=0 ; i<len-1; i++){
           for(int j = i+1; j<len ;j++){
               String temp= s.substring(i,j+1);
               if(temp.equals(new StringBuilder(temp).reverse().toString())){
                   c++;
                   //System.out.print(temp+" ");
               }
           }
       }
       System.out.print(c);
	}
}

// time taken to solve 5min
