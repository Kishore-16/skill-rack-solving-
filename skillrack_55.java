/*JAVA-VERY-EASY-PART005
ProgramID-2299
SKILLRACK
Interlace odd/even from A to B.
Two numbers A and B are passed as input. The program must print the odd numbers from A to B (inclusive of A and B) interlaced with the even numbers from B to A
Input Format:
The first line denotes the value of A
The second line denotes the value of B.
Output Format:
The odd and even numbers interlaced, each separated by a space.
Boundary Conditions:
A < B <= 9999999 1 <= A <= 9999999
Example Input/Output 1:
Input:
5
11
Output
5 10 7 8 9 6 11
Explanation:
The odd numbers from 5 to 11 are 57911
The even numbers from 11 to 5 (that is in reverse direction) are 10 8 6
So these numbers are interlaced to produce 5 10789611
Example Input/Output 2:
Input:
4
14
Output
14 5 12 7 10 9 8 11 6 13 4
Explanation:
The odd numbers from 4 to 14 are 5 7 9 11 13
The even numbers from 14 to 4 (that is in reverse direction) are 14 12 10 864
So these numbers are interlaced to produce 14 5 12 7 10 9 8 11 6 13 4
(Here as the even numbers count are more than the odd numbers count we start with the even number in the output)
Example Input/Output 3:
Input:
3
12
Output
3 12 5 10 7 896114
Explanation:
The odd numbers from 3 to 12 are 3 5 7911
The even numbers from 12 to 3 (that is in reverse direction) are 12 10 8 6 4
So these numbers are interlaced to produce 3 12 5 10 7 8 9 6 114*/

import java.util.*;
public class skillrack_55 {

    public static void main(String[] args) {
		//Your Code Here
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       ArrayList<Integer> odd = new ArrayList<>();
       ArrayList<Integer> eve = new ArrayList<>();
       for(int i =a;i<=b ;i++){
           if(i%2!=0){
               odd.add(i);
           }
           else{
               eve.add(i);
           }
       }
       ArrayList<Integer> fin = new ArrayList<>();
      Collections.reverse(eve);
      int os = odd.size(), es = eve.size();
      int i=0,j=0;
      if(os>=es){
          while(i<os || j<es){
             if(i<os) fin.add(odd.get(i++));
              if(j<es) fin.add(eve.get(j++));
              
          }
      }
      else{
          while(i<os || j<es){
             if(j<es) fin.add(eve.get(j++));
             if(i<os) fin.add(odd.get(i++));
              //if(eve.size()==0) break;
          }
      }
      while(fin.size()!=0){
          System.out.print(fin.removeFirst()+" ");
      }
	}
}