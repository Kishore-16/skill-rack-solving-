// join 2 word in ascending order

import java.util.*;

public class skillrack_7 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String[] a = {s, s1};
        Arrays.sort(a);
        System.out.print(String.join("", a));
    }
}
