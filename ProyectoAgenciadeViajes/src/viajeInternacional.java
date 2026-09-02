/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uestudiantes
 */
public class viajeInternacional extends Viaje{
    private String paisDestino;
    private int cantidadEscala;
    private double impuesto;
    private char moneda;   
    
    public viajeInternacional(){
        
    }
    public viajeInternacional(String paisDetino, int cantidadEscala, double impuesto, char moneda){
        this.paisDestino= paisDetino;
        this.cantidadEscala= cantidadEscala;
        this.impuesto= impuesto;
        this.moneda= moneda;
    }
}
