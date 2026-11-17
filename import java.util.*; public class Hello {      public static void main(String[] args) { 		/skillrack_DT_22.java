/*
DAILY TEST
ProgramID-8344
Skill Rack
Closer to X
The program must accept N integers and an integer X as the input. The program must print the integer which is closer to X. If there are two or more such integers then the program must print those integers in the given order as the output.
Boundary Condition(s):
1 <= N <= 1000
1 <= X_{t} Each integer value <= 10^9
Input Format:
The first line contains the values of N and X separated by a space.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the integer(s) which is closer to X.
Example Input/Output 1:
Input:
5 25
21 26 30 28 24
Output:
26 24
Explanation:
26 and 24 are closer to the integer 25. So they are printed as the output.
Example Input/Output 2:
Input:
750 45 60 20 56 45 30 40
Output:
45 45
Max Execution Time Limit: 4000 millisecs
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int a = sc.nextInt();
   int[] arr= new int[n];
   int ptr1=99999;
   for( int i= 0;i<n;i++){
       arr[i]=sc.nextInt();
       if(Math.abs(arr[i]-a) <ptr1){
           ptr1=Math.abs(arr[i]-a);
       }
   }
   for( int i=0 ;i<n;i++){
       if(Math.abs(arr[i]-a) == ptr1){
           System.out.print(arr[i]+" ");
       }
   }
	}
}
