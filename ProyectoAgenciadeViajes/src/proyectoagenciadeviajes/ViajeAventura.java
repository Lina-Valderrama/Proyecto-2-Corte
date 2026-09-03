package proyectoagenciadeviajes;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author uestudiantes
 */
public class ViajeAventura extends Viaje{
 private String actividad;
 private int nivelDificultad;
 private double costoEquipo;
 private char codigoActividad;
 
 public ViajeAventura(){
     super();
 }
 public ViajeAventura(String actividad, int nivelDificultad, double costoEquipo, char codigoActividad){
     this.actividad= actividad;
     this.nivelDificultad= nivelDificultad;
     this.costoEquipo= costoEquipo;
     this.codigoActividad= codigoActividad;
 }
 public ViajeAventura(String actividad, int nivelDificultad,double costoEquipo) {
     this(actividad, nivelDificultad, costoEquipo, 'A');
}
public ViajeAventura(String actividad, int nivelDificultad) {
    this(actividad, nivelDificultad, 150000, 'A');
 }
public String getactividad() {
    return actividad;
}
public int getnivelDificultad() {
    return nivelDificultad;
}
public double getcostoEquipo() {
    return costoEquipo;
}
public char getcodigoActividad() {
    return codigoActividad;
}
public void setactividad(String actividad) {
        this.actividad = actividad;
    }
public void setnivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
public void setcostoEquipo(double costoEquipo) {
        this.costoEquipo = costoEquipo;
    }
public void setcodigoActividad(char codigoActividad) {
        this.codigoActividad = codigoActividad;
    }
}
