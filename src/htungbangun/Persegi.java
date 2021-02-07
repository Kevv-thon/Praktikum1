/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htungbangun;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Persegi {
   void hitung() {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Masukkan sisi : ");
       int ppersegi = input.nextInt();
       
       int phasil = 6 * ppersegi;
       
       System.out.println("Luas persegi : "+phasil);
   } 
}
