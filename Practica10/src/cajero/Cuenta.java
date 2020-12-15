/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 * Clase Cuenta del package cajero
 * @author Equipo D
 */
public class Cuenta {
    private double saldo;
    /**
     * constructor de la clase Cuenta
     */
    public Cuenta(){
        this.saldo = 0;
    }
    /**
     * 
     * @return retorna el valor del atributo saldo
     */
    public double getSaldo(){
        return saldo;
    }
    /**
     * 
     * @param monto recibe un dato tipo double
     */
    public void depositar(double monto){
        System.out.println("Depositanto "+monto+" pesos");
        saldo += monto;
    }
    /**
     * 
     * @param monto recibe un dato tipo double
     * @throws SaldoInsuficienteException en caso de que el saldo sea insuficiente
     */
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
