package labp1_1_josephreyes;

import java.util.Scanner;

public class Labp1_1_JosephReyes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuesta = -1;
        while (respuesta != 4) {
            System.out.println("\nMenu principal");
            System.out.println("Opcion 1: Mensaje");
            System.out.println("Opcion 2: Calculadora");
            System.out.println("Opcion 3: Edades");
            System.out.println("Opcion 4: Salir");
            System.out.println();
            if (respuesta == 1) {
                System.out.println("Hola soy yo");
            } else if(respuesta == 2) {
                System.out.print("Ingresar el primer numero: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingresar el segundo numero: ");
                int num2 = scanner.nextInt();
                int resultado = num1*num2;
                System.out.println("Resultado: "+resultado);
            } else if (respuesta == 3){
                System.out.print("Ingresar edad: ");
                int edad = scanner.nextInt();
                if (edad>17) {
                    System.out.println("La edad ingresada es mayor de edad");
                } else {
                    System.out.println("La edad ingresada no es mayor de edad");
                }
            }
        }
    }
}
