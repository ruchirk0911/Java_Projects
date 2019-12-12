
package assignment1;

public class Book {
    private String isbn = "";
    private String name = "";
    private String type = "";
    private String author = "";
    private String pub = "";
    private int price = 0;
    
    public Book(){
        
    }
    
    
    public Book(String isbn,String name,String type,String author,String pub,int price){
        this.isbn = isbn;
        this.name = name;
        this.type = type;
        this.author = author;
        this.pub = pub;
        this.price = price;
    }
    
    
  
    
    public String getISBN(){
        return this.isbn;
    }
    public void setISBN(String is){
        this.isbn = is;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String t){
        this.type = t;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String a){
        this.author = a;
    }
    public String getPublication(){
        return this.pub;
    }
    public void setPublication(String pub){
        this.pub = pub;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int p){
        this.price = p;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
