/*JAVA-AVERAGE-PART002
ProgramID-215
SKILLRACK
Incorrect keyboard
Suman's keyboard got damaged as he dropped it from a considerable distance. As a result instead of K. the keyboard may sometimes display T (but will never display K instead of T) Similarly instead of G, the keyboard may sometimes display D, instead of R sometimes it may display L and sometimes instead of R it displays F.
Because of this Suman has to think of all possible words for a displayed word (obtained by typing using his keyboard). The program to be written should accept a word W which is displayed as a result of typing on Suman's keyboard and should calculate how many possible words it could mean (if typed using a properly working keyboard) and print the count as the output.
Boundary Conditions:
The length of the input word is between 2 and 100.
Input Format:
First line will contain the word W.
Output Format:
The count of possible words that the input word (typed using Suman's keyboard) could mean.
Sample Input/Output:
Example 1:
Input: FILIPEK
Output
4
Explanation:
The words that may be wrongly typed are F and L Here F could be correctly typed or wrongly typed instead of R. Similarly L could be correctly typed or wrongly typed instead of R.
Hence the overall words to be considered are 2*2 = 4.
Note: K is not considered as K will not be typed instead of some other letter. Only instead of K sometimes T will be typed.
Example 2:
Input:
KICKED
Output 2
Explanation:
D could be correctly typed or wrongly typed instead of G. Hence overall words to be considered = 2
Example 3:
Input:
FUTILE
Output
8
Explanation:
F,T,L - These three letters can be wrongly typed instead of R.KR or can be correctly typed. Hence overall words to be considered = 2*2*2 = 8.
 */

import java.util.*;

public class skillrack_22 {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        for(int i =0 ; i< s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            switch(ch){
                case 't':
                    count+=1;
                    break;
                case 'd':
                    count+=1;
                    break;
                case 'l':
                    count+=1;
                    break;
                case 'f':
                    count+=1;
                    break;
                default :
                     break;
            }
        }
        System.out.print((int) Math.pow(2,count));
	}
}

// again 5 mins
