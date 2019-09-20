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
public class latihan2 {
    public static void main(String [] args){
        System.out.println("Data angka :");
        int cari;
        boolean found = false;
        int []  data = new int [] {8,90,56,90,87,76,42};
        for (int a = 0 ; a <data.length ; a++){
            System.out.println(data [a] + "\t");
        }
        Scanner dam = new Scanner(System.in);
        System.out.print("Masukan data yang ingin dicari : ");
        cari = dam.nextInt();
        for (int i = 0 ; i < data.length ; i++){
            if (cari == data [i]) {
                found =  true;
                System.out.print("Data ditemukan pada indeks ke- " + i);
            }
        }
        if (found != true){
            System.out.print("Data anda tidak ditemukan seperti jodoh anda !");
        }
        
        
    }
    
}
