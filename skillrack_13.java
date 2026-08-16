/* 
   Minimum Distance Between Words [AMAZON]

A string S is passed as the input. Two words W1 and W2 which are present in the string S are also passed as the input.
 The program must find the minimum distance D between W1 and W2 in S (in forward or reverse order) and print D as the output.

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
quick and the are adjacent as the last two words.
 Hence distance between them is 1.

Example Input/Output 2:

Input:
the quick the brown quick brown the frog
quick
frog
Output:
3
*/

import java.util.*;

public class skillrack_13 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int in1 = -1, in2 = -1, min = 999999;

        for (int i = 0; i < s.length; i++) {
            if (s1.equals(s[i])) {
                in1 = i;
            }
            if (s2.equals(s[i])) {
                in2 = i;
            }
            if (min > Math.abs(in1 - in2) && (in1 != -1 && in2 != -1)) {
                min = Math.abs(in1 - in2);
            }
        }
        System.out.print(min);
    }
}
