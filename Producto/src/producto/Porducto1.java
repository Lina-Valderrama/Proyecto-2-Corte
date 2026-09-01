/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

/**
 *
 * @author uestudiantes
 */
public class Porducto1 {
    public String nombre;
    public double precio;
    public boolean mover;
    public Porducto1(){}
        public Porducto1(String nombre, double precio, boolean mover){
            this.nombre = nombre;
            this.precio = precio;
            this.mover = mover;
        }
        public static void main (String[]args){
            Porducto1 producto = new producto("gaseosa", 2500, false);
            Porducto1 producto2 = new producto2("chocoramo",3000, false);
            Porducto1 producto3 = new producto3("Gansito", 2700, false);
            
          System.out.println("El producto"+ producto.nombre +"tiene el precio de:"+ producto.precio
          );
        }
    }

