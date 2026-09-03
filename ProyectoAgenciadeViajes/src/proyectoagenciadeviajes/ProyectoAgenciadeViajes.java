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
        
        Viaje viaje1 = new Viaje("Brasil", 15000, 30, true);
        
        Viaje viaje2 = new Viaje("Mexico", 12000, 30, true);
        
        ViajeInternacional internacional1 = new ViajeInternacional("Espana", 35000, 12, true, "Bogota", 2, 450, '€');
  
        ViajeInternacional internacional2 = new ViajeInternacional("Francia", 32000, 10, true, "Bogota", 2, 450, '€');
        
        ViajeNacional nacional1 = new ViajeNacional("Medellin", 5000, 3, true, "Bogota", 1, 50, 'M');
        
        ViajeNacional nacional2 = new ViajeNacional("Cartagena", 8000, 5, true, "Bogota", 2);
        
        ViajeAventura aventura1 = new ViajeAventura("San Gil", 9000, 4, true, "Rafting", 3, 200, 'R');
        
        ViajeAventura aventura2 = new ViajeAventura("Salento", 7000, 3, true, "Senderismo", 2);
        
         Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Desea ver los viajes disponibles? (1 = Si, 2 = No)");
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

        

    
    


