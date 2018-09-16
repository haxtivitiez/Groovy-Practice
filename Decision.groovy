class Decision { 
   static void main(String[] args) { 
      // Initializing a local variable 
      int a = 2;
		
      //Check for the boolean condition 
      if (a<100) { 
         //If the condition is true print the following statement 
         println("The value is less than 100"); 
      } 

      int b = 200;
      //Check for the boolean condition 
      if (b<100) { 
         //If the condition is true print the following statement 
         println("The value is less than 100"); 
      } else { 
         //If the condition is false print the following statement 
         println("The value is greater than 100"); 
      } 


       int c = 3
      
      //Evaluating the expression value 
      switch(c) {            
         //There is case statement defined for 4 cases 
         // Each case statement section has a break condition to exit the loop 
         
         case 1: 
            println("The value of a is One"); 
            break; 
         case 2: 
            println("The value of a is Two"); 
            break; 
         case 3: 
            println("The value of a is Three"); 
            break; 
         case 4: 
            println("The value of a is Four"); 
            break; 
         default: 
            println("The value is unknown"); 
            break; 
      }
   } 
}