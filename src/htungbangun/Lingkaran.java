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
public class Lingkaran {
    void hitung() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari - jari : ");
        double jlingkran = input.nextDouble();
        
        double hasil = Math.PI *(jlingkran*jlingkran);
        
        System.out.println("Luas lingkaran : "+hasil);
    }
}
