/*
DAILY CHALLENGE
ProgramID-7856
SkillRack
String Values - Same First and Last
The program must accept two string values S1 and S2 as the input. The program must print YES if the first alphabet of S1 and the first alphabet of S2 are equal and the last alphabet of S1 and the last alphabet of S2 are equal. Else the program must print NO as the output.
Note: S1 and S2 contain only lower case alphabets.
Boundary Condition(s):
2 <= Length of S1, S * 2 <= 100
Input Format:
The first line contains the string S1.
The second line contains the string S2.
Output Format:
The first line contains either YES or NO.
Example Input/Output 1:
Input:
blackthunder
beaker
Output:
YES
Explanation:
The first alphabets of" lackthunder" and " eaker" are same.
The last alphabets of "blackthunde" and "beake are same.
Hence the output is YES
Example Input/Output 2:
Input:
first last
Output:
NO
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    String s= sc.nextLine();
    String s1 = sc.nextLine();
    if((s.charAt(0)==s1.charAt(0))&&(s.charAt(s.length()-1)==s1.charAt(s1.length()-1))){
        System.out.print("YES");
    }
    else{
        System.out.print("NO");
    }
	}
}
