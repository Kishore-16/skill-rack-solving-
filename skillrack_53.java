/*JAVA-AVERAGE-PART004
ProgramID-207
SKILLRACK
String Letters comparison
Two string values 51 and 52 are passed as input. The program must check if both 51 and 52 contain the same unique set of letters and print YES or NO. Assume all the letters (alphabets) are in smaller case.
Boundary Conditions:
Length of 51 is from 2 to 100
Length of S2 is from 2 to 100
Input Format:
First line will contain the string value of 51 Second line will contain the string value of S2
Output Format:
YES or NO depending on if both 51 and S2 contain the same set of unique letters.
IMPORTANT:
Please note that the output is CASE SENSITIVE. Hence print YES or NO (instead of yes or no)
Sample Input/Output:
Example 1:
Input:
read
dear
Output
YES
Explanation:
Both 51 and 52 are formed using the letters - a der
Example 2:
Input
record
decoder
Output YES
Explanation:
Both S1 and S2 are formed using the letters - c deor
Example 3:
Input:
energy synergy
Output NO
Explanation:
S2 has additional letter - s in it.
Max Execution Time Limit: 50 millisecs*/


import java.util.*; 
public class skillrack_53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String s1 = sc.nextLine();

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char ch : s.toCharArray()) {
            set1.add(ch);
        }

        for (char ch : s1.toCharArray()) {
            set2.add(ch);
        }

        if (set1.equals(set2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}

