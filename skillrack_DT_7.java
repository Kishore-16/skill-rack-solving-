/*
DAILY TEST
ProgramID-8163
Skill Rack
Four Equal Substring
The program must accept a string S as the input. The program must print yes if the string is formed by four same substring values. Else the program must print no as the output.
Note: The string length is always divisible by 4.
Boundary Condition(s):
4 <= Length of the string <= 1000
Input Format:
The first line contains the string S.
Output Format:
The first line contains either yes or no.
Example Input/Output 1:
Input:
tentententen
Output:
yes
Explanation:
The string is formed by four substring value of "ten".
Example Input/Output 2:
Input:
helheloneone
Output:
no
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length()/4;
        String t1 = s.substring(0,n);
        int ind =n;
        while(ind<s.length()){
            if(!t1.equals(s.substring(ind,ind+n))){
                System.out.print("no");
                return;
            }
            ind+=n;
        }
        System.out.print("yes");
	}
}
