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
        
        System.out.println(viaje1);
        
        Viaje viaje2 = new Viaje("México", 1200, 30, disponible);
        
        System.out.println(viaje2);
        
        ViajeInternacional internacional1 = new ViajeInternacional("España", 3500, 12, disponible, "Bogotá", 2, 450, '€');
        
        System.out.println(internacional1);
  
        ViajeInternacional internacional2 = new ViajeInternacional("Francia", 3200, 10, disponible, "Bogotá", 2, 450, '€');
        
        System.out.println(internacional2);
        
        ViajeNacional nacional1 = new ViajeNacional("Medellín", 500, 3, disponible, "Bogotá", 1, 50, 'M');
        
        ViajeNacional nacional2 = new ViajeNacional("Cartagena", 800, 5, disponible, "Bogotá", 2);
        
        ViajeAventura aventura1 = new ViajeAventura("San Gil", 900, 4, disponible, "Rafting", 3, 200, 'R');
        
        ViajeAventura aventura2 = new ViajeAventura("Salento", 700, 3, disponible, "Senderismo", 2);
    }
    
    
}
