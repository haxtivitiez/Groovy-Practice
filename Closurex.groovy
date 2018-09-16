class Closurex {
   static void main(String[] args) {
      def clos = {println "Hello World"};
      clos.call();

      def clos2 = {param->println "Hello ${param}"};
      clos2.call("World");

      def clos3 = {println "Hello ${it}"};
      clos3.call("World");
 
   } 
}