package com.upchiapas.HerenciaFigura.models;

public class Circulo extends Figura{
    private byte radio;

    public Circulo (){}
    public byte getRadio() {return radio;}

    public void setRadio(byte radio) {this.radio = radio;}
    public float calcularArea(){
        area=(float) (Math.PI * Math.pow(radio,2.0));
        return area;
    }
}
