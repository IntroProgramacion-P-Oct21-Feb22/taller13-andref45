/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        String nombre;
        String valor;
        int i = 1;
        boolean bandera = true;
        while (bandera) {
            try {
                while (i <= 4) {
                    System.out.println("Ingrese calificación:");
                    calificacion = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.println("Ingrese nombre:");
                    nombre = entrada.nextLine();
                    System.out.printf("Nombre: %s\n"
                            + "Calificación: %.1f\n",
                            nombre, calificacion);
                    i = i + 1;
                    if (calificacion < 0 || calificacion > 10) {
                        throw new Exception("Ingrese una calificación válida");
                    }
                    if ("Mario".equals(nombre) || "Pedro".equals(nombre)
                            || "Ana".equals(nombre) || "Luis".equals(nombre)
                            || "Carolina".equals(nombre)) {
                        throw new Exception("Ingrese otros nombres");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (Exception c) {
                System.out.printf("%s\n", c);
            }
            entrada.nextLine();
            System.out.println("¿Desea ingresar los datos nuevamente?");
            valor = entrada.nextLine();
            if (!valor.equals("si")) { //  Verdadero
                bandera = false;
            }
            System.out.printf("%s\n", "Gracias por usar el sistema");
        }
    }
}
