/*
DAILY TEST
ProgramID-7973
Skill Rack
String with more Consonants
The program must accept two string values S1 and S2 as the input. The program must print the string having the most number of consonants. If both the string values have the same number of consonants then the program must print the string having the larger length as the output.
Note: The input string values will not have the same number of consonants with the same length.
Boundary Condition(s):
1 <= Length of S1, S * 2 <= 100
Input Format:
The first line contains the string S1.
The second line contains the string S2.
Output Format:
The first line contains either the string S1 or S2 based on the conditions mentioned above.
Example Input/Output 1:
Input:
first
cry
Output:
first
Explanation:
The string " i "has 4 consonants.
The string" "has 3 consonants.
So 4 is greater than 3.
Hence the output is first
Example Input/Output 2:
Input:
about
hello
Output:
hello
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {
    public static int counter(String s){
        int count  =0 ;
        for( int i =0 ; i<s.length(); i++){
        char c = Character.toLowerCase(s.charAt(i));
        if(!"aeiou".contains(Character.toString(c))){
            count++;
        }
        }
        return count;
    }

    public static void main(String[] args) {
		//Your Code Here
   Scanner sc = new Scanner(System.in);
   String  s1 = sc.nextLine();
   String  s2 = sc.nextLine();
   if(counter(s1)>counter(s2)){
       System.out.print(s1);
   }
   else{
       System.out.print(s2);
   }
   }
}
