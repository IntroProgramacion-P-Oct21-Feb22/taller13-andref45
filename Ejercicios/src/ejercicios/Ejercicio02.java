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
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        double promedio;
        double suma = 0;
        int numeroCalificaciones = 4;
        int i = 1;
        boolean bandera = true;
        String valor;
        while (bandera) {
            try {
                while (i <= 4) {
                    System.out.println("Ingrese calificación:");
                    calificacion = entrada.nextDouble();
                    suma = suma + calificacion;
                    i = i + 1;
                    if (calificacion < 0 || calificacion > 10) {
                        throw new Exception("Ingrese una calificación válida");
                    }
                }
                promedio = suma / numeroCalificaciones;
                System.out.printf("%.2f\n", promedio);
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);

            } catch (Exception e) {
                System.out.printf("%s\n", e);
            }
            entrada.nextLine();
            System.out.println("¿Desea ingresar los datos nuevamente?");
            valor = entrada.nextLine();
            if (!valor.equals("si")) { //  Verdadero
                bandera = false;
            }
        }
    }
}
