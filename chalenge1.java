/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

import java.util.Scanner;

/**
 *
 * @author In your dream
 */
public class chalenge1 {
        public static void main(String [] args){
                    String cari;
        boolean found = false;
        String [] data = new String [] {"Blitar","Malang","Nganjuk","Kediri","Tulungagung"};
        System.out.println("Data nama Kota :");
        for (int i = 0 ; i <data.length ; i++){
              System.out.println( data[i] + "\t");
        }
        Scanner iyd = new Scanner(System.in);
        System.out.print("Masukan kota pencarian anda : ");
                cari = iyd.nextLine();
        
        for (int i = 0; i < data.length ; i++ ){
            if (cari.equals(data [i]) ){
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
