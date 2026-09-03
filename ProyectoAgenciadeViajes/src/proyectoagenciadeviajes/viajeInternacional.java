package proyectoagenciadeviajes;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uestudiantes
 */
public class ViajeInternacional extends Viaje{
    private String paisDestino;
    private int cantidadEscala;
    private double impuesto;
    private char moneda;   
    
    public ViajeInternacional(){
    super();    
    }
    public ViajeInternacional(String paisDetino, int cantidadEscala, double impuesto, char moneda){
        this.paisDestino= paisDetino;
        this.cantidadEscala= cantidadEscala;
        this.impuesto= impuesto;
        this.moneda= moneda;
    }
    public ViajeInternacional(String paisDestino, int cantidadEscala,
            char moneda, double impuesto) {

        this(paisDestino, cantidadEscala, impuesto, moneda);
    }
    public ViajeInternacional(String paisDestino, int cantidadEscala) {

        this(paisDestino, cantidadEscala, 0, 'D');
    }
    public String getpaisDestino(){
        return paisDestino;
    }
    public int getcantidadEscala(){
        return cantidadEscala;
    }
    public double getimpuesto(){
        return impuesto;
    }
    public char getmoneda(){
        return moneda;
    }
    public void setpaisDestino(String paisDestino){
        this.paisDestino= paisDestino;
    }
    public void setcantidadEscala(int cantidadEscala){
        this.cantidadEscala= cantidadEscala;
    }
    public void setimpuesto(double impuesto){
        this.impuesto= impuesto;
    }
    public void setmoneda(char moneda){
        this.moneda= moneda;
    }
}

