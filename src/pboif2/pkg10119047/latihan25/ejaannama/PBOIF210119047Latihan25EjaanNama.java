/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan25.ejaannama;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI DAPAT MENGEJA NAMA
 */


public class PBOIF210119047Latihan25EjaanNama {
    
    public static void pengejaan(String nama){
        System.out.println("Ejaan untuk " + nama + "adalah :");
        String ejaan[] = nama.split("|");
        for(int i=0; i<ejaan.length;i++){
            System.out.println("Huruf ke-" + (i+1) + ":" + ejaan[i]);
        }
        
    }
    /**
     * @param args the command line arguments
     */
   
    //utama
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk dieja : ");
        nama = input.next();
        
        System.out.println("");
        pengejaan(nama);
        
        
    }
    
}
