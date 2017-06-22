package HorseRacingDualing;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        int arr[]=new int[N];
	        int max=Integer.MAX_VALUE;
	        int difference;
	        for (int i = 0; i < N; i++) {
	            int pi = in.nextInt();
	           arr[i]=pi;
	        }
	       
	    Arrays.sort(arr);
	        
	    for(int i=0;i<arr.length-1;i++){
	        
	     int horse1 = arr[i];
	     int horse2 = arr[i+1];
	      difference =horse2-horse1;
	     if(difference<max){
	         
	      max=difference;   
	     }
	        
	    }

	        System.out.println(max);
	    }
	}
