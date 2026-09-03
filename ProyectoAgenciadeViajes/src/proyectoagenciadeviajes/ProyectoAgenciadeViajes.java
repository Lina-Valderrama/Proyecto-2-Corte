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
        
        Viaje viaje1 = new Viaje("Brasil", 1500, 30, true);
        
        Viaje viaje2 = new Viaje("México", 1200, 30, true);
        
        ViajeInternacional internacional1 = new ViajeInternacional("España", 3500, 12, true, "Bogotá", 2, 450, '€');
  
        ViajeInternacional internacional2 = new ViajeInternacional("Francia", 3200, 10, true, "Bogotá", 2, 450, '€');
        
        ViajeNacional nacional1 = new ViajeNacional("Medellín", 500, 3, true, "Bogotá", 1, 50, 'M');
        
        ViajeNacional nacional2 = new ViajeNacional("Cartagena", 800, 5, true, "Bogotá", 2);
        
        ViajeAventura aventura1 = new ViajeAventura("San Gil", 900, 4, true, "Rafting", 3, 200, 'R');
        
        ViajeAventura aventura2 = new ViajeAventura("Salento", 700, 3, true, "Senderismo", 2);
        
         Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("¿Desea ver los viajes? (1 = Sí, 2 = No)");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.println(viaje1);
                System.out.println(viaje2);

                System.out.println(internacional1);
                System.out.println(internacional2);

                System.out.println(nacional1);
                System.out.println(nacional2);

                System.out.println(aventura1);
                System.out.println(aventura2);
            }

        } while (opcion == 2);

        entrada.close();
    }
} 

        

    
    


