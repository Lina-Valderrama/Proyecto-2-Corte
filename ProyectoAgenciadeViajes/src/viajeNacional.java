/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uestudiantes
 */
public class ViajeNacional extends Viaje {
    private String ciudadOrigen;
    private int cantidadHoras;
    private double recargo;
    private char codigoAeropuerto;

    public ViajeNacional(){
        
}
    public ViajeNacional(String ciudadOrigen, int cantidadHoras, double recargo, char codigoAeropuerto){
        this.ciudadOrigen= ciudadOrigen;
        this.cantidadHoras= cantidadHoras;
        this.recargo= recargo;
        this.codigoAeropuerto= codigoAeropuerto;
    }
    public ViajeNacional(String ciudadOrigen,int cantidadHoras){
        this.ciudadOrigen= ciudadOrigen;
        this.cantidadHoras= cantidadHoras;
    }
    public ViajeNacional(String ciudadOrigen){
        this.ciudadOrigen= ciudadOrigen;
    }
}
