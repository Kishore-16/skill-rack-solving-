/*
DAILY TEST
ProgramID-8403
Skill Rack
Alphabets - Every Two Consecutive
The program must accept a string S (where S always contains only lower case alphabets in alphabetical order) as the input.
The program must print all the alphabets between every two consecutive alphabets in S as the output.
Boundary Condition(s):
2 <= Length of S <= 25
Input Format:
The first line contains the string S.
Output Format:
The first line contains all the alphabets between every two consecutive alphabets in S.
Example Input/Output 1:
Input:
bej
Output:
cdfghi
Explanation:
The alphabets present between the first two consecutive alphabets (b, e) are c and d.
The alphabets present between the next two consecutive alphabets (e, j) are f, g, h and i.
Hence the output is cdfghi
Example Input/Output 2:
Input:
aeeeo
Output: bcdfghijklmn
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     char f=s.charAt(0),l=s.charAt(s.length()-1);
   // System.out.print((int)f+" "+(int)l);
    int i=(int)f+1;
    int j=(int)l;
    while(i<j){
        if(!s.contains(String.valueOf((char)i))){
            System.out.print((char)i);
        }
        i++;
	}
    }
}
