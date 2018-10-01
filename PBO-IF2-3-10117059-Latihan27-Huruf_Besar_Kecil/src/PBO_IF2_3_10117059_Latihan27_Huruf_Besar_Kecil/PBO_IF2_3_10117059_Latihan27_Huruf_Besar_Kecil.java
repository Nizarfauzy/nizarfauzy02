/*
@author kitttyyyy
 * NAMA                 : Nizar Fauzi Ryamizard
 * KELAS                : IF-2
 * NIM                  : 10117059
 * DESKRIPSI PROGRES : Program ini untuk mengubah huruf besar dan kecil
 */
package PBO_IF2_3_10117059_Latihan27_Huruf_Besar_Kecil;

import java.util.Scanner;

public class PBO_IF2_3_10117059_Latihan27_Huruf_Besar_Kecil {

    public static void main(String[] args) {

        String Kalimat;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();

        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("====Hasil Formating====");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf kecil = " + Kecil);
    }

}
