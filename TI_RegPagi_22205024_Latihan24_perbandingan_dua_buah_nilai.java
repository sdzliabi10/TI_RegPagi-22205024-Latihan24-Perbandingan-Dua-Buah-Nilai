/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Scanner;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini untuk perbandingan dua buah nilai
 */
public class TI_RegPagi_22205024_Latihan24_perbandingan_dua_buah_nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aktifitas = "ya";
        while (aktifitas.equals("ya")) {
        int nilai1,nilai2;
        System.out.println("======Program Perbandingan Nilai======");
        System.out.print("Masukkan nilai pertama :");
        nilai1 = scanner.nextInt();
        System.out.print("Masukkan nilai kedua :");
        nilai2 = scanner.nextInt();
        
       if (nilai1 < nilai2) {
            System.out.println("Hasil : " + nilai1 + " lebih kecil dari " + nilai2);
        } else if (nilai1 > nilai2) {
            System.out.println("Hasil : " + nilai1 + " lebih besar dari " + nilai2);
        } else {
            System.out.println("Hasil : " + nilai1 + " sama dengan " + nilai2);
        }
        System.out.print("Ulangi aktifitas ? (ya/tidak) :");
        aktifitas = scanner.next();
        }
    }
    
}
