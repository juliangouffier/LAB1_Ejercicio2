package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Hernan
 * @author Julian
 * @author Valeria
 * @author Franco
 */
public class RelojFit extends Reloj {
    private int cordenadaX;
    private int cordenadaY;   

    public RelojFit(String modelo, String numeroSerie) {
        super(modelo, numeroSerie);
        this.cordenadaX = 0;
        this.cordenadaY = 0;
    }
    

    public int getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(int cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public int getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(int cordenadaY) {
        this.cordenadaY = cordenadaY;
    }
    
    public void contarPasos(int x2, int y2) {
        Integer pasos= Math.round((float)Math.sqrt(Math.pow((x2 - cordenadaX), 2)+Math.pow(y2-cordenadaY, 2)));
        System.out.println("Pasos Recorridos: " + pasos);
    }

    public String calcularPesoideal(double peso, int alturaEnCm) {
        // Convertir altura de cm a metros
        double alturaEnMetros = alturaEnCm / 100.0;

        // Calcular IMC
        double imc = peso / (alturaEnMetros * alturaEnMetros);

        String pideal;
        if (imc < 19) {
            pideal = "Está por debajo de su peso ideal.";
        } else if (imc >= 19 && imc < 25) {
            pideal = "Está en su peso ideal.";
        } else {
            pideal = "Usted tiene sobrepeso.";
        }
        return pideal;
    }


}
