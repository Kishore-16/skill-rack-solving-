/*JAVA - AVERAGE - PART002
ProgramID-234
SKILLRACK
Choose Items For Highest Discount.
Chandru went for shopping and he was offered N number of items at various discount percentage rates. Out of these N items he wants to choose N-1 items such that the amount he saves is maximum.
The program must print the item which is to be left out.
Input Format:
First line will contain the value of N - number of items
N lines containing item name, label price and the discount percentage separated by one or more spaces.
Output Format:
The name of the item which is not to be purchased as it offers least discount.
Boundary Conditions:
2 <= N <= 20
The length of the item name string value is from 1 to 100.
The price of the item is from 1 to 999999
Example Input/Output 1:
Input:
3
harddisk 4000 20
monitor 15000 10
laptop 30000 5
Output:
harddisk
Explanation:
harddisk savings = 800, monitor savings = 1500, laptop savings = 1500. Hence harddisk is offering least savings and is to be left out.
 */

import java.util.*;

public class skillrack_27 {

    public static void main(String[] args) {
		//Your Code Here
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String name ="";
       double dis=0;
      
    for(int i=0 ;i<n ;i++){
        String s = sc.next();
        double d1= sc.nextDouble();
        double d2 =sc.nextDouble();
        if(dis< d1/d2){
            name=s;
            dis=d1/d2;
        }
    }
    System.out.print(name);
	}
}
