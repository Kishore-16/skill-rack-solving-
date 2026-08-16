// Character and Digit Shift Cipher

import java.util.*;

public class skillrack_25 {

    public static void main(String[] args) {
		//Your Code Here
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int x = sc.nextInt();
       int y = sc.nextInt();
      // System.out.print("hi");
       for(int i =0 ;i< s.length();i++){
           char c = s.charAt(i);
           if(Character.isDigit(c)){
               System.out.print(Character.getNumericValue(c)+y);
           }else if(Character.isLetter(c)){
               char temp = (char) (((c-97+x)%26)+97);
               System.out.print(temp);
           }else{
               System.out.print(c);
           }
       }
	} 
}

//7min
