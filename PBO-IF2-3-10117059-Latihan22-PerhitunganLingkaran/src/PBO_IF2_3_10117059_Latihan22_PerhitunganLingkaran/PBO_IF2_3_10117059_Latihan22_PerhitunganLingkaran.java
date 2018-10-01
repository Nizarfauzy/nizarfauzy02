/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_3_10117059_Latihan22_PerhitunganLingkaran;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 @author kitttyyyy
 * NAMA                 : Nizar Fauzi Ryamizard
 * KELAS                : IF-2
 * NIM                  : 10117059
 * DESKRIPSI PROGRES :PROGRAM MENAMPILKAN DIAMETER INGKARAN
 */
public class PBO_IF2_3_10117059_Latihan22_PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner (System.in);
     double PHI = 3.14159265358979323846;
     double keliling, diameter = 0, jarijari, luas;
     
     
     do{
         System.out.println("Masukkan nilai diameter ingkaran :");
         try{
             diameter = scanner.nextDouble ();
             
         }catch (Exception e){
             System.out.println("Nilai dimeter tidak sesuai");
             scanner.nextLine();
         }
         
     }while (diameter == 0);
    
     jarijari = diameter / 2;
     luas = (float) (PHI * (jarijari * jarijari));
     keliling = (PHI * diameter );
      
     DecimalFormat DF = new DecimalFormat("#.##");
         System.out.printf("jari-jari lingkaran \t = %s%n", 
                 DF.format(jarijari));
         System.out.printf("keliling lingkaran \t %s%n", DF.format(keliling));
    
    }
    
}

