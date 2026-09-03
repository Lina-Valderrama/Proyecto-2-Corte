package proyectoagenciadeviajes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uestudiantes
 */
public class Viaje {
    
    private String destino;
    private double precio;
    private int duracionDias;
    private boolean disponible;  
    
    public Viaje(){
        this("Brasil", 1500, 30, false);
        
    }
   public Viaje(String destino,double precio, int duracionDias,boolean disponible){
       this.destino= destino;
       this.precio= precio;
       this.duracionDias= duracionDias;
       this.disponible= disponible;
    
}
   public Viaje(String destino, double precio){
       this(destino, precio, 30, false);
       
   }

   public Viaje(String destino, double precio,int duracionDias){
       this(destino, precio, duracionDias, false);
       
   }
  public String getDestino() {
    return destino;
}
  public double getPrecio() {
    return precio;
}
  public int getDuracionDias() {
    return duracionDias;
}
  public boolean isDisponible() {
    return disponible;
}
}