/*DAILY CHALLENGE
ProgramiD-8162
Skill Rack
Middle Integers Within Range
N integers are passed as input to the program. The program must print YES if all the N-2 integers between first and last integers are greater than the first integer and lesser than the last (Nth) integer. Else the program must print NO as the output.
Boundary Condition(s):
1 <= N <= 100
Input Format:
The first line contains the value of N.
The second line contains N integers separated by a space.
Output Format:
The first line contains either YES or NO
Example Input/Output 1:
Input:
5 10 20 12 18 90
Output:
YES
Explanation:
20 12 18 all three are greater than 10 and lesser than 90. Hence YES is printed.
Example Input/Output 2:
Input:
5 10 20 12 18 19
Output: NO
Explanation:
20 is not lesser than 19. Hence NO is printed.
Max Execution Time Limit: 4000 millisecs

*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   boolean f = true;
   int[] arr = new int[n];
   for(int i =0 ; i<n;i++){
       arr[i]=sc.nextInt();
   }
   for(int i=1;i<n-1;i++){
       if((arr[i]<=arr[0])||(arr[i]>=arr[n-1])){
           f=false;
           break;
       }
   }
   if(f){
       System.out.print("YES");
   }
   else{
       System.out.print("NO");
   }
	}
}
