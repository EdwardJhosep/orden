/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;
//importamos Scanner
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        //Creación de scanner llamado  números  con espacio para 5 elementos
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        //creacion de un bucle"for" para pedir cinco números
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        //ordena los números ingresados utilizando burbuja
        bubbleSort(numbers);
        
        System.out.println("Números ordenados:");
        for (int num : numbers) 
        //creo un system de impresion 
        {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }



    }



