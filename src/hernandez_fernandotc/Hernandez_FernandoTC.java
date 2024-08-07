/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandez_fernandotc;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fdhg0
 */
public class Hernandez_FernandoTC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        while (true) {
            System.out.println("-----MENU-----");
            System.out.println("1---Triangulos");
            System.out.println("2---Minimo y Mayor");
            System.out.println("3---Num Perfect");
            System.out.println("--------------");

            int opcion = lea.nextInt();

            switch (opcion) {

                case 1:

                    int base = 0;
                    int altura = 0;
                    double Area = 0;
                    double areaMayor = 0;
                    int trianguloMayor = 0;

                    for (int triangulo = 1; triangulo <= 8; triangulo++) {
                        try {
                            System.out.println("Ingrese la base del triangulo " + triangulo + " : ");
                            base = lea.nextInt();
                            while (base <= 0) {
                                System.out.println("Ingrese la base del triangulo " + triangulo + " : ");
                                base = lea.nextInt();

                            }
                            while (altura <= 0){
                                System.out.println("Ingrese la altura del triangulo " + triangulo + " : ");
                                altura = lea.nextInt();
                            }
                            Area = (base * altura) * 1 / 2;
                            System.out.println("la area del triangulo " + triangulo + " es: " + Area + "  ");
                            if (areaMayor < Area) {
                                areaMayor = Area;
                                trianguloMayor = triangulo;
                            } else {
                                System.out.println("");
                            }

                        } catch (InputMismatchException error) {
                            System.out.println("ERROR");
                            lea.nextLine();
                            triangulo--;
                        }

                    }
                    System.out.print("la area mayor es: " + areaMayor + " del triangulo: " + trianguloMayor + "");
                    System.out.println("");
                    break;

                case 2:
                    
                    int numero1=0;
                    int numero2=0;
                    
                    System.out.println("Ingrese el valor del numero 1: ");
                    numero1=lea.nextInt();
                    System.out.println("Ingrese el valor del numero 2: ");
                    
                    
                    
                    
                case 3:
            }
        }
    }

}
