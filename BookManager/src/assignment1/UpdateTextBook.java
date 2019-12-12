
package assignment1;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTextBook extends UpdateBook{
    int rs;
    Book b1;
    public UpdateTextBook(Book b){
        b1=b;
    }
    
    public void queryDB() {
        try{
            Statement st = conn.createStatement();
            String sql = "UPDATE book SET isbn= '"+b1.getISBN()+"',type='"+b1.getType()+"',author='"+b1.getAuthor()+"',publication='"+b1.getPublication()+"',price="+b1.getPrice()+" where name='"+b1.getName()+"'";
            System.out.println(sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void undoUB(){
         try{
            Statement st = conn.createStatement();
            String sql = "UPDATE book SET isbn= '"+b1.getISBN()+"',type='"+b1.getType()+"',author='"+b1.getAuthor()+"',publication='"+b1.getPublication()+"',price="+b1.getPrice()+" where name='"+b1.getName()+"'AND type='Book'";
            System.out.println(sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void redoUB(){
         try{
            Statement st = conn.createStatement();
            String sql = "UPDATE book SET isbn= '"+b1.getISBN()+"',type='"+b1.getType()+"',author='"+b1.getAuthor()+"',publication='"+b1.getPublication()+"',price="+b1.getPrice()+" where name='"+b1.getName()+"'";
            System.out.println("hel2"+sql);
            rs = st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
