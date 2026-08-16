// Strict Professor Class Cancellation - optimised version

import java.util.*;

public class skillrack_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] start = sc.next().split(":");
        int sh = Integer.parseInt(start[0]);
        int sm = Integer.parseInt(start[1]);

        int late = 0;

        for (int i = 0; i < n; i++) {
            String[] arr = sc.next().split(":");
            int h = Integer.parseInt(arr[0]);
            int min = Integer.parseInt(arr[1]);

            if (h > sh || (h == sh && min > sm)) {
                late++;
            }
        }

        if (n - late >= m)
            System.out.print("No");
        else
            System.out.print("Yes");
    }
}
