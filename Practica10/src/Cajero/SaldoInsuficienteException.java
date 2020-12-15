/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

/**
 * Clase Saldo Insuficiente que hereda de la clase Exception
 * @author Equipo D
 */
public class SaldoInsuficienteException extends Exception{
    SaldoInsuficienteException(){
        super("Saldo Insuficiente");
    }
}
