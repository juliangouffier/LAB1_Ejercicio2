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
//  Este metodo lo probe aparte y no me funciono @Hernan
    public LocalDate incrementarDia(){        
       return dia.plusDays(1);     
    }
//  Este si funciono lo dejo comentado por las dudas @Hernan
//    public void incrementarDia () {
//        dia = dia.plusDays(1);
//    }
    
//  Lo mismo que el anterior @Hernan
    public LocalTime incrementarHora(){
        return hora.plusHours(1);
    }   
//  Este si funciono lo dejo comentado por las dudas @Hernan
//    public void incrementarHora () {
//        hora = hora.plusHours(1);
//    }
    
    public void limpiarPantalla(){
        LocalDate hoy= LocalDate.now();        
        dia.of(hoy.getYear(), hoy.getMonth(), 1);
        System.out.println("Fecha: "+dia.toString());
    }
//   Aca tambien dejo un metodo de como entendi yo el limpiar pantalla, se supone que reinicia el reloj a todo 0
//   pero faltaria implementar metodos como plusYear, plusMonth y plusMins para que el usuario pueda dejarlo en fecha y hora como quiera.
//    public void limpiarPantalla(){
//        dia = LocalDate.of(0, Month.JANUARY, 1);
//        hora = LocalTime.of(0, 0, 0, 0);
//    }
    
}
