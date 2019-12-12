package assignment1;

import java.sql.SQLException;
import java.sql.Statement;


public class AddJournal extends AddBook{
    private Book b1;
    int rs;
    public AddJournal(Book b){
        b1 = b;
    }
    @Override
    public void queryDB() {
        try{
            Statement st = conn.createStatement();
            String sql = "INSERT INTO book(ISBN,name,type,author,Publication,price) values('"+b1.getISBN()+"','"+b1.getName()+"','Journal','"+b1.getAuthor()+"','"+b1.getPublication()+"',"+b1.getPrice()+")";
            System.out.print(sql);
            rs = st.executeUpdate(sql);

        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void undoAJ(){
         try{
            Statement st = conn.createStatement();
            String sql = "DELETE FROM book where name='"+b1.getName()+"'";
            System.out.println(sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void redoAJ(){
         try{
            Statement st = conn.createStatement();
            String sql = "INSERT INTO book(ISBN,name,type,author,Publication,price) values('"+b1.getISBN()+"','"+b1.getName()+"','Journal','"+b1.getAuthor()+"','"+b1.getPublication()+"',"+b1.getPrice()+")";
            System.out.println(sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
