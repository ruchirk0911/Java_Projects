package assignment1;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteBook extends RDBImplCmd{
    int rs;
    String name;
    public DeleteBook(String n){
        name = n;
    }

    @Override
    public void queryDB() {
        try{
            Statement st = conn.createStatement(); 
            String sql = "DELETE FROM book WHERE name='"+name+"'";
            rs = st.executeUpdate(sql);

        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void undoDel(){
         try{
            Statement st = conn.createStatement();
           // String sql = "INSERT INTO book(ISBN,name,type,author,Publication,price) values('"+b1.getISBN()+"','"+b1.getName()+"','Book','"+b1.getAuthor()+"','"+b1.getPublication()+"',"+b1.getPrice()+")";
            //System.out.println(sql);
           // rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    @Override
    public Book processResult() {
        return null;
    }
    
}
