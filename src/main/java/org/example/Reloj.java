/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author El Angel
 */
public class Reloj {
    private LocalDate dia;
    private LocalTime hora;
    private String modelo;
    private String numeroSerie;

    public Reloj(LocalDate dia ,LocalTime hora ,String modelo, String numeroSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
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
    
    public LocalDate incrementarDia(){        
       return dia.plusDays(1);     
    }
    
    public LocalTime incrementarHora(){
        return hora.plusHours(1);
    }
    
    public void limpiarPantalla(){
        LocalDate hoy= LocalDate.now();        
        dia.of(hoy.getYear(), hoy.getMonth(), 1);
        System.out.println("Fecha: "+dia.toString());
    }
    
    
}
