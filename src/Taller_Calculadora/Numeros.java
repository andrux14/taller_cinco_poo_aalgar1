//Paquete
package Taller_Calculadora;

import java.util.Scanner;

//Clase Numero dentro del paquete Taller_Calculadora
public class Numeros {
    double numeroA;
    double numeroB;
    int operacion;

    //Metodo constructor
    public Numeros(){

        System.out.println("Ingrese el primer numero: ");
        Scanner scannerNumeroA = new Scanner(System.in);
        numeroA = scannerNumeroA.nextInt();

        System.out.println("Ingrese el primer numero: ");
        Scanner scannerNumeroB = new Scanner(System.in);
        numeroB = scannerNumeroB.nextInt();

        System.out.println("Selecciones la operacion que desea realizar?  ");
        System.out.println("Marque 1 para Sumar ");
        System.out.println("Marque 2 para Restar");
        System.out.println("Marque 3 para Multiplicar");
        System.out.println("Marque 4 para Dividir");
        Scanner scannerOperacion = new Scanner(System.in);
        operacion = scannerOperacion.nextInt();

    }

}
