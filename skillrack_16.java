// fav no : 2

/*JAVA-AVERAGE-PART001
ProgramID-2620
SKILLRACK
Message Encryption
To encrypt messages Jil will first decide on the number of columns C to use. Then Jil will pad the message with letters chosen randomly so that they form a rectangular matrix. Finally Jil will write down the message navigating the rows from left to right and then from right to left.
The program must accept the encrypted message M as input and then extract and print the original message (along with any additional padding letters) from the encrypted one based on the value of C.
Boundary Conditions:
Length of M is from 4 to 200.
2 <= C <= 20
Input Format:
First line will contain the string value of the encrypted message M.
Second line will contain the integer value of the column used for the encryption.
Output Format:
First line will contain the string value of the original message (along with any additional padding letters)
Sample Input/Output:
Example 1:
Input:
midinadiazne
3
Output:
madeinindiaz
Explanation:
mid
ani
dia
enz
Here z is the padding letter. The navigating across the rows mid (left to right) ina (right to left) and so on we come up with the encrypted message midinadiazne.
Example 2:
Input:
loaesfbnaiordilertenrdhdw
5
Output:
lionroaredandthebirdsflew
Explanation:
loaes
ianbf
ordil
netre
rdhdw
Here there are no padding letters. The navigating across the rows left to right and then from right to left we get loaesfbnaiordilertenrdhdw */

import java.util.*;

public class skillrack_16 {

    public static void main(String[] args) {
		//Your Code Here
     Scanner sc = new Scanner(System.in);
     char[] s= sc.nextLine().toCharArray();
     int k=0;
     int n = sc.nextInt();
     int row = s.length/n;
     char[][] en = new char[row][n];
     for( int i = 0 ; i<row ;i++){
        if(i%2==1){
        for(int j=n-1;j>=0;j--){
            en[i][j]=s[k++];
            
           // System.out.print(i+" "+j);
        }
         }
          else{   
        for(int j=0 ; j<n ; j++){
             en[i][j]=s[k++];
             //System.out.print(en[i][j]+" ");
            }
          }
         //System.out.print("\n");
     }
     for(int j=0; j<n;j++){
         for(int i=0; i<row ;i++){
             System.out.print(en[i][j]);
         }
     }
	}
}
