/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.eighttask;

import by.bsuir.firstlab.myutils.SmartOutput;

/**
 *
 * @author Иван
 */
public class EightTask {

    public static double[] mergeArrays(double[] arrayA,double[] arrayB){
        
        int k=0;
        int i=0;
        double[] temp=new double[arrayA.length+arrayB.length];
        
        for (int j=0;j<arrayB.length;j++)
        {
            while((i<arrayA.length)&&(arrayB[j]>arrayA[i]))
            {
                temp[k]=arrayA[i];
                k++;
                i++;
            }
            temp[k]=arrayB[j];
            System.out.printf("Entered %f on position %d for old array, %d for new array \n",arrayB[j],i,k);
            k++;
        }
        for(i=i;i<arrayA.length;i++)
        {
            temp[k]=arrayA[i];
            k++;
        }       
        
        return temp;
    }
            
    public static void main(String args[]) {
        // TODO code application logic here
        double[] arrayA= new double[] {1,13,27,20,67,87,87,112,113,114,126,126,190,200,250,251,268,300};
        double[] arrayB= new double[] {3,14,22,46,67,87,100,120,126,127,160,200,240};
        double[] res= mergeArrays(arrayA,arrayB);
        SmartOutput.ShowArray(res);
    }
}
