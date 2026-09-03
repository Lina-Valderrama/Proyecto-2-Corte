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
    
    public ViajeInternacional(String destino,double precio,int duracionDias,boolean disponible,String paisDestino,int cantidadEscala,double impuesto,char moneda) {
         super(destino, precio, duracionDias, disponible);

        this.paisDestino = paisDestino;
        this.cantidadEscala = cantidadEscala;
        this.impuesto = impuesto;
        this.moneda = moneda;
    }
    public ViajeInternacional(String destino,double precio,int duracionDias,boolean disponible,String paisDestino,int cantidadEscala,char moneda) {
        this(destino, precio, duracionDias, disponible,paisDestino, cantidadEscala, 0, moneda);
    }
    
    public ViajeInternacional(String destino,double precio,int duracionDias,boolean disponible,String paisDestino, int cantidadEscala) {
        this(destino, precio, duracionDias, disponible,paisDestino, cantidadEscala, 0, '$');
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
    @Override
    public String toString() {
    return "ViajeInternacional{" +
            "destino='" + getDestino() + '\'' +
            ", precio=" + getPrecio() +
            ", duracionDias=" + getDuracionDias() +
            ", disponible=" + isDisponible() +
            ", paisDestino='" + paisDestino + '\'' +
            ", cantidadEscala=" + cantidadEscala +
            ", impuesto=" + impuesto +
            ", moneda=" + moneda +
            '}';
    }
}

