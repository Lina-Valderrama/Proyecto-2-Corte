/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uestudiantes
 */
public class viajeAventura extends Viaje{
 private String actividad;
 private int nivelDificultad;
 private double costoEquipo;
 private char codigoActividad;
 
 public viajeAventura(){
     
 }
 public viajeAventura(String actividad, int nivelDificultad, double costoEquipo, char codigoActividad){
     this.actividad= actividad;
     this.nivelDificultad= nivelDificultad;
     this.costoEquipo= costoEquipo;
     this.codigoActividad= codigoActividad;
 }
 public viajeAventura(String actividad, int nivelDificultad, double costoEquipo){
     this.actividad= actividad;
     this.nivelDificultad= nivelDificultad;
     this.costoEquipo= costoEquipo;
    }
}
