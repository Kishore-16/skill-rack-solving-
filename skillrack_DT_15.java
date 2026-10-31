/*
DAILY TEST
ProgramID-8209
Skill Rack
Round up or Round down
The program must accept N integers as the input. For each integer (among N integers) the program must round up the integer to the next multiple of 10 if its unit digit is 5 or more. Else the program must round down the integer to the previous multiple of 10. Finally, the program must print the sum of N rounded integers as the output.
Note: If an integer is a multiple of 10 then no need to round up or round down.
Boundary Condition(s):
1 <= N <= 100
1 <= Each integer value <= 10^8
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the sum of N rounded integers.
Example Input/Output 1:
Input:
3 16 12 35
Output:
70
Explanation:
16 rounds up to 20.
12 rounds down to 10.
35 rounds up to 40.
So their sum is 70 (20 + 10 + 40)
Hence the output is 70
Example Input/Output 2:
Input:
5 12 490 28 11 70
Output:
610
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum =0;
    for( int i =0 ; i<n; i++){
        int m =sc.nextInt();
        sum+=(((m+5)/10)*10);
    }
    System.out.print(sum);
	}
}
