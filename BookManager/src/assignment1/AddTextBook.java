
package assignment1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddTextBook extends AddBook{
    private Book b1;
    int rs;
    public AddTextBook(Book b){
        b1 = b;
    }
    @Override
    public void queryDB() {
        try{
            Statement st = conn.createStatement();
            String sql = "INSERT INTO book(ISBN,name,type,author,Publication,price) values('"+b1.getISBN()+"','"+b1.getName()+"','Book','"+b1.getAuthor()+"','"+b1.getPublication()+"',"+b1.getPrice()+")";
            System.out.print(sql);
            rs = st.executeUpdate(sql);

        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void undoAB(){
         try{
            Statement st = conn.createStatement();
            String sql = "DELETE FROM book where name='"+b1.getName()+"'";
            System.out.println(sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void redoAB(){
          try{
            Statement st = conn.createStatement();
            String sql = "INSERT INTO book(ISBN,name,type,author,Publication,price) values('"+b1.getISBN()+"','"+b1.getName()+"','Book','"+b1.getAuthor()+"','"+b1.getPublication()+"',"+b1.getPrice()+")";
            System.out.println(sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
