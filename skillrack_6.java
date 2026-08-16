// odd letters as caps and even letters as small

import java.util.*;

public class skillrack_6 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int i = 0;
        while (i < s.length) {
            for (int j = 0; j < s[i].length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(Character.toUpperCase(s[i].charAt(j)));
                } else {
                    System.out.print(Character.toLowerCase(s[i].charAt(j)));
                }
            }
            System.out.print(" ");
            i++;
        }
    }
}
