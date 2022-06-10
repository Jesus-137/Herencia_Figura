package com.upchiapas.HerenciaFigura.models;

public class Figura {
    protected float area;
    protected String version;

    public Figura(){}
    public Figura(String version){
        this.version=version;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
