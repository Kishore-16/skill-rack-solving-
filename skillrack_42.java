
/*JAVA - VERY EASY - PART003
ProgramID-2200
SKILLRACK
Hyper Market Discount
Malini goes to BestSave hyper market to buy grocery items. BestSave hyper market provides 10% discount on the bill amount B
when ever the bill amount B is more than Rs.2000.
The bill amount B is passed as the input to the program. The program must print the final amount A payable by Malini.
Input Format:
The first line denotes the value of B.
Output Format:
The first line contains the value of the final payable amount A.
Example Input/Output 1:
Input:
1900
Output:
1900
Example Input/Output 2:
Input: 3000
Output: 2700
Max Execution Time Limit: 5000 millisecs */
import java.util.*;

public class skillrack_42 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b > 2000) {
            b = b - (b / 10);
            System.out.print(b);
        } else {
            System.out.print(b);
        }

    }
}
