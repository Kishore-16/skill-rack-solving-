/*
DAILY CHALLENGE
ProgramID-7916
Skill Rack
Reverse Middle K Characters
The program must accept a string S and an integer K as the input. The program must reverse the middle K characters in S.
Then the program must print the modified string as the output.
Note: The length of S and the integer K are always either odd or even.
Boundary Condition(s):
1 <= Length of S <= 100
1 <= K <= Length of S
Input Format:
The first line contains the string S.
The second line contains the integer K.
Output Format:
The first line contains the modified string.
Example Input/Output 1:
Input:
acknowledgement
7
Output:
acknegdelwoment
Explanation:
The middle 7 characters are 'o', 'w', 'I', 'e', 'd', 'g' and 'e'.
After reversing the middle 7 characters, the string becomes
ackn
ment
Hence the output is acknegdelwoment
Example Input/Output 2:
Input:
bottle
4
Output:
blttoe
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int n = sc.nextInt();
      int remind = s.length()-n;
      int remmid=remind/2;
      String fin = "";
      fin += s.substring(0,remmid);
      fin += new StringBuilder(s.substring(remmid,remmid+n)).reverse().toString();
      fin += s.substring(remmid+n);
      System.out.print(fin);
      
        
    }
}
