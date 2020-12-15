/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;
import practica_10.KeyboardInput;
/**
 * Clase Cajero
 * @author Equipo D 
*/
public class Cajero { //clase Cuenta
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta();
        KeyboardInput input = new KeyboardInput();
        System.out.println("Ingrese el monto a depositar:");
        int monto = input.readInteger();
        cuenta.depositar(monto);
        try{
            System.out.println("Ingrese el monto a retirar:");
            monto = input.readInteger();
            cuenta.retirar(monto);
        }catch (SaldoInsuficienteException ex){
            System.out.println("Saldo insuficiente");
        }
    }
}
