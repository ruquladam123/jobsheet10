/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbleshort;

import java.util.Arrays;

/**
 *
 * @author In your dream
 */
public class latihan1 {
    public static void main (String [] args) {
        
    
    int [] bilangan = {12,4,1,9,15};
    System.out.print("bilangan sebelum di sorting bubble sort : " + Arrays.toString(bilangan));
    System.out.println("\nProses Bubble Sort secara Ascending");
    for (int i = 0 ; i < bilangan.length ; i++){
        System.out.println("Iterasi" + +(i + 1));
        for (int j = 0 ; j < bilangan.length-1 ; j++){
            if (bilangan[j] > bilangan[j+1]){
                int temp = bilangan[j];
                bilangan[j] = bilangan[j+1];
                bilangan [j+1] =  temp;
                
                
            }
        System.out.println(Arrays.toString (bilangan));
    }
        System.out.println();
    }
    System.out.println("Hasil akhir setelah di sorting :" + Arrays.toString (bilangan));
    
    
    
    
    
}
}
