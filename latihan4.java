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
public class latihan4 {
    public static void main (String [] args){
        Scanner galon = new Scanner(System.in);
        String cari ;
        System.out.print ("Masukan Kalimat atau huruf : ");
        cari = galon.nextLine();
        
        int a = 0;
        for (int i = 0 ; i < cari.length() ; i ++){
            if (cari.charAt (i) == 'a'){
                                a++;
                
            }

        }
        System.out.println("Jumlah huruf a pada kalimat diatas adalah :" +a);
    }
    
}
