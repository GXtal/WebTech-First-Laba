/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package by.bsuir.firstlab.forthtask;
import by.bsuir.firstlab.myutils.SmartInput;
/**
 *
 * @author Иван
 */
public class ForthTask {

    public static boolean isPrime(int a){
        for (int i=2;i<Math.sqrt(a);i++)
        {
            if (a % i == 0)
            {
                return false;
            }
        }
        
        if (a == 1)
        {
            return false;
        }
        return true;
    }
    
    public static boolean isPrimeInArray(int[] myArray){
        boolean result=false;
        for (int i=0;i<myArray.length;i++)
        {
            if(isPrime(myArray[i]))
            {
                System.out.println(myArray[i]);
                result=true;
            }
        }
        return result;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        SmartInput in = new SmartInput();
                
        int size = in.InputInt("Enter your array size");
        int[] myArray = new int[size];
        for (int i=0;i<myArray.length;i++)
        {
            myArray[i] = in.InputInt(String.format("Enter your number %d",i));
        }
        
        System.out.println();
        
        if(isPrimeInArray(myArray))
        {
            System.out.println("There are some prime numbers");
        }
        else
        {
             System.out.println("There are no prime numbers");
        }
        
        
    }
}
