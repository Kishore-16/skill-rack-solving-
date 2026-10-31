/*
DAILY CHALLENGE
ProgramID-7930
Skill Rack
Positive Negative Series
The program must accept an integer N as the input. The program must print the sum of the first N terms in the series given below.
The order of the series must be 1, -2, 3, 4, 5, -6 and so on (All the odd terms in the series formed from the positive odd numbers and all the even terms in the series formed from the negative even numbers).
Boundary Condition(s):
1 <= N <= 10 ^ 4
Input Format:
The first line contains the integer N.
Output Format:
The first line contains the sum of the first N terms in the above mentioned series.
Example Input/Output 1:
Input:
5
Output:
3
Explanation:
The first 5 terms are 1, -2, 3, -4 and 5 and their sum is 3 (1 - 2 + 3 - 4 + 5)
Hence the output is 3
Example Input/Output 2:
Input:
8
Output:
-4
Max Execution Time Limit: 4000 millisecs
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =0;
    for( int i =1 ;i<=n; i++){
        if(i%2!=0){
            sum+=i;
        }
        else{
            sum+=(-1*i);
        }
    }
    System.out.print(sum);
	}
}
