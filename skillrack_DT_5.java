/*
DAILY TEST
ProgramID-8165
Skill Rack
Previous Value - Unit Tenth Digits Product
N integers are passed as input to the program. For each integer other than the first integer, the program must print the product of unit and tenth digit of the previous integer.
Boundary Condition(s):
2 <= N <= 100
10 <= Each integer value <= 100000
Input Format:
The first line contains the value of N.
The second line contains N integers separated by a space.
Output Format:
The first line contains N-1 integer values separated by a space.
Example Input/Output 1:
Input:
5 10 20 712 28 90
Output:
00216
Explanation:
For 20, the previous integer is 10. Hence 1*0 = 0.
For 712, the previous integer is 20. Hence 2*0 = 0.
For 28, the previous integer is 712. Hence 1*2 = 2.
For 90, the previous integer is 28. Hence 2*8 = 16.
Example Input/Output 2:
Input:
7 782 8923 82 19 100
Output: 16 6 16 9
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for( int i =0 ; i< n-1 ; i++){
      int a = sc.nextInt();
      int c=2,finp=1;
      while(c>0){
          finp*=a%10;
          a/=10;
         c--;
      }
      if(i==n-1 && finp==0){
          continue;
      }
      System.out.print(finp+ " ");
   }
	}
}
