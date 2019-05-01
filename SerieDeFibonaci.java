/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie.de.fibonaci;
import java.util.Scanner;
/**
 *
 * @author PC04-LAB02
 */
public class SerieDeFibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        int n=teclado.nextInt();
      int ff1;
      int ff2;
  int f2;
        if(n<=1)
        {
             System.out.println(" los numeros ingresados deben ser mayor a 1"); 
           
        }
        
        else{
            int f0=0;
        int f1=1;
   
           System.out.println( f0 +" -"+ f1 );
            
        for(int f=2;f<=n;f++)
        {
                System.out.println(f0+f1 ); 
            f2=f1;
            f1=f0+f1;
            f0=f2;
            
           
          // System.out.println(f1 +" -"+ ff2 ); 
        
        }//lave for
        
        
        
       }//llave de else
    }
    
}
