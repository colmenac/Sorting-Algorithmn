/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

/**
 *
 * @author User
 */
public class sortingalg {

   public static void bbint(int values[])
   {
       for (int i = 0; i < values.length - 1; i++)
       {
           for (int j = 0; j < values.length - i - 1; j++)
           {
               if (values[j] > values[j+1])
               {
                   int temp = values[j];
                   values[j] = values[j+1];
                   values[j+1] = temp;
               }
           }
       }
   }
  
   public static void bbfloat(float values[])
   {
       for (int i = 0; i < values.length - 1; i++)
       {
           for (int j = 0; j < values.length - i - 1; j++)
           {
               if (values[j] > values[j+1])
               {
                   float temp = values[j];
                   values[j] = values[j+1];
                   values[j+1] = temp;
               }
           }
       }  
   }
  
   public static void bbdouble(double values[])
   {
       for (int i = 0; i < values.length - 1; i++)
       {
           for (int j = 0; j < values.length - i - 1; j++)
           {
               if (values[j] > values[j+1])
               {                   
                   double temp = values[j];
                   values[j] = values[j+1];
                   values[j+1] = temp;
               }
           }
       }   
   }
  
   public static void main(String []s)
   {
       Random random = new Random();
      
       PrintStream printWrite = null;
      
       int arrInt[] = new int[150];
       float arrFloat[] = new float[150];
       double arrDouble[] = new double[150];

       for(int c = 0; c < arrInt.length; c++)
           arrInt[c] = (int)(Math.random() * (200 - 0 + 1) + 0);
      
       for(int c = 0; c < arrFloat.length; c++)
           arrFloat[c] = random.nextFloat() * (200.0f - 0.0f) + 0.0f;
      
       for(int c = 0; c < arrDouble.length; c++)
           arrDouble[c] = random.nextDouble() * (200.0 - 0.0) + 0.0;
       try
       {
           printWrite = new PrintStream(new FileOutputStream("teamout.txt"));
          
           printWrite.println("Original Integer Array");
          
           for(int c = 0; c < arrInt.length; c++)
               printWrite.print(arrInt[c] + " ");
          
           bbint(arrInt);
          
           printWrite.println();
           printWrite.println("Sorted Integer Array");
          
           for(int c = 0; c < arrInt.length; c++)
               printWrite.print(arrInt[c] + " ");
          
           printWrite.println();
           printWrite.println("Original Float Array");
          
           for(int c = 0; c < arrInt.length; c++)
               printWrite.print(arrFloat[c] + " ");
          bbfloat(arrFloat);
          
           printWrite.println();
           printWrite.println("Sorted Float Array");
          
           for(int c = 0; c < arrFloat.length; c++)
               printWrite.print(arrFloat[c] + " ");
          
           printWrite.println();
           printWrite.println("Original Double Array");
          
           for(int c = 0; c < arrDouble.length; c++)
               printWrite.print(arrDouble[c] + " ");
          
           bbdouble(arrDouble);
          
           printWrite.println();
           printWrite.println("Sorted Double Array");
          
           for(int c = 0; c < arrDouble.length; c++)
               printWrite.print(arrDouble[c] + " ");
       }
      
       catch (FileNotFoundException fe)
       {
           fe.printStackTrace();
           System.err.println("Unable to open the file for writing.");
       }// 
   }
}