/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarreglo1;

import java.util.Scanner;

/**
 *
 * @author 1061778651
 */
public class arreglo5 {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int[]arregloA = new int[10];
        int[]arregloB = new int[10];
        int[]arregloC = new int[10];
                
        System.out.println("ingrese los elementos del arreglo A:");
        for (int i = 0; i<10;i++){
            arregloA[i] = scanner.netxInt();
        }
        System.out.println("ingrese los elementos del arreglo B:");
        for (int i = 0; i<10;i++){
            arregloB[i] = scanner.netxInt();
    }
        System.out.println("el producto de los arreglos A y B es:");
        for (int i = 0; i<10;i++){
             System.out.println(arreglo A[i]+"*"+arregloB[i]+"="+producto[i]);
        }
}
}
