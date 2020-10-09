package smg;
import java.util.Scanner;
public class Project7ex2 {

	public static void main(String[] args) {
	     int currentFee = 10_000;
	     double lihva = 0.06;
	     double nextFee = currentFee;
	     double entireFee = 0;
	      for(int i =0; i<10; i++) {
	    	 System.out.println("Year " + (i+1) + ": " + nextFee); 
	    	 nextFee += currentFee*lihva; 
	     }
	      for(int j=0; j<4; j++) {
	    	  entireFee += nextFee;
	    	 nextFee += nextFee*lihva;
	      }
	      System.out.println("Entire fee is: " + entireFee);

	}

}
