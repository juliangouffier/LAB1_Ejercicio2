package org.example;

import java.time.LocalTime;

/**
 * @author Hernan
 * @author El Angel
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int altura;
    private double peso;
    private Reloj reloj;

    public Persona(String nombre, String apellido, int edad, int altura, double peso, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
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
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void comer(){
      LocalTime horaahora = reloj.getHora();
        
        int comp1 = horaahora.compareTo(LocalTime.of(6, 0, 0, 0));
        int comp2 = horaahora.compareTo(LocalTime.of(11, 0, 0, 0));
        int comp3 = horaahora.compareTo(LocalTime.of(15, 0, 0, 0));
        int comp4 = horaahora.compareTo(LocalTime.of(19, 0, 0, 0));
        int comp5 = horaahora.compareTo(LocalTime.of(23, 0, 0, 0));
        
        if ((comp1 == 0 || comp1 == 1) && (comp2 == 0 || comp2 == -1 )){
            System.out.println("Estoy desayunando");
        } else if((comp2 == 1) && (comp3 == 0 || comp3 == -1 )){
            System.out.println("Estoy almorzando");
        } else if((comp3 == 1) && (comp4 == 0 || comp4 == -1 )){
            System.out.println("Estoy merendando");
        } else if((comp4 == 1) && (comp5 == 0 || comp5 == -1 )){
            System.out.println("Estoy cenando");
        }
    }
    
    public void hablar(){
        //dependiendo de la fecha decir que dia es
    }
    
    public void decirHora(){
        System.out.println("La hora que marca mi reloj es: " + reloj.getHora());
    }
    
    
    
    
}
