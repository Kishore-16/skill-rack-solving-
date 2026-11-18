/*
DAILY TEST
ProgramID-8355
Skill Rack
Complimentary Sweets
The program must accept an integer X and N integers representing the weight of the N sweet items. If the weight of any sweet item exceeds X then 1kg of the same sweet item will be given as complimentary. The program must print the total weight of sweets bought as the output.
Boundary Condition(s):
1 <= N_{r} weight, x <= 1000
Input Format:
The first line contains N and X separated by a space.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the total weight of sweets.
Example Input/Output 1:
Input:
5 10
5 10 15 3 20
Output:
55
Explanation:
The sweets with weight 15 and 20 exceed the given X value 10 so they 1kg is added to each.
So their weight becomes 16 and 21.
The total sum is 5 + 10 + 16 + 3 + 21 = 55
Example Input/Output 2:
Input:
55 268112
Output: 32
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();
     int x= sc.nextInt();
     int sum=0;
     for( int i=0 ;i<n;i++){
         int t =sc.nextInt();
         sum=(t>x)?sum+t+1:sum+t;
     }
     System.out.print(sum);
	}
}
