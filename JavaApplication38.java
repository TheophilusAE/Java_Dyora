/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tabungan = 100;
        int uang = 100;
        while (tabungan>0 && uang!=0){
            System.out.print("Masukan Uang: ");
            uang = input.nextInt();
            tabungan += uang;
        }
        System.out.print("Sisa Saldo: "+tabungan);
    }
    
}
