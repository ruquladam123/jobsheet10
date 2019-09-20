/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author In your dream
 */
import java.util.Scanner;
public class latihan1 {
    public static void main (String [] args){
        int cari;
        boolean found = false;
        System.out.println("Data angka :");
        int [] data = new int [] {29,4,10,94,96};
        for (int a = 0 ; a<data.length ; a++){
            System.out.println(data [a] + "\t");
        }
        Scanner iyd = new Scanner(System.in);
        System.out.println("Masukan pencarian anda : ");
                cari = iyd.nextInt();
        
        for (int i = 0; i < data.length ; i++ ){
            if (cari == data [i] ){
                found = true;
                break;
                
            }
        }
        if (found == true){
            System.out.println("Data anda ditemukan slurr");
        }else{
            System.out.println("Maaf data anda tidak ditemukan");
        }
      
    }
    
}
