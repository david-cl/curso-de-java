/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;
import java.util.Scanner;
/**
 *
 * @author PC04-LAB02
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int n=teclado.nextInt();
              int x=0;  
        while(x<n)
        {
            x=x+1;
        System.out.println("numero :"+x);
        }
    }
}
