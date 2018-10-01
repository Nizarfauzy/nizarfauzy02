/*
@author kitttyyyy
 * NAMA                 : Nizar Fauzi Ryamizard
 * KELAS                : IF-2
 * NIM                  : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENGGANTI/MERUBAH KATA 
 * YANG TELAH DI INPUTKAN OLEH USER
 */
package PBO_IF2_3_10117059_latihan28.ganti_kata;

import java.util.Scanner;

public class PBO_IF2_3_10117059_LATIHAN28_GANTI_KATA {

    public static void main(String[] args) {

        String Kalimat;
        String nGanti,nJadi;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata : ");
        nGanti = scanner.nextLine();
        
        System.out.print("Menjadi Kata : ");
        nJadi = scanner.nextLine();
                      
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("ADALAH : "+ganti);        
    }

}
