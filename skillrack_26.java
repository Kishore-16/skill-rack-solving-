/*JAVA - AVERAGE - PART002
ProgramID-237
SKILLRACK
Order by prime, odd and even
A set of numbers of size N which are separated by one or more spaces will be passed as input. The program should print the prime numbers first followed by odd numbers and finally even numbers.
Each of these categories, prime numbers, odd numbers and even numbers must be sorted in ascending order among themselves. The numbers which are prime must be excluded from the list of odd and even numbers (In the case of even numbers only 2 is prime as well as even)
Input Format:
First line will contain the set of numbers separated by one or more spaces.
Output Format:
First line will contain the prime numbers, odd numbers, even numbers in the same order sorted in ascending order. The numbers must be separated exactly by one space.
Constraints:
Size of the set N will be from 2 to 20.
Example Input/Output 1:
Input: 4 5 9 22 11 2 15
Output: 2 5 11 9 15 4 22
Example Input/Output 2:
Input:
611953 494147 493137 493133 493138
Output:
493133 494147 611953 493137 493138
Explanation:
493133 494147 611953 are prime numbers.
 */

import java.util.*;

public class skillrack_26 {

    public static void main(String[] args) {
		//Your Code Here
      Scanner sc = new Scanner(System.in);
      String[] s = sc.nextLine().split(" ");
      List<Integer> prime = new ArrayList<>();
      List<Integer> odd = new ArrayList<>();
      List<Integer> even = new ArrayList<>();
      
      for( int i=0;i< s.length;i++){
         int num = Integer.parseInt(s[i]);
         if(isprime(num)){
             prime.add(num);
         }else if(num%2==0){
             even.add(num);
         }else{
             odd.add(num);
         }
      }
	Collections.sort(prime);
	Collections.sort(odd);
	Collections.sort(even);
	
	prime.addAll(odd);
	prime.addAll(even);
	for(int i : prime){
	    System.out.print(i+" ");
	}
    }

	public static boolean isprime(int n ){
	        if(n<=1){
	            return false;
	        }
	    for(int i =2 ; i<=Math.sqrt(n);i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    return true;
	}
}
