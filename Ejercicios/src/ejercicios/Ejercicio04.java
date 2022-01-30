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
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldo;
        String nombre;
        double[] arregloSueldos;
        int numeroDatosArreglo;
        int i = 1;
        int j;
        String valor;
        boolean bandera = true;
        while (bandera) {
            try {
                while (i <= 4) {
                    System.out.printf("Datos para usuario %d\n", i);
                    System.out.println("Cuantos sueldos quiere agregar al "
                            + "arreglo");
                    numeroDatosArreglo = entrada.nextInt();
                    if (numeroDatosArreglo > 5 || numeroDatosArreglo < 0) {
                        throw new Exception("Ingrese máximo 5 sueldos");
                    }
                    arregloSueldos = new double[numeroDatosArreglo];
                    j = 0;
                    while (j < arregloSueldos.length) {
                        System.out.printf("Agregue sueldo %d para usuario %d\n",
                                j, i);
                        sueldo = entrada.nextDouble();
                        arregloSueldos[j] = sueldo;
                        j = j + 1;
                    }

                    for (int k = 0; k < arregloSueldos.length; k++) {
                        System.out.printf("Sueldo ingresado: %.3f\n",
                                arregloSueldos[k]);
                    }

                    i = i + 1;
                    //No existe variable nota
                }
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
            System.out.printf("%s\n", "Gracias por usar el sistema");
        }
    }
}
