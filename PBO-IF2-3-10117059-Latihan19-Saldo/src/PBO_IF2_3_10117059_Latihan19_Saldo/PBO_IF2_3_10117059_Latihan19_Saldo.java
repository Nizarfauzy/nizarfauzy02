/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_3_10117059_Latihan19_Saldo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 *  @author kitttyyyy
 * NAMA      : Nizar Fauzy Ryamizard
 * KELAS      : IF-2
 * NIM        : 10117059
 * Deskripsi Program :PROGRAM MENAMPILKAN SALDO 
 * 
 */
public class PBO_IF2_3_10117059_Latihan19_Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double bunga;
        int saldo,bulan ;
     
        saldo = 2500000;
       bulan = 1;
       DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
    while (bulan <= 6 ){
        saldo = (int) (saldo + (saldo * 0.15));
        System.out.printf("Saldo Di Bulan ke-" + bulan + " Rp.%s \n ", kursIndonesia.format(saldo));
        bulan = bulan +1;
    }
    
    }
    
}
