import java.io.File 
class Write { 
   static void main(String[] args) { 
      new File('ExampleW.txt').withWriter('utf-8') { 
         writer -> writer.writeLine 'Hello World\nNew Line' 
      }  

      File fileSize = new File("ExampleW.txt")
      println "The file ${fileSize.absolutePath} has ${fileSize.length()} bytes"
   } 
}