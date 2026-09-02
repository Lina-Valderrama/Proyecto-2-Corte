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
        
    }
   public Viaje(String destino,double precio, int duracionDias,boolean diponible){
       this.destino= destino;
       this.precio= precio;
       this.duracionDias= duracionDias;
       this.disponible= diponible;
    
}
   public Viaje(String destino, double precio){
       this.destino= destino;
       this.precio= precio;
       
   }

   public Viaje(String destino, double precio,int duracionDias){
       this.destino= destino;
       this.precio= precio;
       this.duracionDias= duracionDias;
       
   }
}

