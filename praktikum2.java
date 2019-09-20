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
public class praktikum2 {
    public static void main (String  [] args){
        Scanner dam = new Scanner(System.in);
        int a = 0;

        int [] data = new int [] {83,76,45,90,85,80,78,74};
        System.out.println("Data pada array");
        for (int i = 0 ; i < data.length ; i++){
        System.out.print(data [i] + "\t");
        }
                double ratarata = 0;
                for (int i = 0 ; i < data.length ; i++) ratarata += data [i];
                ratarata/=data.length;
                System.out.println("\n jadi rata rata nilai adalah :" + ratarata);
                
                for (int k = 0 ; k < data.length ; k++){
                    if (data [k] > ratarata){
                        System.out.println("Nilai yang diatas rata rata adalah : " + data [k] + "\t");
                    }
                } 
            
        }

        }
        
    
    

