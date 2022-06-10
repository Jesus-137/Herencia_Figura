package com.upchiapas.HerenciaFigura.models;

public class Triangulo extends Figura{
    private byte base, altura;

    public Triangulo(){
        this((byte) 0, (byte) 0, "2.0");
    }

    public Triangulo(byte base, byte altura){
        this(base,altura,"2.0");
    }

    public Triangulo(byte base, byte altura, String version){
        super(version);
        this.base=base;
        this.altura=altura;
    }

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
