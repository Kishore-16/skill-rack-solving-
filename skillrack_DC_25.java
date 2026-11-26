/*
DAILY CHALLENGE
ProgramID-8187
Skill Rack
Check Descending Order
The program must accept N integers as the input. The program must print yes if the integers are sorted in descending order as the output. Else the program must print no as the output.
Boundary Condition(s):
1 <= N <= 1000
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains either yes or no.
Example Input/Output 1:
Input:
6 844222
Output:
yes
Explanation:
All the 6 integers are arranged in descending order so the output is yes.
Example Input/Output 2:
Input:
8
10 10 6 8 8 664
Output: no
Max Execution Time Limit: 4000 millisecs
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int t = 99999;
      boolean f=true;
      for(int i =0;i<n;i++){
          int a = sc.nextInt();
          if(t<a){
              f=false;
          }
          t=a;
      }
      if(f){
          System.out.print("yes");
      }
      else{
          System.out.print("no");
      }
	}
}
