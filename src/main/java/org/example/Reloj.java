package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author Hernan
 * @author Julian
 * @author Valeria
 * @author Franco
 */
public class Reloj {
    private LocalDate dia;
    private LocalTime hora;
    private String modelo;
    private String numeroSerie;

    public Reloj(String modelo, String numeroSerie) {
        this.dia = LocalDate.now();
        this.hora = LocalTime.now();
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    public void incrementarAño () {
        dia = dia.minusYears(1);
    }
    
    public void incrementarMes () {
        dia = dia.minusMonths(1);
    }
    
    public void incrementarDia () {
        dia = dia.plusDays(1);
    }
      
    public void incrementarHora () {
        hora = hora.plusHours(1);
    }
    
    public void incrementarMinutos () {
        hora = hora.plusMinutes(1);
    }
    
    public void limpiarPantalla(){
        LocalDate localDate = LocalDate.now();
        dia = LocalDate.of(localDate.getYear(), Month.JANUARY, 1);
        hora = LocalTime.of(0, 0, 0, 0);
    }

   /* public String calcularPesoideal (double peso, int altura) {
        return "Oops, este reloj no puede calcular eso";
    }*/
}
