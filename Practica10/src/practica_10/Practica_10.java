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
        System.out.println("Actividad 1*****************");
        try{
            KeyboardInput input = new KeyboardInput();
            String mensajes[]= new String[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Escriba un nombre:\n");
                mensajes[i] = input.readString();
            }
            for (int i=0; i<4; i++){
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: apuntador fuera de rango");
        }
        
        
        System.out.println("\nActividad 2**************");
        try{
            KeyboardInput input = new KeyboardInput();
            float a, equis;
            System.out.print("Escriba un numero:\n");
            a = input.readFloat();
            equis = 5/a;
            System.out.println("La division es: "+equis+"\n");
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre 0");
        }finally{
            System.out.println("A pesar de todo se ejecuta finally");
        }
        
        
        System.out.println("\nActividad 3****************");
        try{
            float equis = 5/0;
            System.out.println("Equis: "+equis);
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
        
        
        System.out.println("\nActividad 4*******");
        try{
            KeyboardInput input = new KeyboardInput();
            int a, b;
            System.out.print("Escriba un numero entero para el numerador:\n");
            a = input.readInteger();
            System.out.print("Escriba un numero entero para el denominador:\n");
            b = input.readInteger();
            int division = division(a,b);
            System.out.println("Division = "+ division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion aritmetica");
        } 
       /*
        int division = division(8,0);
        System.out.println("Division = "+ division);
        */
       
       
       System.out.println("\nActividad 5*******");
        try{
            KeyboardInput input = new KeyboardInput();
            int a, b;
            System.out.print("Escriba un numero entero para el numerador:\n");
            a = input.readInteger();
            System.out.print("Escriba un numero entero para el denominador:\n");
            b = input.readInteger();
            int division = division2(a,b);
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
