// converting any number into base n number 
// optimal 

import java.util.*;

public class skillrack_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the base N
        int n = sc.nextInt();
        
        // Read the two numbers X and Y
        String xStr = sc.next();
        String yStr = sc.next();
        
        // Convert both from base N to base 10
        int xBase10 = Integer.parseInt(xStr, n);
        int yBase10 = Integer.parseInt(yStr, n);
        
        // Print the sum
        System.out.print(xBase10 + yBase10);
    }
}
