/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.seventhtask;

import by.bsuir.firstlab.myutils.SmartOutput;

/**
 *
 * @author Иван
 */
public class SeventhTask {

    /**
     * @param args the command line arguments
     */
    public static void sortShell(double[] myArray) {
        
        for (int j=1;j<myArray.length;j++)
        {
            double a=myArray[j];
            int i=j-1;
            while((i>=0)&&(myArray[i]>a)){
                myArray[i+1]=myArray[i];
                i--;
            }
            myArray[i+1]=a;
        }
        
    }
    
    
         
    public static void main(String args[]) {
        // TODO code application logic here
        double[] myArray= new double[] {20,67,87,45,67,3,45,23,440,245,345,87,34,9,0,2,1,23,4,678,54,234,987,23,6,23,76,245,76};
        SmartOutput.ShowArray(myArray);
        sortShell(myArray);
        System.out.println();
        SmartOutput.ShowArray(myArray);
    }
}
