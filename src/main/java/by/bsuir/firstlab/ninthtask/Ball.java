/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.ninthtask;

import java.util.Random;

/**
 *
 * @author Иван
 */

public class Ball {
    
    public static final String[] allColors=new String[]{"blue","red","green","white"};
    public final int weight;
    
    public final String color;
    
    final static Random random = new Random();
    
    public Ball()
    {
        weight=random.nextInt(200,500);
        
        color=allColors[random.nextInt(4)];     
        
    }
    public Ball(int ballWeight)
    {
        weight=ballWeight/300+200;
        
        color=allColors[random.nextInt(4)];     
        
    }
    
}
