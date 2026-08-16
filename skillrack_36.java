/*JAVA-AVERAGE-PART003
ProgramID-238
SKILLRACK
Country Capital
Input data containing N countries and their capital will be provided as input. The program must then print the capital for a given country.
Input Format:
First line will contain the integer value N representing how many country-capital pairs are to be provided as input.
Next N lines will contain the name of the country and the name of the captial as string values separated by a space.
The last line will contain the name of the country as a string value for which the capital is to be printed as output.
Output Format:
First line will contain the capital of the country. If the name of the country is NOT found in the input data then NONE must be printed as output.
Constraints:
N will be from 2 to 100.
Sample Input/Output:
Example 1:
Input:
5 Afghanistan Kabul Austria Vienna Armenia Yerevan Chile Santiago Croatia Zagreb Austria
Output Vienna
Example 2:
Input:
4 Armenia Yerevan Chile Santiago Croatia Zagreb Iran Tehran Japan
Output NONE
Explanation:
As Japan is not mentioned in the input data, NONE is printed as output.
Max Execution Time Limit: 5000 millisecs
 */

// NICE QUESTION
import java.util.*;

public class skillrack_36 {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String,String> h = new HashMap<>();
    for(int i=0 ; i< n ;i++){
        h.put(sc.next(),sc.next());
    }
    System.out.print(h.getOrDefault(sc.next(),"NONE"));
	}
}
