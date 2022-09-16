/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.secondtask;
import by.bsuir.firstlab.myutils.SmartInput;


/**
 *
 * @author Иван
 */
public class SecondTask {

    final static int Y_TOP=5;
    final static int Y_MID=0;
    final static int Y_BOT=-3;
    final static int X_TOP=4;
    final static int X_BOT=6;
    
    public static boolean checkLocation(double x, double y){
        
        if (y>Y_TOP){
            return false;
        }
        if (y<Y_BOT){
            return false;
        }
        if (y>Y_MID){
            if(Math.abs(x)>X_TOP){
                return false;
            }
        }
        
        if (y<=Y_MID){
            if(Math.abs(x)>X_BOT){
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        SmartInput in = new SmartInput();
        double x = in.InputDouble("Enter your x");
        
        System.out.println("Enter your y");
        double y = in.InputDouble("Enter your y");
        
        boolean result=checkLocation(x,y);
        System.out.println(result);
    }
}
