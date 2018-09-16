import java.sql.*; 
import groovy.sql.Sql 

class Update {
   static void main(String[] args){
      // Creating a connection to the database
      def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'root', 
         '', 'com.mysql.jdbc.Driver')
			
      sql.connection.autoCommit = false
      def sqlstr = "UPDATE EMPLOYEE SET AGE = AGE + 1 WHERE SEX = 'M'" 
	  
      try {
         sql.execute(sqlstr);
         sql.commit()
         println("Successfully committed")
      }catch(Exception ex) {
         sql.rollback() 
         println("Transaction rollback")
      }
		
      sql.close()
   } 
}