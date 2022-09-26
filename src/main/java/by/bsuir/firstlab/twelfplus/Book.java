/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.twelfplus;

import java.util.Comparator;

/**
 *
 * @author Иван
 */
public class Book implements Comparable {
        
    private String title;
    private String author;
    private int price;
    private String isbn;
    private static int edition;
    
    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }
    
    public Book(){
        title="none";
        author= "none";
        price=0;
        edition+=1;
    }
    
    public Book(String _title,String _name,String _isbn, int _price){
        title=_title;
        author= _name;
        price=_price;
        isbn=_isbn;
        edition+=1;
    }
    
    @Override
    public String toString(){
        String temp="title:" + title+" author:"+author+" price:"+price; 
    return temp;
    }
    
    @Override   
    public boolean equals(Object obj)
    { 
        if (obj instanceof Book)
        {
            if(((Book) obj).author.equals(author))
            {
                if(((Book) obj).price==price)
                {
                    if(((Book) obj).isbn.equals(isbn))
                    {
                        if(((Book) obj).title.equals(title))
                    {
                        return true;
                    }
                    }
                    
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode()
    {        
        int res=17;
        res+=price;        
        res+=title.hashCode();        
        res+=author.hashCode();
        res+=edition;       
        
        return res;
    }
    
    @Override
    public Book clone()
    {        
        Book res = new Book(title,author,isbn,price);      
        
        return res;
    }

    @Override
    public int compareTo(Object o) {
        if( o instanceof Book)
        {
            return isbn.compareTo(((Book) o).isbn);
            
        }else            
            return -1;
    }
}
