import java.io.File 
class Read { 
   static void main(String[] args) { 
      new File("Example.txt").eachLine {  
         line -> println "line : $line"; 
      } 

      File file2 = new File("Example2.txt") 
      println file2.text

      
   } 
}