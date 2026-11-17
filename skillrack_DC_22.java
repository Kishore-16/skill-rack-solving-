/*
DAILY CHALLENGE
ProgramID-8166
Skill Rack
Occurrences X and Y
The program must accept N integers and two integers X, Y as the input. The program must print YES if the number of occurrences of X is greater than or equal to the number of occurrences of Y. Else the program must print NO as the output.
Boundary Condition(s):
1 <= N <= 1000
1 <= X, Y Each integer value <= 10^8
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
The third line contains the values of X and Y separated by a space.
Output Format:
The first line contains either YES or NO.
Example Input/Output 1:
Input:
5
88383 83
Output:
YES
Explanation:
The number of occurrences of 8 is 3.
The number of occurrences of 3 is 2.
So 8 occurs more than 3.
Hence the output is YES
Example Input/Output 2:
Input:
7 17 12 13 12 13 14 13
12 13
Output:
NO
Max Execution Time Limit: 4000 millisecs
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String,Integer> m = new HashMap<>();
    for( int i =0 ; i<n ; i++){
        String s = sc.next();
        m.put(s,m.getOrDefault(s,0)+1);
    }
    String a = sc.next();
    String b = sc.next();
    
    if(m.getOrDefault(a,0)>=m.getOrDefault(b,0)){
        System.out.print("YES");
    }
    else{
        System.out.print("NO");
            }
	}
}
