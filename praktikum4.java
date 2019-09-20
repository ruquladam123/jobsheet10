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
public class praktikum4 {
    public static void main (String [] args){
          Scanner galon = new Scanner(System.in);
        String cari ;
        System.out.print ("Masukan Kalimat atau huruf : ");
        cari = galon.nextLine();
        
        int a = 0;
        for (int j = 0 ; j < cari.length() ; j ++){
            if (cari.charAt (j) == 'a'){
                                a++;
                
                            }
        }


            int i=0;
            for (int k = 0 ; k < cari.length() ; k++){
                if (cari.charAt(k) == 'i'){
                    i++;
                }
                    
                }
            int u = 0;
            for (int l = 0 ; l < cari.length() ; l++ ){
                if (cari.charAt (l) == 'u'){
                    u++;
                    
            }
            }
            int e = 0;
            for (int k = 0 ; k < cari.length() ; k ++){
                if (cari.charAt (k) == 'e'){
                    e++;
                
            }
            }
            int o = 0;
            for (int m= 0 ; m < cari.length() ; m++){
                if(cari.charAt (m) == 'o'){
                    o++;
                    
                }
                
            }
                
        
        
                
                    
     

        
                                        System.out.println("Jumlah huruf a pada kalimat diatas adalah :" +a);
        System.out.println("Jumlah huruf i pada kalimat diatas adalah :" +i);
        System.out.println("Jumlah huruf u pada kalimat diatas adalah :" +u);
        System.out.println("Jumlah huruf e pada kalimat diatas adalah :" +e);
        System.out.println("Jumlah huruf o pada kalimat diatas adalah :" +o);
        
        for (int q = 0 ; q < cari.length() ; q++){

            

            
        }
                    int jumlahvokal = 0;
        jumlahvokal = a+i+u+e+o;
                    System.out.println("Jadi jumlah huruf vokal di kalimat diatas adalah : " + jumlahvokal);
        
    
        
    }
}

