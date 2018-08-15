
package ejercicio14video19;

import java.util.*;

public class adivina {

public void numero(){
    
    int aleatorio = (int)(Math.random()*100);
    
    Scanner entrada = new Scanner(System.in);
    
    int numero = 0;
    int intentos = 0;
    
    while(numero!=aleatorio){
        
        intentos++;
        
        System.out.println();
        
        System.out.println("INTRODUCE UN NUMERO, POR FAVOR: ");
        
        numero = entrada.nextInt();
        
        if(aleatorio < numero){
            
            System.out.println();
            
            System.out.println("EL NUMERO QUE SE A GENERADO ES MAS BAJO");
            
        }else if(aleatorio>numero){
            
            System.out.println();
            
            System.out.println("EL NUMERO QUE SE A GENERADO ES MAS ALTO");
        }
    }
    
    System.out.println();
    
    System.out.println("CORRECTO. LO HAS CONSEGUIDO EN " + intentos + "INTENTOS");
}
    
}
