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
public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {        
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
