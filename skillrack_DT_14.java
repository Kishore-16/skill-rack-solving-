/*
DAILY TEST
ProgramID-8185
Skill Rack
Print from Last Odd Integer
The program must accept N integers as the input. The program must print the integers in reverse order starting from the last occurring odd integer to the first integer as the output.
Note: There will be at least one odd integer.
Boundary Condition(s):
1 <= N <= 1000
Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the integers separated by a space.
Example Input/Output 1:
Input:
7 24157810
Output:
75142
Explanation:
The last occurring odd integer among N integers is 7.
So all the integers from 7 to the first integer are printed in reverse order as the output.
Example Input/Output 2:
Input:
8 51 401 925 207 827 164 976 118
Output:
827 207 925 401 51
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0 ; i<n ; i++){
            int num = sc.nextInt();
            a.add(num);
        }
        while(!a.isEmpty()){
            
        int m = a.removeLast();
        
        if(m%2==1){
             flag =false;
        }
        if(!flag){
            System.out.print(m+" ");
        }
        }
	}
}
