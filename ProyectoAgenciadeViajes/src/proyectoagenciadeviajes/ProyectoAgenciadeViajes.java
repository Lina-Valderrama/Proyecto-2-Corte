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
        // Se usa el constructor de 4 parámetros porque se conocen todos los datos básicos del viaje.
        Viaje viaje1 = new Viaje("Brasil", 150000, 30, true);
        // Se usa el constructor de 2 parámetros porque en este caso solo se conocen el destino y el precio.
        Viaje viaje2 = new Viaje("Mexico", 120000);
        // Se usa el constructor de 8 parámetros porque se conocen todos los datos del viaje internacional.
        ViajeInternacional internacional1 = new ViajeInternacional("Espana",35000, 12, true, "España", 2, 450, '€');
        // Se usa el constructor de 7 parámetros porque no se especifica el impuesto.
        ViajeInternacional internacional2 = new ViajeInternacional("Francia", 32000, 10, true, "Francia", 2, '€');
        // Se usa el constructor de 8 parámetros porque se conocen todos los datos del viaje nacional.
        ViajeNacional nacional1 = new ViajeNacional("Medellin", 50000, 3, true, "Bogotá", 1, 50, 'M');
        // Se usa el constructor de 6 parámetros porque no se especifican el recargo ni el código de aeropuerto.
        ViajeNacional nacional2 = new ViajeNacional("Cartagena", 8000, 5, true, "Bogotá", 2);
        // Se usa el constructor de 8 parámetros porque se conocen todos los datos de la actividad de aventura.
        ViajeAventura aventura1 = new ViajeAventura("San Gil", 90000, 4, true, "Rafting", 3, 200, 'R');
        // Se usa el constructor de 7 parámetros porque no se especifica el código de actividad.
        ViajeAventura aventura2 = new ViajeAventura("Salento", 70000, 3, true, "Senderismo", 2, 150);
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

        

    
    


