package classwork;

public class Evenodd {
	   public static void main(String args[]){
	      int num = 15;
	     
	      //Finding even or odd
	      if (num % 2 == 0){
	         System.out.println("Entered number is an even number");
	      } else {
	    	  if(num % 3 == 0 && num % 5 == 0)
	    		  System.out.println("Extra special");
	    	  else if(num % 3 == 0)
	    		  System.out.println("Special");
	    	  else 
	    		  System.out.println("Only odd");
	    	  
	      }
	   }
	}