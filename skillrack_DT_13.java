/*
DAILY TEST
ProgramID-8197
Skill Rack
First Consecutive Digits
The program must accept an integer N as the input. The program must print the first occurring consecutive odd digits if the first digit is odd as the output. Else the program must print the first occurring consecutive even digits as the output.
Boundary Condition(s):
1 <= N <= 10 ^ 8
Input Format:
The first line contains the integer N.
Output Format:
The first line contains the consecutive digits without any space.
Example Input/Output 1:
Input: 157894
Output: 157
Explanation:
The first digit is odd so the first occurring consecutive odd digits 1, 5 and 7 are printed.
Example Input/Output 2:
Input: 601648
Output: 60
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = true;
        if(Integer.parseInt(Character.toString(s.charAt(0)))%2==0){
            flag = true;
        }
        else{
            flag =false;
        }
        for( int i =0 ;i<s.length() ;i++){
            int t =Integer.parseInt(Character.toString(s.charAt(i)));
            if(flag==true && t%2==1){
                break;
            }
            if(flag == false && t%2==0){
                break;
            }
            System.out.print(t);
        }
	}
}
