/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

/**
 *
 * @author Miguel
 */
public class Cajero { //clase Cuenta
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(500);
        try{
            cuenta.retirar(300);
            cuenta.retirar(300);
        }catch (SaldoInsuficienteException ex){
            System.out.println("Saldo insuficiente");
        }
    }
}
