class TestFileDir { 
   static void main(String[] args) { 
      def file = new File('C:/') 
      println "File? ${file.isFile()}" 
      println "Directory? ${file.isDirectory()}" 


      def fileX = new File('C:/Directory')
      fileX.mkdir()
      fileX.delete()

      // COPY FILE
      def src = new File("E:/Example.txt")
      def dst = new File("E:/Example1.txt")
      dst << src.text

	 // Getting Directory Contents
	 def rootFiles = new File("test").listRoots() 
      rootFiles.each { 
         file -> println file.absolutePath 
      }

   } 
}