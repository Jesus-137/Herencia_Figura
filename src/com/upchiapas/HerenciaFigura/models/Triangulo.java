package com.upchiapas.HerenciaFigura.models;

public class Triangulo extends Figura{
    private byte base, altura;

    public byte getBase() {
        return base;
    }

    public void setBase(byte base) {
        this.base = base;
    }

    public byte getAltura() {
        return altura;
    }

    public void setAltura(byte altura) {
        this.altura = altura;
    }
    public float calcularArea(){
        area=(float) ((base*altura)/2.0);
        return area;
    }
}
