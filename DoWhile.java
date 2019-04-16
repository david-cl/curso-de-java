/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile;
import java.util.Scanner;

/**
 *
 * @author PC04-LAB02
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int n=teclado.nextInt();
         
         int x=0;
       
         do{
       
        if( n<=0)
        {
            for(x=0;x>=n;x--)
                 System.out.println(" numero :"+x);
                }    
        else if(n>=1)
        {
         for(x=0;x<=n;x++)
              System.out.println(" numero :"+x);
             }
       //otra opcion la mas facil 
         //  x=x+1;
           //System.out.println(" numero :"+x);
         }while(x==n);
   
    }
    
}
