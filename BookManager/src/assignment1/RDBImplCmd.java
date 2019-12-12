
package assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class RDBImplCmd {
    private Object b1;
    Connection conn;
    public void execute(){
        try{
            connectDB();
            queryDB();
            b1 = processResult();
            disconnectDB();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void connectDB(){
        Statement st;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","");
            st = conn.createStatement();
        }catch(Exception e){
            System.out.println("Error:"+ e);
        }
    }
    public Object getBookCmd(){
        return b1;
    }
    public void disconnectDB(){
        try {
            if(conn != null )
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(RDBImplCmd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public abstract void queryDB();
    public abstract Object processResult();
}
