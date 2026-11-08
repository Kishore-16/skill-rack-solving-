/*
DAILY TEST
ProgramID-8265
Skill Rack
Print up to Maximum
The program must accept N integers as the input. The program must print integers up to the maximum integer among the N integers in the same order as in the input. If the maximum integer has occurred more than once then consider the first occurred one.
Boundary Condition(s):
1 <= N <= 100
-9999 <= Each integer value <= 9999
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains integer values separated by a space.
Example Input/Output 1:
Input:
6
54 30-28 21 93
44
Output:
54 30-28 21 93
Explanation:
The maximum integer value is 93 (among the given 6 integers).
So the integers up to the occurrence 93 are printed.
Example Input/Output 2:
Input:
9
635-35 55-44-39-19 63-42
Output:
63
Max Execution Time Limit: 4000 millisecs
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr =new int[n];
    int max=-9999,maxp=-1;
    for(int i =0 ; i<n ; i++){
         arr[i] = sc.nextInt();
        if(arr[i]>max){
            maxp=i;
            max=arr[i];
        }
    }
    for(int i=0 ; i<=maxp;i++){
        System.out.print(arr[i]+" ");
    }
	}
}
