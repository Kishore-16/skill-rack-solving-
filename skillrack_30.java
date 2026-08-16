/* optimal solutions for the above version (Find the digital sum) */

public class skillrack_30 {
    public static int getDigitalSum(long num) {
        // Handle negative numbers by converting to positive
        num = Math.abs(num);
        
        if (num == 0) return 0;
        
        // Mathematical formula (Casting out nines)
        return (num % 9 == 0) ? 9 : (int)(num % 9);
    }

    public static void main(String[] args) {
        long number = 4956;
        System.out.println("The digital sum of " + number + " is: " + getDigitalSum(number));
        // Output: 6
    }
}
