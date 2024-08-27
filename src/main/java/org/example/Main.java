package org.example;

public class Main {
    public static void main(String[] args) {
    Reloj mio = new Reloj("Guchi","x93l42");
    Persona yo = new Persona ("Hernan","Amieva",65,173,76,mio);
    System.out.println(mio.getDia());
    System.out.println(mio.toString());
    mio.incrementarDia();
    System.out.println(mio.toString());
    mio.incrementarHora();
    mio.incrementarHora();
    System.out.println(mio.toString());
    mio.limpiarPantalla();
    System.out.println(mio.toString());
    System.out.println(mio.getHora());
    yo.comer();
    yo.hablar();
    yo.decirHora();
    }
}