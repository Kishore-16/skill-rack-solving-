/*
DAILY CHALLENGE
ProgramID-7911
Skill Rack
Remove First K Rows and Columns
The program must accept an integer matrix of size NxN and an integer K as the input. The program must remove the first K rows and the first K columns from the matrix. Then the program must print the modified matrix as the output.
Boundary Condition(s):
2 <= N <= 50
-999 <= Each element of the matrix <= 999
1 <= K < N
Input Format:
The first line contains the value of N.
The next N lines each contain N integers separated by space(s).
The (N + 2) ^ (th) line contains the value of K.
Output Format:
The first N-K lines each contain N-K integers of the modified matrix separated by a space.
Example Input/Output 1:
Input:
4
20 2 10
16
20 17 11 6
14 16
13
10 2 17 4
2
Output:
13
174
Explanation:
Here the value of K is 2. So remove the first 2 rows and the first 2 columns from the matrix.
Hence the output is
13
174
Example Input/Output 2:
Input:
5
77
62
21
47
45 64 61 91
44
44 12 63 22 57
64
31 58 57 99 44
72
40
34
29 61
1
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[][] ar = new int[n][n];
   for(int i=0 ; i<n ; i++){
       for(int j=0;j<n;j++){
       ar[i][j]=sc.nextInt();
       }
   }
   int k =sc.nextInt();
   for( int i =k; i<n;i++){
       for(int j=k ;j<n ;j++){
           System.out.print(ar[i][j] +" ");
       }
       System.out.print("\n");
   }
	}
}
