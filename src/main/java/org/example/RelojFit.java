package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Hernan
 * @author El Angel
 */
public class RelojFit extends Reloj {
    private int cordenadaX;
    private int cordenadaY;   
    
    public RelojFit(LocalDate dia, LocalTime hora, String modelo, String numeroSerie) {
        super(dia, hora, modelo, numeroSerie);
        this.cordenadaX=0;
        this.cordenadaY=0;
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
    
    public String calcularPesoideal (double peso, int altura) {
        String pideal = null;
        if ((peso/(altura * altura)) < 19){
            pideal = "Esta por debajo de su peso ideal.";
        } else if ((peso/(altura * altura)) == 19 || (((peso/(altura * altura)) > 19) && (peso/(altura * altura)) < 25)){
            pideal = "Esta en su peso ideal.";
        } else if ((peso/(altura * altura)) > 25){
            pideal = "Usted tiene sobrepeso.";
        }
        return pideal;
    }
    
}
