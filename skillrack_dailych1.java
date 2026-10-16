/*
skill rack daily challenge -1
Program ID - 1179   
input is number convert it in words
like 123->one two three

Input Format:
First line contains a string of digits.
Output Format:
Convert the given number into words and print.
Example Input/Output
Input:4567
Output: Four Five Six Seven
Example Input/Output 2:
Input:
611953
Output:
Six One One Nine Five Three
    
Constraints:
Length of the input string of digits will be between 1 and 50.

Max Execution Time Limit: 5000 millisecs

 */
import java.util.*;
public class skillrack_dailych1 {

    public static void main(String[] args) {
		//Your Code Here
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int i=0,l=s.length();
       while(i<l){
           char ch = s.charAt(i);
           switch(ch){
               case '0':
                   System.out.print("zero");
                   break;
                case '1':
                    System.out.print("one");
                    break;
                case '2':
                    System.out.print("two");
                    break;
                case '3':
                    System.out.print("three");
                    break;
                case '4':
                    System.out.print("four");
                    break;
                case '5':
                    System.out.print("five");
                    break;
                case '6':
                    System.out.print("six");
                    break;
                case '7':
                    System.out.print("seven");
                    break;
                case '8':
                    System.out.print("eight");
                    break;
                case '9':
                    System.out.print("nine");
                    break;
           }
           System.out.print(" ");
           i++;
       }
	}
}