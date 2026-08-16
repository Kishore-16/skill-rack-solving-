/*JAVA - AVERAGE - PART004
ProgramID-2666
SKILLRACK
Matrix Diagonals Sum
You are given a square matrix of size NxN. Calculate the sum of the integers present in the two main diagonals.
Input Format:
The first line will contain the value of N.
The next N lines will contain the N values separated by one or more spaces.
Output Format:
The sum of the integers present in the two main diagonals.
Boundary Conditions:
2 <= N <= 20
Example Input/Output 1:
Input:
2
10 9
4 22
Output:
45
Explanation:
The sum s = 10 + 22 + 9 + 4 = 45
Example Input/Output 2:
Input:
3
5 10 11
79 6 12
9 21 45
Output:
76
Explanation:
The sum is = 5 + 6 + 45 + 11 + 9 = 76
As 6 is common for both the diagonals it must be counted only once when finding the sum.
Max Execution Time Limit: 5000 millisecs
 */

import java.util.*;

public class skillrack_39 {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int sum=0;
    int[][] mat = new int[n][n];
    
    for(int i=0 ; i<n ; i++){
        for( int j=0 ; j<n ; j++){
            mat[i][j]=sc.nextInt();
        }
    }
    for(int i =0 ; i<n ;i++){
        for(int j=0 ; j<n ;j++){
            if(i==j || i+j == n-1){
                sum+=mat[i][j];
            }
        }
    }
    System.out.print(sum);
	}
}
