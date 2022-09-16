/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.fifthtask;

import by.bsuir.firstlab.myutils.SmartOutput;

/**
 *
 * @author Иван
 */
public class FifthTask {

    public static void rebuild(int[] myArray,int[] back,int start){
        
        int sled=back[start];
        if(sled!=0)
        {
            rebuild( myArray, back,sled);
        }
    }
    public static int calcLast(int[] priors){
        int max=0,pos=0;
        
        for(int i=0;i<priors.length;i++)
        {
            
            if (priors[i]>max)
            {
                max=priors[i];
                pos=i;
            }
            
        }
        System.out.printf("Need to throw: %d",priors.length-max);
        return pos;
    }
    public static void result(int[] myArray){
        
        int[] priors=new int[myArray.length];
        int[] back = new int[myArray.length];
        for (int i=0;i<myArray.length;i++)
        {
            priors[i]=1;
        }
        
        for (int i=0;i<priors.length;i++){
            
            for(int j=0;j<=i;j++){
                
                if (myArray[j]<myArray[i]){
                    if (priors[i]<(priors[j]+1))
                    {
                        priors[i]=priors[j]+1;
                        back[i]=j;
                    }                    
                }                
            }            
        }        
        SmartOutput.ShowArray(priors);
        calcLast(priors);
    }
    public static void main(String args[]) {
        
        int[] myArray=new int[]{1,2,10,4,7,15,9,10,22,23,24,11,17,15,16};
        result(myArray);
    }
}
