/*JAVA - AVERAGE - PART002
ProgramID-2623
SKILLRACK
Strict Professor Class Cancellation
In a college, a professor is strict and mandates that at least M students out of the total N students must arrive on time to his class. Else he would cancel the class. The start time of the class is also passed as the input. The individual arrival time for N students is also passed as input in 24 hour format.
The program must print if the class was cancelled or not.
Input Format:
The first line will contain N and M separated by a space.
The second line will contain the start time of the class.
The third line will contain the arrival time of the N students separated by one or more space(s).
Output Format:
First line will contain either Yes or No (Yes for cancellation of the class and No if the class is not cancelled).
Boundary Conditions:
2 <= M <= N
3 <= N <= 50
Example Input/Output 1:
Input:
5 3
9:30
9:30 9:38 9:31 9:32 9:31
Output:
Yes
Explanation:
4 out of the 5 students arrived late, which means only one arrived on time. As the professor has mandated 3 out of the 5 must arrive on time, the class was cancelled and hence Yes is printed as the output.
Example Input/Output 2:
Input:
6 4
11:10
10:30 10:40 10:55 11:20 11:10 11:12
Output:
No */

// my solution 
import java.util.*;

public class skillrack_18 {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt(),c=0;
     sc.nextLine();
      int[] check = new int[2];
      String[] inp =  sc.nextLine().split(":");
      for(int i=0 ; i<2 ;i++){
          check[i]=Integer.parseInt(inp[i]);
      }
      inp = sc.nextLine().split(" ");
      for(String s : inp){
          String[] inner = s.split(":");
          
              if(check[0]<Integer.parseInt(inner[0])){
                  c++;
              }
              else if((Integer.parseInt(inner[1])>check[1])&&(check[0]==Integer.parseInt(inner[0]))){
                  c++;
              }
              //System.out.print(c);
          
      }
      if(m<=(n-c)){
          System.out.print("No");//y
      }
      else{
          System.out.print("Yes");//n
      }
	}
}
