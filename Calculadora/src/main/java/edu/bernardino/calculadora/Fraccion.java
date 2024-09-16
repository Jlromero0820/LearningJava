/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bernardino.calculadora;

/**
 *
 * @author Jonanyu 11.2
 */
public class Fraccion {

    //Modificadores de acceso
    //Fracciones
    // public,package,protected, private
    //Atributos
    private int numerador;//Numerador
    private int denominador;//Denominador

    //Constructor
    public Fraccion(int numerador1, int denominador1) {
        this.numerador = numerador1;
        if (denominador1 == 0) {
            this.denominador = 1;
        } else {
            this.denominador = denominador1;
        }
    }

    public Fraccion() {
        this.denominador = 1;
    }

    //Metodos
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numero1) {
        this.numerador = numero1;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int numero2) {
        if (numero2 != 0) {
            this.denominador = numero2;
        }
    }
    
    public Fraccion sumar(Fraccion frac){
        if (this.denominador==frac.getDenominador()) {
            int numeradorFrac= this.numerador+frac.getNumerador();
            Fraccion resulfra=new Fraccion(numeradorFrac,frac.getDenominador());
            return resulfra;
        }
        int mcm= calcularMCM(frac);
        int num1=(mcm/this.denominador)*this.numerador;
        int num2=(mcm/frac.getDenominador())*frac.getNumerador();
        int newNumer=num1+num2;
        Fraccion resulfrac=new Fraccion(newNumer,mcm);
        return resulfrac;
    }
    
    @Override
    public String toString(){//Puedes definir como tu quieras que se vea tu clase
        return this.numerador+"/"+this.denominador;
    }
    
    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int calcularMCM(int a, int b) {
        return Math.abs(a * b) / calcularMCD(a, b);
    }

    private int calcularMCM(Fraccion fr) {
        int denominador1 = this.denominador;  
        int denominador2 = fr.getDenominador();
        return calcularMCM(denominador1, denominador2);
    }
}
