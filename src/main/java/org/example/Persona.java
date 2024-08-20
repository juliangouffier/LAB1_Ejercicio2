/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author El Angel
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int altura;
    private Reloj reloj;

    public Persona(String nombre, String apellido, int edad, int altura, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void comer(){
      //Dependiendo de la hora decir si almuerza merienda cena 
    }
    
    public void hablar(){
        //dependiendo de la fecha decir que dia es
    }
    
    public void decirHora(){
        
    }
    
    
    
    
}
