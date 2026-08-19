/*JAVA - AVERAGE - PART004
ProgramID-2
SKILLRACK
Arrange the alphabets in a string in descending order
A string (with only alphabets) S is passed as input. The program should print the alphabets in the string in descending order. Assume all alphabets will be in lower case.
Boundary Conditions:
The length of string S is between 2 and 100.
Example input and output:
If the input is "cake", the output should be "keca"
If the input is "innovation", the output should be "vtonia" (n or o or i should not be repeated)
Max Execution Time Limit: 5000 millisecs */


import java.util.*;
public class skillrack_52 {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        int j =1;
        char[] a = new char[c.length];
        a[0]=c[c.length-1];
        for( int i=c.length-2 ;i>=0 ;i--){
            if(c[i]!=c[i+1])
            a[j++]=c[i];
        }
        System.out.print(new String(a,0,j));
	}
}