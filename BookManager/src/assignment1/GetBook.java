package assignment1;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GetBook extends RDBImplCmd{
    private String name= "";
    ResultSet rs;
    public GetBook(String n){
        name = n;
    }
    
     @Override
    public void queryDB() {
        try{
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM book WHERE name ='"+name+"'";
            rs = st.executeQuery(sql); 
        
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    @Override
    public Object processResult(){
        List<Book> books = new ArrayList<Book>();
        try{
            while(rs.next()){
                String isbn = rs.getString("isbn");
                String n = rs.getString("name");
                String t= rs.getString("type");
                String author = rs.getString("author");
                String pub = rs.getString("publication");
                int price = rs.getInt("price");
                Book book = new Book(isbn,n,t,author,pub,price);
                books.add(book);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return books;
    }
}   
 
   
