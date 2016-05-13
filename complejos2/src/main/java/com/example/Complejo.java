package com.example;

public class Complejo {

    // declaración de atributos

    private double modulo, fase;

    // declaración de constructor

    public Complejo(double re, double im) {
        set(re, im);
    }

    // declaración de métodos

    private void set(double re, double im) {
        modulo = Math.hypot(re, im);
        fase = Math.atan2(im, re);
    }

    public String toString() {
        return "modulo: " + modulo + ", fase: " + fase;
    }

    public void suma(Complejo v) {
        set(getReal() + v.getReal(), getImaginario() + v.getImaginario());
    }

    public double getReal() {
        return modulo * Math.cos(fase);
    }

    public void setReal(double real) {
        set(real, getImaginario());
    }

    public double getImaginario() {
        return modulo * Math.sin(fase);
    }

    public void setImaginario(double imaginario) {
        set(getReal(), imaginario);
    }
}