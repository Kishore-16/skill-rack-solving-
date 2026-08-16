/*

Input Format: The first line contains L. 

Output Format: The first line contains the average speed S. 

Boundary Conditions: Length of L will be from 3 to 100. 

Example Input/Output 1: 
Input: 60@2 120@3 

Output:
36.00 kmph 

Explanation:
Total distance = 60+120 = 180 km. 
Total time taken = 2+3 = 5 hours. 
Hence average speed = 180/5 = 36.00 kmph
 */

import java.util.*;

public class skillrack_2 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int d = 0, t = 0;
        for (int i = 0; i < s.length; i++) {
            String[] temp = s[i].split("@");
            d += Integer.parseInt(temp[0]);
            t += Integer.parseInt(temp[1]);
        }
        double dob = (double) d / t; // first double cast in the numerator helps to maintain our decimal
        System.out.printf("%.2f kmph", dob);
    }
}
