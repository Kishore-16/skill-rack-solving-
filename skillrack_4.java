// next prime no. 

import java.util.*;

public class skillrack_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (true) {
            num++; // Increment to check the next number
            if (isPrime(num)) {
                System.out.print(num);
                break; // Exit once the next prime is found
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false; // Handle even numbers

        // Check odd divisors up to the square root
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
