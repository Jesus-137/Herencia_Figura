package com.upchiapas.HerenciaFigura;

import com.upchiapas.HerenciaFigura.models.Circulo;
import com.upchiapas.HerenciaFigura.models.Ractanculo;
import com.upchiapas.HerenciaFigura.models.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte r;
        byte a, b;
        Scanner entrada=new Scanner(System.in);
        Circulo circulo=new Circulo();
        System.out.println("Ingrese el radio del circulo");
        r=entrada.nextByte();
        circulo.setRadio(r);
        Triangulo triangulo=new Triangulo();
        System.out.println("Ingrese la altura del triangulo");
        a=entrada.nextByte();
        triangulo.setAltura(a);
        System.out.println("Ingrese la base del triangulo");
        b=entrada.nextByte();
        triangulo.setBase(b);
        Ractanculo ractanculo= new Ractanculo();
        System.out.println("Ingrese la bese del rectangulo");
        b=entrada.nextByte();
        ractanculo.setBase(b);
        System.out.println("Ingrese la area del rectanculo");
        a=entrada.nextByte();
        ractanculo.setAltura(a);
        System.out.println("El area del circulo es: "+circulo.calcularArea());
        System.out.println("El area del triangulo es: "+triangulo.calcularArea());
        System.out.println("El area del rectanculo es: "+ractanculo.calcularArea());
    }
}
