/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.sixthtask;

import by.bsuir.firstlab.myutils.SmartInput;

/**
 *
 * @author Иван
 */
public class SixthTask {

    public static double[][] makeMatrix(double[] baseArray)
    {
        double[][] matrix = new double[baseArray.length][baseArray.length] ;
        
        for(int i=0;i<baseArray.length;i++)
        {
            int k=0;
            for(int j=i;j<baseArray.length;j++)
            {
                matrix[i][k]=baseArray[j];
                k++;
            }
            
            for(int j=0;j<i;j++)
            {
                matrix[i][k]=baseArray[j];
                k++;
            }
        }
        return matrix;
    }
    
    public static void printMatrix(double[][] matrix) 
    {
        for (int i=0; i<matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++)
            {
                System.out.printf("%.3f ", matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        SmartInput in = new SmartInput();
        
        int size = in.InputInt("Enter your array size");
        double[] myArray = new double[size];
        for (int i=0;i<myArray.length;i++)
        {
            myArray[i] = in.InputDouble(String.format("Enter your number %d",i));
        }
       double[][] myMatrix = makeMatrix(myArray);
       
       printMatrix(myMatrix);
        
        
    }
}
