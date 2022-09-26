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
public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {        
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
