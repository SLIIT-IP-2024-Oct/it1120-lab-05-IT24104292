
import java.util.Scanner;
public class IT24104292Lab5Q3 {
	public static void main(String[] args) {

		   int reserved_Days;
		   double total_Amount;
		   final double perDay = 48000.00;
		   Scanner myObj = new Scanner (System.in);
		   
		   System.out.print("Enter the first date: ");
		  
		   int start_Date = myObj.nextInt();       //they normally take input as strings
		 
		   
		   System.out.print("Enter the last date: ");
		  
		   int end_Date = myObj.nextInt();
		  
		   //Validations 
		   
		   if (((start_Date < 1) || (end_Date < 1)) || ((start_Date > 31) || (end_Date > 31))) {
		   
		     System.out.println("An invalid input. Try again !");
             return;
		   }
		   
		   
		   if (start_Date >= end_Date) {
			   
		     System.out.println("An invalid input");
		     return;
		     
		   }
		   
		   //Calculations 

		   reserved_Days = end_Date - start_Date;
		   System.out.println("Number of days reserved : " + reserved_Days);
		  
		   total_Amount = reserved_Days * perDay;
		   
		   
		   //Switch
		   
		   switch (reserved_Days) {
		   
		   case 1:
			   System.out.print("No discount and the total is " + total_Amount);
			   break;
			   
		   case 2:
			   System.out.print("No discount and the total is " + total_Amount);
			   break;
			   
		   case 3:
			   total_Amount = reserved_Days * perDay - ((reserved_Days * perDay)*0.1);
		       System.out.print("The total amount with the discount is " + total_Amount );
			   break;
			   
		   case 4:	   
			   total_Amount = reserved_Days * perDay - ((reserved_Days * perDay)*0.1);
		       System.out.print("The total amount with the discount is " + total_Amount );
			   break;
			   
		   default:
			   total_Amount = reserved_Days * perDay - ((reserved_Days*perDay)*0.2);
		       System.out.println("The total amount with the discount is " + total_Amount);
		   	   		   		   		  	   
		   }
		   
		   
	}
	
	
    
}
