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
public class arreglo4 {
    
    public static void main(String[]args){
        Scanner lec= new Scanner(System.in);
        final int MAX=10;
        int suma = 0;
        int edad [] = new int [MAX];
        
        for(int i=0;i<MAX;i++){
            System.out.println("\n ingrese edad: ");
            edad[i]= lec.nextInt(MAX);
            suma=edad[i]+suma;
        }
        System.out.println("\n imprimir edad");
        for(int i=0; i<MAX; i++){
            System.out.println(edad[i]+ " ");
        }
        for(int i=0; i<MAX;i++){
            System.out.println(edad[i]+ " ");
            
        }
        //imprimir suma
        System.out.println(suma);
        System.out.println("\n Buscar el elemento ingresado");
    }
    
}
