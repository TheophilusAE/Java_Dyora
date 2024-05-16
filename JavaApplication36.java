/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication36;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.print("Input Angka : ");
            pilih = input.nextInt();
            switch (pilih){
                case 5:
                    System.out.println("Grade A");
                    break;
                case 7:
                    System.out.println("Grade B");
                    break;
                default:
                    System.out.println("Grade D");
                    break;
                case 9:
                    System.out.println("Grade C");
                    break;
            }
        }while (pilih < 10 );
    }
    
}
