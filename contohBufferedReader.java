/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author ASUS
 */
public class contohBufferedReader {
    

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String nama;
        String tempat;
        String rumah;
        String agama;
        String status;
        // object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        // object BufferedReader
        BufferedReader br = new BufferedReader(isr) ;
        
        // mengisi variabel nama dengan buffereadReader
        System.out.println("Siapa nama kamu ?");
        nama = br.readLine();
        
        System.out.println("dimana tempat lahir mu ?");
        tempat = br.readLine();
        
        System.out.println("dimana rumah mu ?");
        rumah = br.readLine();
        
        System.out.println("apa agama mu ?");
        agama = br.readLine();
        
        System.out.println("apa ststus mu ?");
        status = br.readLine();
        
        // menampilkan nama
        System.out.println("namaku adalah " + nama);
        System.out.println("tempat lahirku di " + tempat);
        System.out.println("rumahku di " + rumah);
        System.out.println("agamaku adalah " + agama);
        System.out.println("statusku adalah "+ status);
        
    }



    

    

    
         
    }
    

