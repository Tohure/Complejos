package com.example;


public class Complejito {
    protected double real, imaginario;

    public Complejito(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        return "Complejito{" +
                "real=" + real +
                ", imaginario=" + imaginario +
                '}';
    }


    public void suma(Complejito v){
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }
}
