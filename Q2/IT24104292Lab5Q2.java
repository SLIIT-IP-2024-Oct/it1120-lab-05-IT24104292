import java.util.Scanner;
class IT24104292Lab5Q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

    System.out.println("Number of introduced members :");
    
    int number = myObj.nextInt();
    
	if(number <0){
		System.out.println("You cannot enter negative numbers");
		return;
	}
	
	
	
	
	
	
    switch (number) {
	 case 0 :
		 System.out.println("You will get no prizes!");
	 	
     break;
     case 1 :
        
        System.out.println("Prize is a pen");
		
     break;	
	 
	 case 2 :
		 System.out.println("Prize is an umbrella");
	 break;	 
	 
	 
	 case 3 :
		 System.out.println("Prize is a bag");
	 break;	 
	 
	 
	 case 4 :
		 System.out.println("Prize is a travelling chair");
	 break;
	   
     default:
		 System.out.println("Prize is a headphone ");
	  
    }
   
  }
}