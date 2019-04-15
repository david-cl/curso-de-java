/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacion.del.año;
import java.util.Scanner;
/**
 *
 * @author PC04-LAB02
 */
public class EstacionDelAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Scanner teclado=new Scanner(System.in);
        int mes=teclado.nextInt();
           String estacion;
         /*    
              if  (mes==1 && mes==12 && mes==2)
                      { System.out.println (estacion="invierno"); }
              else if( mes==3 && mes==4 && mes==5)
              { System.out.println(estacion="primavera");}
              else if(mes==6 && mes== 7&& mes==8)
              {System.out.println(estacion="VERANO");}
              else if(mes==9 && mes== 10 && mes==11)
              {
              System.out.println(estacion="otoño");}
              else
              {System.out.println(estacion="usted ingreso un mes equivocado");}
         */
         
            switch (mes){
                  case 1: case 2:case 12:
                  
                      System.out.println(estacion="INVIERNO");
                      break;
                  case 3: case 4:case 5:
                 
                     System.out.println(estacion="primavera");
                       break;
                  case 6: case 7:case 8:
                  
                      System.out.println(estacion="VERANO");
                        break;
                  case 9: case 10: case 11:
                        System.out.println(estacion="otoño");
                        break;
                      
                  default: System.out.println(estacion=" ERROR!! put");
                    break;
              }
    }
}
