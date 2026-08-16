// identify the operator eg : 10 + 2 = 8 . so print "-"

import java.util.*;

public class skillrack_8 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("=");
        int tot = Integer.parseInt(s[1]);
        String num = "", temp = "";

        for (int i = 0; i < s[0].length(); i++) {
            if (Character.isDigit(s[0].charAt(i))) {
                num = num + s[0].charAt(i);
            } else {
                temp += num;
                num = "";
            }
        }

        int a = Integer.parseInt(temp);
        int b = Integer.parseInt(num);

        if ((a + b) == tot) {
            System.out.print("+");
        } else if ((a - b) == tot) {
            System.out.print("-");
        } else if ((a * b) == tot) {
            System.out.print("*");
        } else {
            System.out.print("/");
        }
    }
}
