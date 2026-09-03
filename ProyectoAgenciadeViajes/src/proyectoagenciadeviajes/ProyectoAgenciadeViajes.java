/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoagenciadeviajes;

/**
 *
 * @author uestudiantes
 */
import java.util.Scanner;
public class ProyectoAgenciadeViajes {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Los viajes están disponibles? (1 = Sí, 2 = No)");
        int opcion = entrada.nextInt();
        boolean disponible;
        if (opcion == 1) {
            disponible = true;
        } else {
            disponible = false;
}
        Viaje viaje1 = new Viaje("Brasil", 1500, 30, disponible);
        
        
        
    }
    
    
}
