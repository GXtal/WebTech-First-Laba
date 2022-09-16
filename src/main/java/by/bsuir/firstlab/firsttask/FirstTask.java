/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.FirstTask;
import by.bsuir.firstlab.myutils.SmartInput;
/**
 *
 * @author Иван
 */
public class FirstTask {
    
    public static double formula(double x, double y){
        
        double result=x+(1+Math.pow(Math.sin(x+y), 2))/(2+Math.abs(x-(2*x)/(1+x*x*y*y)));
        
        return result;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
//        System.out.println("Enter your x");
//        double x = in.nextDouble();
        SmartInput in = new SmartInput();
        double x = in.InputDouble("Enter your x");
        
        double y = in.InputDouble("Enter your y");
        
        double result = formula(x,y);
        System.out.println(result);
    }
    
    
            
}
