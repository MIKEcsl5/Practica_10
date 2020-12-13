/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_10;

/**
 *
 * @author Miguel
 */
public class Practica_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ACtividad 1*****************");
        try{
            String mensajes[] = {"Antonio", "javier", "Gabriel"};
            for (int i=0; i<4; i++){
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: apuntador fuera de rango");
        }
        System.out.println("Actividad 2**************");
        try{
            float equis = 5/0;
        
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre 0");
        }finally{
            System.out.println("A pesar de todo se ejecuta finally");
        }
        System.out.println("actiividad 3****************");
        try{
            float equis = 5/0;
            System.out.println("equisss"+equis);
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: division entre 0");
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre 0");   
        }catch(Exception e){
            System.out.println("");
        }finally{
                  System.out.println("A pesar de todo se ejecuta finally");
        }
        System.out.println("Fuera de try-cath");
        
        System.out.println("Actividad 4*******");
        try{
            int division = division(8,0);
            System.out.println("Division = "+ division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion aritmetica");
        } 
       /*
        int division = division(8,0);
        System.out.println("Division = "+ division);
        */
       
       System.out.println("Actividad 5*******");
        try{
            int division = division2(8,0);
            System.out.println("Division = "+ division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion aritmetica");
        } 

    }
    
    public static int division(int a, int b) throws ArithmeticException{
        /*int c;
        try{
            c = a/b;
        }catch(ArithmeticException e){
            System.out.println("error: division entre 0");
            c = 0;
        } */
        return a/b;
    }
    
    public static int division2(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException();
        }
        int c = a/b;
        return c;
    }
}
