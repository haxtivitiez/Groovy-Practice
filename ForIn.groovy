class ForIn { 
   static void main(String[] args) { 
      int[] array = [0,1,2,3]; 
		
      for(int i in array) { 
         println(i); 
      } 


      for(int i in 1..5) {
         println(i);
      }


      def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];
		
      for(emp in employee) {
         println(emp);
      }
   } 
}