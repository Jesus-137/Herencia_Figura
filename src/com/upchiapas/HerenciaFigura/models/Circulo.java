package com.upchiapas.HerenciaFigura.models;

public class Circulo extends Figura{
    private byte radio;

    public Circulo (){
        this((byte) 5, "1.0");
    }
    public Circulo(String version){
        this((byte) 5,version);
    }
    public Circulo(byte radio, String version){
        super(version);
        this.radio=radio;
    }
    public byte getRadio() {return radio;}

    public void setRadio(byte radio) {this.radio = radio;}
    public float calcularArea(){
        area=(float) (Math.PI * Math.pow(radio,2.0));
        return area;
    }
}
