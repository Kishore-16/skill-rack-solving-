/*
DAILY CHALLENGE
ProgramID-7933
Skill Rack
Reversed String Pattern
The program must accept a string value S as the input. The program must print the desired pattern as shown in the Example Input/Output section.
Boundary Condition(s):
1 <= S <= 100
Input Format:
The first line contains the string S.
Output Format:
The first N lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
happy
Output:
h
pa
*yp
Example Input/Output 2:
Input:
orange
Output:
ar
egn
Max Execution Time Limit: 4000 millisecs
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int ind=0;
      for( int i =1 ;ind<s.length() ; i++){
          int end =Math.min(ind+i,s.length());
          int count =i-(end-ind);
          while(count>0){
              System.out.print("* ");
              count--;
          }
          
          for( int j =end-1 ; j>=ind ;j--){
              System.out.print(s.charAt(j));
              if(j>ind){
                  System.out.print(" ");
              }
          }
          System.out.print("\n");
          ind=end;
      }
	}
}
