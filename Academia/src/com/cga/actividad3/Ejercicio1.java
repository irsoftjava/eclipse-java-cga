package com.cga.actividad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        boolean correcto = true;
        int edad = 0;

        System.out.print("Introduzca su nombre, por favor: ");
        String nombre = sc.nextLine();

        do {
            try {
                System.out.print("Introduzca su edad, por favor: ");
                edad = sc.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                correcto = false;
                //System.out.println(e.getMessage());
                System.out.println("Debe Inroducir valores numéricos.");
            }
            sc.nextLine();
        } while (!correcto);


        System.out.print("Que módulo estudias?: ");
        String modulo = sc.nextLine();

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años de edad.");
        System.out.println("Estudio programación en el módulo de " + modulo);

        sc.close();
    }
}
