/*
DAILY TEST
ProgramID-8184
Skill Rack
Chocolate Bars
ABC wants to buy exactly X kilograms of chocolate. In a chocolate shop, there are N small bar chocolates (1Kg each) and M big bar chocolates (5Kg each). The values of X, N and M are passed as input to the program. The program must print the number of small bars required to buy, assuming ABC always need big bars before small bars. If ABC is not possible to buy X kilograms of chocolate then the program must print -1 as the output.
Boundary Condition(s): 1 <= X N, M <= 10 ^ 7
Input Format:
The first line contains the values of X, N and M separated by space(s).
Output Format:
The first line contains either the number of small bars are required to buy X kilograms of chocolate or -1.
Example Input/Output 1:
Input: 951
Output: 4
Explanation:
x = 9 4 small bars (4 * 1kg) + 1 big bar (1*5kg) 4+5=9 The number of small bars required = 4. Hence the output is 4
Example Input/Output 2:
Input: 13 6 1
Output: -1
Max Execution Time Limit: 4000 millisecs

*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int big =Math.min(x/5,m);
        int remind= x-(big*5);
        if(remind<=n){
            System.out.print(remind);
        }
        else{
            System.out.print(-1);
        }
    
	}
}
