
/*JAVA - VERY EASY- PART003
ProgramID-1999
SKILLRACK
Print smaller number
Two numbers A and B are passed as input. The program must print the smaller number. If both A and B are equal, the print the output as the string value EQUAL
Input Format:
The first line denotes the value of A.
The first line denotes the value of B.
Output Format:
The first line contains the output value as per the conditions provided.
Boundary Conditions:
Example Input/Output 1:
Input:
55
55
Output:
EQUAL
Example Input/Output 2:
Input:
901 122
Output:
122
Example Input/Output 3:
Input:
4555
233901
Output:
4555 */
import java.util.*;

public class skillrack_43 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.print(b);
        } else if (b > a) {
            System.out.print(a);
        } else {
            System.out.print("EQUAL");
        }
    }
}
