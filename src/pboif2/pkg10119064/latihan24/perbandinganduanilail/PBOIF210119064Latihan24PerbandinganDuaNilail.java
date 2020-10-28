/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan24.perbandinganduanilail;

import java.util.Scanner;
/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk membandingkan dua buah nilai
 */
public class PBOIF210119064Latihan24PerbandinganDuaNilail {

    /**
     * @param args the command line arguments
     */
    public static void perbandinganNilai(int nilai1, int nilai2){
        if(nilai1 > nilai2){
            System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
        }else if(nilai1 < nilai2){
            System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
        }else{
            System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai1, nilai2;
        boolean kondisi = true;
        String ulangi = "Ya";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("======Program Perbandingan Nilai======");
        do {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = keyboard.nextInt();
            System.out.print("Masukkan nilai kedua   : ");
            nilai2 = keyboard.nextInt();
                
            perbandinganNilai(nilai1, nilai2);
            
            System.out.println("");
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = keyboard.next();
            System.out.println("");
            
            if("Ya".equals(ulangi)){
                kondisi = true;
            }else{
                kondisi = false;
            }
        } while (kondisi);
        
        
    }
    
}
