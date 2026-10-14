/*JAVA - AVERAGE - PART001
ProgramID-2614
SKILLRACK
Minimum Distance Between Words [AMAZON]
A string S is passed as the input. Two words W1 and W2 which are present in the string S are also passed as the input. The program must find the minimum distance D between W1 and W2 in S (in forward or reverse order) and print D as the output.
Input Format:
The first line will contain S.
The second line will contain W1.
The third line will contain W2.
Output Format:
The first line will contain D - the minimum distance between W1 and W2 in S.
Boundary Conditions:
Length of S is from 5 to 200.
Example Input/Output 1:
Input:
the brown quick frog quick the
the
quick
Output:
1
Explanation:
quick and the are adjacent as the last two words. Hence distance between them is 1.
Example Input/Output 2:
Input:
the quick the brown quick brown the frog
quick frog
Output: 3
Max Execution Time Limit: 5000 millisecs */

// my version 
import java.util.*;

public class skillrack_54 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String f = sc.next();
        String l = sc.next();
        int min = s.length;
        int ind1 = -1, ind2 = -1;

        if (f.equals(l)) {
            int prev = -1;
            for (int i = 0; i < s.length; i++) {
                if (s[i].equals(f)) {
                    if (prev != -1) {
                        min = Math.min(min, i - prev);
                    }
                    prev = i;
                }
            }
        } else {

            for (int i = 0; i < s.length; i++) {
                /*
                 * if(ind1!=-1 && ind2!= -1){
                 * int curr = Math.abs(ind1-ind2);
                 * if(curr<min){
                 * min = curr;
                 * }
                 * }
                 */
                if (s[i].equals(f)) {
                    ind1 = i;
                    if (ind2 != -1) {
                        min = (min > Math.abs(ind1 - ind2)) ? Math.abs(ind1 - ind2) : min;
                    }

                }
                if (s[i].equals(l)) {
                    ind2 = i;
                    if (ind1 != -1) {
                        int t = Math.abs(ind1 - ind2);
                        min = (min > t) ? t : min;
                    }
                }
            }
        }
        System.out.print(min);
    }
}

// clear variable version
/*
 * import java.util.*;
 * 
 * public class Hello {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * // Read the string and the two target words
 * String S = sc.nextLine();
 * String w1 = sc.next();
 * String w2 = sc.next();
 * 
 * // Split the string into an array of words
 * String[] words = S.split("\\s+");
 * int minDistance = Integer.MAX_VALUE;
 * 
 * // Case 1: The two target words are identical
 * if (w1.equals(w2)) {
 * int prevIdx = -1;
 * for (int i = 0; i < words.length; i++) {
 * if (words[i].equals(w1)) {
 * if (prevIdx != -1) {
 * minDistance = Math.min(minDistance, i - prevIdx);
 * }
 * prevIdx = i;
 * }
 * }
 * }
 * // Case 2: The two target words are different
 * else {
 * int lastW1 = -1;
 * int lastW2 = -1;
 * 
 * for (int i = 0; i < words.length; i++) {
 * if (words[i].equals(w1)) {
 * lastW1 = i;
 * if (lastW2 != -1) {
 * minDistance = Math.min(minDistance, lastW1 - lastW2);
 * }
 * } else if (words[i].equals(w2)) {
 * lastW2 = i;
 * if (lastW1 != -1) {
 * minDistance = Math.min(minDistance, lastW2 - lastW1);
 * }
 * }
 * }
 * }
 * 
 * // Print the final minimum distance
 * System.out.print(minDistance);
 * }
 * }
 */