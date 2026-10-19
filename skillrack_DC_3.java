/*
DAILY CHALLENGE
ProgramID-7858
SkillRack
First and Last Three Bits
The program must accept an integer N as the input. The program must the decimal equivalent of the first three bits and the last three bits in the binary representation of N as the output.
Boundary Condition(s): 4 <= N <= 10 ^ 8
Input Format:
The first line contains the value of N.
Output Format:
The first line contains the decimal equivalent of the first three bits and the last three bits separated by a space.
Example Input/Output 1:
Input: 86
Output: 56
Explanation:
The binary representation of 86 is 1010110.
The decimal equivalent of the first three bits (101) in the binary presentation of 86 is 5.
The decimal equivalent of the last three bits (110) in the binary presentation of 86 is 6.
Hence the output is 5 6
Example Input/Output 2:
Input: 7
Output: 77
Max Execution Time Limit: 4000 millisecs
*/


import java.util.*;
public class Hello {
    public static String binstr(long l){
        StringBuilder str =new StringBuilder();
        long rem =0;
        if(l ==0 ){
            return "0";
        }
        while(l>0){
            rem = l%2;
            str.append(rem);
            l/=2;
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     long n = sc.nextLong();
     String s = binstr(n);
     //String s = Long.toBinaryString(l);
     int first = Integer.parseInt(s.substring(0,3),2);
     int last = Integer.parseInt(s.substring(s.length()-3),2);
     System.out.print(first+" "+last);
     
	}
}
