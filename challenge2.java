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
public class challenge2 {
    public static void main (String [] args){
        int min=0;
        int [] data = new int [] {-21,90,82,190,-83,74};
        System.out.print("Data pada array : ");
        for (int i = 0; i < data.length ; i++){
            System.out.print(data [i] + "\t");
            if (data[i] > min){
                min = data[i];
            }
        }
        System.out.println("\n data terbesar dari array adalah : " + min);
    } 
    
}
