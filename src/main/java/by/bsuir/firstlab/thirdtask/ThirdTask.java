/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.thirdtask;
import by.bsuir.firstlab.myutils.SmartInput;
/**
 *
 * @author Иван
 */
public class ThirdTask {

    /**
     * @param args the command line arguments
     */
    
    public static void buildTable(double x0,double xn, double dx)
    {
        final double prec = 0.000001;
        if((xn>=x0)&&(dx>0))
        {
            double x=x0;
            double y;
            System.out.println("x     |     y");
            while(x<xn)
            {
                if (Math.abs(x)<prec)
                {
                    x=0;
                }
                System.out.printf("%.3f", x);
                y=Math.tan(x);
                System.out.printf("|%.3f\n", y);
                x+=dx;
            }
            
            x=xn;
            System.out.printf("%.3f", x);
            y=Math.tan(x);
            System.out.printf("|%.3f\n", y);
        }
        
    }
    public static void main(String args[]) {
        // TODO code application logic here
        SmartInput in = new SmartInput();
        double a= in.InputDouble("enter bot border");
        double b= in.InputDouble("enter top border");
        double h= in.InputDouble("enter step");
        buildTable(a,b,h);
        
        
        
    }
}
