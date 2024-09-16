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
      //Creacion de objeto
      Fraccion f1=new Fraccion(10,2);//Contruir el objeto previamente
      //Primitivos int, float, double, boolean
      //Tipos de datos compuestos son clases
      Fraccion f2=new Fraccion(8,2);
      
      System.out.println(f1.sumar(f2));
  
    }
}
