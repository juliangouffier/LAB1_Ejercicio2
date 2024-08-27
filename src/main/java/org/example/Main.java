package org.example;

public class Main {
    public static void main(String[] args) {
        Reloj reloj = new Reloj("Guchi","x93l42");
        Persona persona1 = new Persona ("Hernan","Amieva",65,173,76,reloj);
        System.out.println(DateUtils.obtenerDiaPorDate(persona1.getReloj().getDia()));
        persona1.getReloj().incrementarDia();
        System.out.println(DateUtils.obtenerDiaPorDate(persona1.getReloj().getDia()));
        persona1.hablar();
        persona1.decirHora();

        // creo relojFit
        RelojFit relojFit = new RelojFit("2024","A23DDJ");
        persona1.setReloj(relojFit);
        System.out.println(((RelojFit) persona1.getReloj()).calcularPesoideal(80,180));

    }
}