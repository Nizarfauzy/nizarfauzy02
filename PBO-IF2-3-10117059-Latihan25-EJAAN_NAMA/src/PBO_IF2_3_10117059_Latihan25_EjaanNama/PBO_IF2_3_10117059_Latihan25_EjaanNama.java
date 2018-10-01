/*
@author kitttyyyy
 * NAMA                 : Nizar Fauzi Ryamizard
 * KELAS                : IF-2
 * NIM                  : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN EJAAN HURUF 
 * YANG DI MASUKKAN OLEH USER
 */
package PBO_IF2_3_10117059_Latihan25_EjaanNama;

import java.util.Scanner;

public class PBO_IF2_3_10117059_Latihan25_EjaanNama {

    public static void main(String[] args) {

        String Nama;
        int Panjang;
        char huruf;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama depan anda untuk di eja : ");
        Nama = scanner.nextLine();
        
        Panjang = Nama.length();
        
        System.out.println("Ejaan untuk "+Nama+" adalah : ");
        
        for (int i = 0; i < Panjang; i++) {
            System.out.println("Huruf ke-" + (i+1) + " : " + Nama.charAt(i));
        }
    }
}
