/*
DAILY TEST
ProgramID-8181
SkillRack
Start End Characters Till Equal
A string is passed as the input. The program must print the characters from the beginning and end alternatively until both the characters being printed are same.
Boundary Condition(s):
1 <= Length of String <= 100
Input Format:
The first line contains the value of S.
Output Format:
The first line contains the output string value.
Example Input/Output 1:
Input:
pollution
Output:
pnoo
Explanation:
The first character from the beginning is p and the first character from the end is n. So pn is printed. Both these characters are not equal. Hence we proceed to the next characters and hence oo is printed. Here both these characters are equal. Hence we stop further. Hence pnoo is the output.
Example Input/Output 2:
Input:
abcde
Output:
aebdc
Max Execution Time Limit: 4000 millisecs
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int f =0 , l = s.length()-1;
      boolean flag = true;
      while(flag){
          if(s.charAt(f)==s.charAt(l)){
              flag=false;
          }
          if(f==l){
          System.out.print(s.charAt(f)+"");
          }
          else{
              System.out.print(s.charAt(f)+""+s.charAt(l)+"");
          }
          f++;
          l--;
          if(f>l){
              flag=false;
          }
      }
	}
}


//alternat version of code best version
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        
        String s = sc.nextLine().trim();
        int left = 0;
        int right = s.length() - 1;
        
        StringBuilder sb = new StringBuilder();
        
        while (left <= right) {
            // Append character from the beginning
            char chLeft = s.charAt(left);
            sb.append(chLeft);
            
            // If pointers meet at the exact same position, stop
            if (left == right) {
                break;
            }
            
            // Append character from the end
            char chRight = s.charAt(right);
            sb.append(chRight);
            
            // If both characters printed in this turn are equal, stop
            if (chLeft == chRight) {
                break;
            }
            
            left++;
            right--;
        }
        
        System.out.println(sb.toString());
    }
}
