/*
DAILY TEST
ProgramID-8239
Skill Rack
Make Odd/Even
The program must accept N integers as the input. The program must calculate the count of odd and even integers.
- If the count of odd integers is greater than the count of even integers, then the program must make all the odd integers as even integers by adding 1 to it.
- If the count of even integers is greater than the count of odd integers, then the program must make all the even integers as odd integers by subtracting 1 from it.
- If the count of odd integers is equal to the count of even integers, then the program must make all the odd integers as even integers by adding 1 to it and all the even integers as odd integers by subtracting 1 from it.
Finally, the program must print the modified values of N integers in the same order of occurrence as in the input.
Boundary Condition(s):
1 <= N <= 100
-999 <= Each integer value <= 999
Input Format:
The first line contains the value of N.
The next line contains N values separated by a space.
Output Format:
The first line contains N integer values separated by a space.
Example Input/Output 1:
Input:
6
-2-5-4378
Output:
-3-4-5487
Explanation:
Here the count of odd and even integers is 3.
The first integer is -2 which is even. So subtract 1 from it. Now it becomes -3.
The second integer is -5 which is odd. So add 1 to it. Now it becomes -4.
The third integer is -4 which is even. So subtract 1 from it. Now it becomes -5.
The fourth integer is 3 which is odd. So add 1 to it. Now it becomes 4.
The fifth integer is 7 which is odd. So add 1 to it. Now it becomes 8.
The sixth integer is 8 which is even. So subtract 1 from it. Now it becomes 7.
Example Input/Output 2:
Input:
7
-88-3 15 35 61 62 99
Output:
-88-2 16 36 62 62 100
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr = new int[n];
    int c=0;
    for( int i= 0 ; i<n ; i++){
        int a = sc.nextInt();
       // System.out.print(a-1);
        arr[i]=a;
        if(a%2==0){
            c++;
        }
    }
    for(int i=0; i<n;i++){
    if(n-c>c){
        arr[i]=(arr[i]%2==0)?arr[i]:arr[i]+1;
    }else if(n-c<c){
        arr[i]=(arr[i]%2==0)?arr[i]-1:arr[i];
    }
    else{
        arr[i]=(arr[i]%2==0)?arr[i]-1:arr[i]+1;
    }
    System.out.print(arr[i]+" ");
    }
	}
}
