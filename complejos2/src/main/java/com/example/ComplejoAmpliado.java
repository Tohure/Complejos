package com.example;


public class ComplejoAmpliado extends Complejito{

    private boolean esReal;

    public ComplejoAmpliado(double re, double im, boolean esReal) {
        super(re, im);
        esReal = im == 0;
    }

    @Override
    public void suma(Complejito v) {
        esReal = imaginario == -v.imaginario;
        super.suma(v);
    }

    public boolean esReal(){
        return esReal;
    }
}