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
public class Cuenta {
    private double saldo;
    
    public Cuenta(){
        this.saldo = 0;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double monto){
        System.out.println("Depositanto "+monto+" pesos");
        saldo += monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Intentando retirar "+monto+" pesos");
        if (saldo < monto){
            throw new SaldoInsuficienteException();
        }else{
            saldo -= monto;
            System.out.println("Nuevo saldo "+ saldo+ " pesos");
        }
    }
}
