/*
DAILY TEST
ProgramID-7979
Skill Rack
Characters Between Hash
The program must accept a string value S as the input. The program must print only the characters present between the character "#" as the output.
Boundary Condition(s):
1 <= Length of S <= 100
Input Format:
The first line contains the string S.
Output Format:
The first line contains the characters present between the character "#".
Example Input/Output 1:
Input:
Dhoni#007#wghba56#sfsfga
Output:
007wghba56
Explanation:
The characters between the first "#" and the second "#" in the string "Dhoni#007#wghba56#sfsfga" is 007.
The characters between the second "#" and the third "#" in the string "Dhoni#007#wghba56#sfsfga" is wghba56.
Hence the output is 007wghba56
Example Input/Output 2:
Input:
#dsvnsxvz#
Output: dsvnsxvz
Max Execution Time Limit: 4000 millisecs
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int f=-1,l=-1,k=0;
    int[] ind = new int[100];
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#'){
            ind[k++]=i;
        }
    }
    for(int j =0;j<k-1;j++){
        System.out.print(s.substring(ind[j]+1,ind[j+1]));
    }
	}
}
