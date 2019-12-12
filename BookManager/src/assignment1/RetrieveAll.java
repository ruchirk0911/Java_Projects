
package assignment1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RetrieveAll extends RDBImplCmd{ 
    ResultSet rs;
    @Override
    public void queryDB() {
        try{
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM book ";
            rs = st.executeQuery(sql); 
        
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    @Override
    public Object processResult(){
        List<Book> books1 = new ArrayList<Book>();
        try{
            while(rs.next()){
                String isbn = rs.getString("isbn");
                String n = rs.getString("name");
                String t = rs.getString("type");
                String author = rs.getString("author");
                String pub = rs.getString("publication");
                int price = rs.getInt("price");
                Book book = new Book(isbn,n,t,author,pub,price);
                books1.add(book);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return books1;
    }
    
}
