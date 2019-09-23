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
public class Chalenge {
    public static void main (String [] args){
        int [] bilangan = {20,3,6,1,4,5,9,2,10};
        System.out.print("Bilangan sebelum di sorting Bubble sort : "  + Arrays.toString(bilangan));
        System.out.println("Proses buble soet secara Descending : ");
        for (int a = 0 ; a < bilangan.length ; a++){
            System.out.print("Iterasi" + (a+1));
            for (int b = 0 ; b < bilangan.length-1 ; b++){
                if (bilangan [b] < bilangan [b+1]){
                    int temp = bilangan[b];
                    bilangan [b] = bilangan[b+1];
                    bilangan [b+1] = temp;
                }
                System.out.println(Arrays.toString (bilangan));
            }
            System.out.println();
        }
        System.out.println("Hasil akhir setelah di sorting :" + Arrays.toString(bilangan));
        
        
    }
    
}
