/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.ninthtask;

/**
 *
 * @author Иван
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Basket basket= new Basket();
        for (int i=0;i<3;i++)
        {
            basket.addBall(new Ball());
        }
        basket.addBall(new Ball(345));
        System.out.print("weight=");
        System.out.println(basket.weigh());
        
        System.out.print("blues=");
        System.out.println(basket.countBlue());
    }
}
