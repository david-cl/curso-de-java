/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner

/**
 *
 * @author PC04-LAB02
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner sc=new Scanner(System.in);
               Scanner teclado=new Scanner(System.in);
        double f=teclado.nextInt();
        double fa=1;
           /* for( int  c=0; c>=n;c--)
            {
                System.out.println(">>  "+c);
            }*/
        for(int n=f; n>0; n--)
            
        {
        fa=fa*n;
         // System.out.println(">>  "+fa);
       //  for(int a=0; a<=f;a--)
           System.out.println( n + "  " + fa);
           
           int c=0;
           
         System.out.println( "la suma es " + fa);
         
        }
       
        //subir al clasroom y la suma de los factoriales;
        
            
            
            
            
            
        
        
        
        
        
        
    }
    
}
