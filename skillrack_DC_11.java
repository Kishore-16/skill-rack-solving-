/*
DAILY CHALLENGE
ProgramID-7918
SkillRack
Toggle Case - Vowels
The program must accept a string S as the input. The program must toggle the case of vowels in the string S. Then the program must print the modified string as the output.
Boundary Condition(s):
1 <= Length of S <= 100
Input Format:
The first line contains the string S.
Output Format:
The first line contains the modified string.
Example Input/Output 1:
Input:
EquillbriUm
Output: eqUllibrlum
Explanation:
The vowels in the string "EquillbriUm" are 'E', 'u', 'i', 'T', 'i' and 'U'.
So toggle the case of all the vowels in the string "Equillbrium".
Hence the output is eqUllibrlum
Example Input/Output 2:
Input:
JUNKVIRUS
Output:
JuNKVIRUS
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    for( int i =0 ; i<s.length(); i++){
        char c = s.charAt(i);
        if("aeiouAEIOU".contains(Character.toString(c))){
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }
            else{
                c= Character.toUpperCase(c);
            }
        }
        System.out.print(c);
    }
	}
}
