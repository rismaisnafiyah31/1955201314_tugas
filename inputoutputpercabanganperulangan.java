/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsederhana;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class inputoutputpercabanganperulangan {
    public static void main(String[] args) {
        // bagian input output
        System.out.println("input tombol angka pada blender agar bisa mengetahui keadaan :");
        Scanner inputUser = new Scanner(System.in);
        int tombol = Integer.parseInt(inputUser.nextLine());
        
        
        
        // bagian perulangan 
        for (int i = 0; 1<=5; i++){
            System.out.println("perulangan ke-");
            
          
            // bagian percabangan
            switch (tombol) {
                case 0:
                    System.out.println("tombol" + tombol);
                    System.out.println(" = blender akan mati/off");
                    break;
                case 1:
                    System.out.println("tombol" + tombol);
                    System.out.println("= blender akan bergerak lambat");
                    break;
                case 2:
                    System.out.println("tombol" + tombol);
                    System.out.println("= blender akan bergerak sedang");
                    break;
                case 3:
                    System.out.println("tombol" + tombol);
                    System.out.println("=blender akan bergerak cepat");
                    break;
                default:
                    System.out.println("tombol" + tombol);
                    System.out.println("=maaf!tombol blender mati");
                    break;
            }
            
        }
        
    }
    
}
