/*JAVA - AVERAGE - PART002
ProgramID-209
SKILLRACK
Length of the line
A line is denoted by the x and y co-ordinates of the two end points. The program must print the length of the line.
Input Format:
First line will contain the x and y co-cordinates of point 1 separated by a space.
Second line will contain the x and y co-cordinates of point 2 separated by a space
Output Format:
The length of the line rounded up to two decimal places. If there is no floating point representation then a .00 is to appear at the end of the output.
Sample Input/Output:
Example 1:
Input:
0 4
3 0
Output:
5.00
Example 2:
Input:
2 2
14 7
Output:
13.00
Example 3:
Input:
0 0
3 3
Output:
4.24 */

import java.util.*;

public class skillrack_21 {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int[] p1= new int[4];
        //int[] p2= new int[2];
        for(int i =0 ; i<4 ;i+=2){
            p1[i]=sc.nextInt();
            p1[i+1]=sc.nextInt();
            sc.nextLine();
        }
       double x = p1[0]-p1[2];
       double y = p1[1]-p1[3];
       double d = Math.sqrt(x*x + y*y);
       System.out.printf("%.2f",d);
	}
}

//     5 min
