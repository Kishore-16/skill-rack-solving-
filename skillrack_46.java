/*JAVA - VERY EASY - PART002
ProgramID-1958
SKILLRACK
Convert to Seconds
A integer value H denoting number of hours is passed as the input. Also an integer value M denoting the minutes is passed as the input. The program must print the sum of the seconds present in H and M.
Input Format:
The first line denotes the value of H. The second line denotes the value of M.
Output Format:
The first line denotes the value of seconds in H+M
Example Input/Output:
Input: 2
15
Output:
8100
Explanation:
2 hours has 2*60 mins * 60 seconds = 7200 seconds.
15 minutes has 15*60 = 900 seconds.
So total seconds = 7200+900 = 8100 seconds.
Max Execution Time Limit: 5000 millisecs */
import java.util.*;

public class skillrack_46 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.print((int) ((h * Math.pow(60, 2)) + m * 60));
        sc.close();
    }
}