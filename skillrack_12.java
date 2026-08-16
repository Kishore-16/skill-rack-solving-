// count of articles in the sentence (i.e "the","a","an") 

import java.util.*;

public class skillrack_12 {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("[^a-zA-Z]+");
        int c = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("a") || s[i].equals("the") || s[i].equals("an")) {
                c++;
            }
        }
        System.out.print(c);
    }
}
