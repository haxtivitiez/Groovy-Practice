import java.sql.*; 
import groovy.sql.Sql
 
class Select {
   static void main(String[] args) {
      // Creating a connection to the database
      def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'root', 
         '', 'com.mysql.jdbc.Driver')  
			
      sql.eachRow('select * from employee') {
         tp -> 
         println([tp.FIRST_NAME,tp.LAST_NAME,tp.AGE,tp.SEX,tp.INCOME])
      }  
		
      sql.close()
   } 
}