/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author aleja
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //Si es fin de semana da igual cuantas bellotas haya.
        if (finDeSemana){
            return true;
        }
        //Si llega aqui es que no es fin de semana.
        if(numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        //Ya no hace falta poner mas aqui ya que si llega aqui devuelve siempre falso.
        return false; 
        
    }
    
/**
 * Multa.
 */
 public int multa (int velocidad, boolean birthday){
     if(birthday){
         velocidad = velocidad - 5; //velocidad -= 5;    Es otra forma pero es lo mismo.
         
     }
     //Si va a menos de 60km/h.
     if (velocidad <= 60){
         return 0;
     }
     //Si va entre 61 y 80.
     if(velocidad > 60 && velocidad <= 80){
         return 1; //Multa pequeña.
     }
     //En cualquier otro valor que tuviera velocidad devolvemos multa grande
     return 2;
 }
 
 /**
  * Número vanidoso. Es vanidoso si es múltiplo de 11 o uno mas de un múltiplo de 11.
  */
 public boolean muyVanidoso(int numero){
     if (numero % 11 < 2){//Si la división da como resto cero.
         return true;
     }
     
     return false;
 }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un objeto de la clase en la que estamos (EjerciciosBasicosJava).
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        
        System.out.println("Ejercicio 01 ardillas");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        
        System.out.println("Ejercicio 02 multa");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));
        
        System.out.println("Ejercicio 03 muy vanidoso");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
    }
    
}
