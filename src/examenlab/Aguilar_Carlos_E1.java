/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenlab;

import java.util.Scanner;

/**
 *
 * @author adrianaguilar
 */
public class Aguilar_Carlos_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       int opcion = 0;

        while (opcion != 5) {
            // Mostrar el menú
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Pirámide");
            System.out.println("2. El Mayor");
            System.out.println("3. Sistema de Cable");
            System.out.println("4. Caracteres Vocales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1) {
                // Opción 1: Pirámide
                
                 System.out.print("Ingrese el número de filas para la pirámide: ");
                int fila = scanner.nextInt();
                scanner.nextLine();

                int valor1 = 1;
                int incremento = 2;
                for (int i = 1; i <= fila; i++) {
                    int suma = 0;
                    for (int j = 0; j < i; j++) {
                        System.out.print(valor1 + " ");
                        suma += valor1;
                        valor1 += incremento;
                    }
                    System.out.println("= " + suma);
                }
            } else if (opcion == 2) {
                // Opción 2: El Mayor
                int numero;
                int maximo = Integer.MIN_VALUE;
                int suma = 0;
                int contador = 0;
                String respuesta;

                do {
                    System.out.print("Ingrese un número entero: ");
                    numero = scanner.nextInt();
                    scanner.nextLine(); 

                    if (numero > maximo) {
                        maximo = numero;
                    }

                    suma += numero;
                    contador++;

                    System.out.print("¿Desea ingresar otro número? (si/no): ");
                    respuesta = scanner.next(); 
                } while (respuesta.equalsIgnoreCase("si"));

                if (contador > 0) {
                    double promedio = (double) suma / contador;
                    System.out.println("El número mayor ingresado fue: " + maximo);
                    System.out.println("El promedio de los números ingresados es: " + promedio);
                } else {
                    System.out.println("No se ingresaron números.");
                }
            } else if (opcion == 3) {
                // Opción 3: Sistema de Cable
                System.out.print("Ingrese el nombre del cliente: ");
                String nombreCliente = scanner.nextLine();

                int canalesHD = 0;
                int canalesNormales = 0;
                int costoCanales = 0;
                String respuesta = null;

                do {
                    System.out.print("Ingrese el tipo de canal (HD/NORMAL): ");
                    String tipoCanal = scanner.nextLine();

                    if (tipoCanal.equalsIgnoreCase("HD")) {
                        canalesHD++;
                        costoCanales += 30;
                    } else if (tipoCanal.equalsIgnoreCase("NORMAL")) {
                        canalesNormales++;
                        costoCanales += 20;
                    } else {
                        System.out.println("Tipo de canal no válido. Inténtelo de nuevo.");
                        continue;
                    }

                    System.out.print("¿Desea ingresar otro canal? (si/no): ");
                    respuesta = scanner.next(); 
                    scanner.nextLine();
                } while (respuesta.equalsIgnoreCase("si"));

                System.out.print("Ingrese el tipo de Caja Digital (LIGHTBOX/HDBOX/DVRBOX): ");
                String tipoCaja = scanner.nextLine();
                int costoCaja = 0;

                if (tipoCaja.equalsIgnoreCase("LIGHTBOX")) {
                    costoCaja = 50;
                } else if (tipoCaja.equalsIgnoreCase("HDBOX")) {
                    costoCaja = 100;
                } else if (tipoCaja.equalsIgnoreCase("DVRBOX")) {
                    costoCaja = 150;
                } else {
                    System.out.println("Tipo de caja no válido. Se asignará un costo de 0.");
                }

                int subtotal = costoCanales + costoCaja;
                double impuesto = subtotal * 0.15;
                double total = subtotal + impuesto;

                System.out.println("\nDetalle para el cliente: " + nombreCliente);
                System.out.println("Canales normales: " + canalesNormales);
                System.out.println("Canales HD: " + canalesHD);
                System.out.println("Subtotal a pagar: " + subtotal + " lps");
                System.out.println("Impuesto (15%): " + impuesto + " lps");
                System.out.println("Total a pagar: " + total + " lps");
            } else if (opcion == 4) {
                // Opción 4: Caracteres Vocales
                System.out.print("Ingrese una cadena de texto: ");
                String cadena = scanner.nextLine();
                int contadorVocales = 0;

                for (int i = 0; i < cadena.length(); i++) {
                    char caracter = cadena.charAt(i);
                    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                        contadorVocales++;
                    }
                }
                        

                System.out.println("La cadena ingresada contiene " + contadorVocales + " vocales en minúsculas.");
            } else if (opcion == 5) {
                System.out.println("HASTA LUEGO...");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

