/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka,p=1,x=0,y;
        do {
            angka = input.nextInt();
            x += angka;
            p++;
        }while (angka != 0);
        
        System.out.println("x= "+x);
        System.out.println("y= "+y/p);
        
    }
    
}
