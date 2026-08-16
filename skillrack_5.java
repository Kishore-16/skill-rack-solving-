// Print unique characters in descending sorted order

import java.util.*;

public class skillrack_5 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String[] s = sc.nextLine().split("");
        Arrays.sort(s, Collections.reverseOrder());
        String s1 = String.join("", s);
        // HashSet<String> n = new HashSet(s1);

        // After sorting and joining into string s1:
        System.out.print(s1.charAt(0)); // Print the first character
        for (int k = 1; k < s1.length(); k++) {
            if (s1.charAt(k) != s1.charAt(k - 1)) {
                System.out.print(s1.charAt(k));
            }
        }
    }
}
