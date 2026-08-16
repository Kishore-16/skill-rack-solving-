// Minimum Distance Between Words [AMAZON]
// above code is o(n) complexity even the code in the official solution in o(n^2)
//  but the below one is the correct version that satisfy all the condition [same word but diff counts

import java.util.*;

public class skillrack_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String w1 = sc.nextLine().trim();
        String w2 = sc.nextLine().trim();

        int lastW1 = -1, lastW2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(w1)) {
                lastW1 = i;
                if (lastW2 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastW1 - lastW2));
                }
            }
            if (s[i].equals(w2)) {
                lastW2 = i;
                if (lastW1 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastW1 - lastW2));
                }
            }
        }
        System.out.print(minDistance);
    }
}
