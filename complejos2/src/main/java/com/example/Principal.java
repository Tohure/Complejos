package com.example;


public class Principal {
    public static void main(String[] main) {
        Complejito lista[] = new Complejito[4];
        lista[0] = new Complejito(-1.5, 3.0);
        lista[1] = new Complejito(-1.2, -3.0);
        lista[2] = new ComplejoAmpliado(-1.5, 3.0);
        lista[3] = new ComplejoAmpliado(-1.2, 0);
        for (Complejito aLista : lista) {
            System.out.println("Complejo: " + aLista);
            if (aLista instanceof ComplejoAmpliado) {
                System.out.println("  esReal=" + ((ComplejoAmpliado) aLista).esReal());
            }
        }
    }
}