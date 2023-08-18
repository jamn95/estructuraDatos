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
public class arreglo3 {
    public static void main(String[]args){
        Scanner lectura= new Scanner(System.in);
        final int totalEdades =10;
        int edades [] = new int [totalEdades];
        
        for(int i = 0 ;i < totalEdades; i++){
            System.out.println("\n ingrese edad: ");
            edades[i] =lectura.nextInt(totalEdades);
            
        }
        System.out.println("\n impresion de Edades: ");
        for(int i=0;i<totalEdades;i++){
            System.out.println(edades[i]+" ");
        }
    }
    
}
