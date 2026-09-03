/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoagenciadeviajes;

/**
 *
 * @author uestudiantes
 */
public class ViajeNacional extends Viaje {
    private String ciudadOrigen;
    private int cantidadHoras;
    private double recargo;
    private char codigoAeropuerto;
    
 public ViajeNacional(String destino,double precio,int duracionDias,boolean disponible,String ciudadOrigen,int cantidadHoras,double recargo,char codigoAeropuerto) {
     super(destino, precio, duracionDias, disponible);

    this.ciudadOrigen = ciudadOrigen;
    this.cantidadHoras = cantidadHoras;
    this.recargo = recargo;
    this.codigoAeropuerto = codigoAeropuerto;
    }
public ViajeNacional( String destino,double precio,int duracionDias,boolean disponible,String ciudadOrigen,int cantidadHoras,char codigoAeropuerto) {
    this(destino, precio, duracionDias, disponible,ciudadOrigen, cantidadHoras, 0, codigoAeropuerto);
    }
public ViajeNacional(String destino,double precio,int duracionDias,boolean disponible,String ciudadOrigen,int cantidadHoras) {
    this(destino, precio, duracionDias, disponible,ciudadOrigen, cantidadHoras, 0, 'N');
    }
    public String getciudadOrigen(){
        return(ciudadOrigen);
    }
    public int getcantidadHoras(){
        return(cantidadHoras);
}
    public double getrecargo(){
        return(recargo);
}
    public char getcodigoAeropuerto(){
        return(codigoAeropuerto);
    }
    public void setciudadOrigen(String ciudadOrigen){
        this.ciudadOrigen= ciudadOrigen;
    }
    public void setcantidadHoras(int cantidadHoras){
        this.cantidadHoras= cantidadHoras;
    }
    public void setrecargo(double recargo){
        this.recargo= recargo;
    }
    public void setcodigoAeropuerto(char codigoAeropuerto){
        this.codigoAeropuerto= codigoAeropuerto;
    }
    @Override
public String toString() {
    return "Viaje Nacional" +
            "\nDestino: " + getDestino() +
            "\nPrecio: " + getPrecio() +
            "\nDuracion: " + getDuracionDias() +
            "\nDisponible: " + isDisponible() +
            "\nCiudad de origen: " + ciudadOrigen +
            "\nCantidad de horas: " + cantidadHoras +
            "\nRecargo: " + recargo +
            "\nCodigo de aeropuerto: " + codigoAeropuerto +
            "\n";
}
}
