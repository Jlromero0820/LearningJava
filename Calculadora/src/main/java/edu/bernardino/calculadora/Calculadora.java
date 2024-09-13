/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.bernardino.calculadora;

/**
 *
 * @author Jonanyu 11.2
 */
public class Calculadora {

    public static void main(String[] args) {
        int suma=Calculadora.sumar(50,55);
        System.out.println("El resultado de la suma es:"+suma);
    }

    public static int sumar(int a, int b) {//acceso loquedevulve nombreMetodo ()
        int resultado = a + b;
        return resultado;
    }
}
