/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.twelfplus;

/**
 *
 * @author Иван
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Book book = new Book();
        
        ProgrammerBook pr= new ProgrammerBook();
        
        PriceComparator price=new PriceComparator();
        TitleComparator tit=new TitleComparator();
        tit.thenComparing(price);
        AuthorComparator aut=new AuthorComparator();
        aut.thenComparing(tit);
        
        System.out.print(pr.toString());
    }
}
