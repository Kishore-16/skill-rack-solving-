// fav question in java

/*JAVA-VERY-EASY - PART002
ProgramID-1959
SKILLRACK
Money with Baba
Baba is very kind to beggars and every day Baba donates half of the amount he has when ever a beggar requests him. The money M left in Baba's hand is passed as the input and the number of beggars B who received the alms are passed as the input. The program must print the money Baba had in the beginning of the day.
Input Format:
The first line denotes the value of M.
The second line denotes the value of B.
Output Format:
The first line denotes the value of money with Baba in the beginning of the day.
Example Input/Output:
Input:
100
2
Output:
400
Explanation:
Baba donated to two beggars. So when he encountered second beggar he had 100^ * 2 = Rs * 0.2 and when he encountered 1st he had 200^ * 2 = Rs * 0.4 .
Max Execution Time Limit: 5000 millisecs
 */
import java.util.*;

public class skillrack_51 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int baba = sc.nextInt();
        int c = sc.nextInt();
        while (c > 0) {
            baba *= 2;
            c--;
        }
        System.out.print(baba);
        sc.close();
    }
}
