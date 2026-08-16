// capitalize the first letter in every word

import java.util.*;

public class skillrack_11 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        System.out.print(Character.toUpperCase(s[0]));
        for (int i = 1; i < s.length; i++) {
            if (i < s.length - 1) {
                if (s[i] == ' ' && s[i + 1] != ' ') {
                    s[i + 1] = Character.toUpperCase(s[i + 1]);
                    System.out.print(s[i]);
                    continue;
                }
            }
            System.out.print(s[i]);
        }
    }
}
