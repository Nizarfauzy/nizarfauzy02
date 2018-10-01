/*
@author kitttyyyy
 * NAMA                 : Nizar Fauzi Ryamizard
 * KELAS                : IF-2
 * NIM                  : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan 
                        WAKTU DAN TANGGAL SEKARANG
 */
package PBO_IF2_3_10117059_Latihan26_WaktuSaatIni;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PBO_IF2_3_10117059_Latihan26_WaktuSaatIni {

    public static void main(String[] args) {

     Date Waktu = new Date( );
      SimpleDateFormat FormatWaktu = new SimpleDateFormat 
        ("EEEE, dd MMM yyyy hh:mm:ss");

      System.out.println("Hari ini adalah hari : " + FormatWaktu.format(Waktu));
    }

}
