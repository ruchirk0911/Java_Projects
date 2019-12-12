package assignment1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;


public class UpdateJournal extends UpdateBook{
    int rs;
    ResultSet result;
    Book b1;
    Stack<Book> undoObj = new Stack<>();
    Stack<Book> redoObj = new Stack<>();

    public UpdateJournal(Book b){
        b1=b;
    }
    
    public void queryDB() {
        try{
           
            Statement st = conn.createStatement();
            String sql = "UPDATE book SET isbn= '"+b1.getISBN()+"',type='"+b1.getType()+"',author='"+b1.getAuthor()+"',publication='"+b1.getPublication()+"',price="+b1.getPrice()+" where name='"+b1.getName()+"'";
            System.out.println("hel1"+sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void undoUJ(){
         try{
          
            Statement st = conn.createStatement();
            String sql = "UPDATE book SET isbn= '"+b1.getISBN()+"',type='"+b1.getType()+"',author='"+b1.getAuthor()+"',publication='"+b1.getPublication()+"',price="+b1.getPrice()+" where name='"+b1.getName()+"'";
            System.out.println(sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void redoUJ(){
         try{
           
            Statement st = conn.createStatement();
            String sql = "UPDATE book SET isbn= '"+b1.getISBN()+"',type='"+b1.getType()+"',author='"+b1.getAuthor()+"',publication='"+b1.getPublication()+"',price="+b1.getPrice()+" where name='"+b1.getName()+"'";
            System.out.println(sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
