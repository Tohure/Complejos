package com.example;


public class Principal {
    public static void main(String[] main) {
        ComplejoAmpliado z, w;
        z = new ComplejoAmpliado(5, -3,true);
        w = new ComplejoAmpliado(2, -2,true);
        z.suma(w);
        System.out.println("Complejo: " + z);
        System.out.println("Es Real: " + z.esReal());
    }
}