/*primesTwo whole numbers N1 and N2 are passed as input. The program must print the number of primes present between N1 and N2 (the range is inclusive of N1 and N2)

Input Format: First line will contain the value of the first number N1 Second line will contain the value of the second number N2 

Output Format: First line will contain the count of prime numbers between N1 and N2 

Sample Input/Output: 
Example 1: 
Input: 
6142 
6200

Output: 
6 

Explanation: The prime numbers within the range 6142 to 6200 are 6143, 6151, 6163, 6173, 6197, 6199  */

import java.util.*;

public class skillrack_3 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int fi = sc.nextInt();
        int c = 0;

        for (int j = st; j <= fi; j++) {
            if (prime(j)) {
                c++;
                // System.out.print(j);
            }
        }

        System.out.print(c);
    }

    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
