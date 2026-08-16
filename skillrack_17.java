// find min sum c element out of n elements

import java.util.*;

public class skillrack_17 {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c= sc.nextInt(),min=0;
        int[] a = new int[n];
        for( int i=0 ; i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i =0 ; i<c; i++){
            min+=a[i];
        }
        System.out.print(min);
	}
}
