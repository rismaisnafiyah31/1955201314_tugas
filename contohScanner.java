/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class contohScanner {
    public static void main(String[] args) {
        int nomor = 0;
        int kodepos = 0;
        int anak = 0;
        int beratbadan = 0;
        int tinggi = 0;
        
        // membuat scanner
        System.out.println("berapa nomor kamu ?");
        Scanner inputUser = new Scanner(System.in);
        nomor = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa kodepos kamu ?");
        inputUser = new Scanner(System.in);
        kodepos = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("anak keberapa kamu ?");
        inputUser = new Scanner(System.in);
        anak = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa beratbadan kamu ?");
        inputUser = new Scanner(System.in);
        beratbadan = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa tinggi kamu ?");
        inputUser = new Scanner(System.in);
        tinggi = Integer.parseInt(inputUser.nextLine());
        //output
        System.out.println("nomor yang aku adalah" + nomor);
        System.out.println("kodepos anda adalah" + kodepos);
        System.out.println("saya anak ke" + anak);
        System.out.println("beratbadan ku adalah" + beratbadan);
        System.out.println("tinggi ku adalah" + tinggi);
        
        
                
        
        
        
        
        
        
        
        
    }
    
}
