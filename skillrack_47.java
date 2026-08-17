
/*JAVA - VERY EASY - PART002
ProgramID-1957
SKILLRACK
Square Top Right Co-ordinates
The bottom left point co-ordinates of a square are passed as input. The length of the side of the square is also passed as the input.
The program must print the co-ordinates of the top right point of the square.
Input Format:
The first line denotes the x co-ordinate of the bottom left point.
The second line denotes the y co-ordinate of the bottom left point.
The third line denotes the length of the side of the square.
Output Format:
The first line denotes the x co-ordinate of the top right point.
The second line denotes the y co-ordinate of the top right point.
Example Input/Output 1:
Input:
0
0
5
Output:
5
5
Example Input/Output 2:
Input:
-10
-2
7
Output:
-3
5
Max Execution Time Limit: 5000 millisecs
 */
import java.util.*;

public class skillrack_47 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l = sc.nextInt();
        System.out.print(a + l + "\n" + (b + l));
        sc.close();
    }
}
