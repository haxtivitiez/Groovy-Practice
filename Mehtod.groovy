class Method {

	int x; 
	
   public int getX() { 
      return x; 
   } 
	
   public void setX(int pX) { 
      x = pX; 
   } 



    static int y = 600; 
	
   public static int getY() { 
      int ly = 800; 
      println(ly); 
      return y; 
   } 


    int z = 400; 
	
   public int getZ() { 
      this.z = 500; 
      return z; 
   } 


   static def DisplayName() {
      println("This is how methods work in groovy");
      println("This is an example of a simple method");
   } 

   static void sum(int a,int b) {
      int c = a+b;
      println(c);
   }  

   static void sumDefault(int a,int b = 5) { 
      int c = a+b; 
      println(c); 
   } 

    static int sumRet(int a,int b = 5) {
      int c = a+b;
      return c;
   } 
	
   static void main(String[] args) {
      DisplayName();
      sum(10,5);
      sumDefault(6); 
      println(sumRet(7));

 	Method ex = new Method(); 
      ex.setX(100); 
      println(ex.getX()); 


      println(getY());

      println(ex.getZ());
       

   } 
}