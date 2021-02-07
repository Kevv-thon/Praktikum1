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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran gugu = new Lingkaran();
        Persegi hihi = new Persegi();
        
        System.out.println("Mencari luas");
        System.out.println("Silahkan dipilih");
        System.out.println("1. Luas lingkaran");
        System.out.println("2. Luas Persegi");
        System.out.println("");
        System.out.print("Masukkan pilihan angka : ");
        int pilih = input.nextInt();
        
        switch(pilih) {
            case 1 :
                gugu.hitung();
                break;
            case 2 :
                hihi.hitung();
                break;
        }
    }
    
}
