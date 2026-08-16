/*JAVA - AVERAGE - PART003
ProgramID-229
SKILLRACK
Maximum Repeating Count
Given an array of integers of length N, the program must find the value which repeats in maximum number of times and print the number. In case of ties, choose the smaller number and print it.
Boundary Conditions:
Length of array N will be from 2 to 100
Input Format:
First line will contain the array of integers of length N separated by one or more spaces.
Output Format:
The integer value which repeats the maximum number of times.
Sample Input/Output:
Example 1:
Input:
10 20 30 20 30 10 30 20
Output:
20
Explanation:
Both 20 and 30 repeats three times. But 20 is the smaller number and hence 20 is printed as output.
Example 2:
Input:
123592969
Output: 9
Explanation:
9 repeats thrice which is more than the repetition count of any other number.
Max Execution Time Limit: 5000 millisecs
 */

import java.util.*;

public class skillrack_35 {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     HashMap<Integer,Integer> h = new HashMap<>();
     int t;
     
     while(sc.hasNextInt()){
        t= sc.nextInt();
         h.put(t,h.getOrDefault(t,0)+1);
         }
         int max=0,minkey = 999999;
     for(int i : h.keySet()){
         if((h.get(i)>max)||( h.get(i)==max && minkey>i)){
             max=h.get(i);
             minkey=i;
         }
         
     }
     System.out.print(minkey);
	}
}
