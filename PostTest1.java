/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.post.test1;

/**
 *
 * @author Asus Vivobook
 */
import java.util.ArrayList;

public class PostTest1 {
    public static void main(String[] args) {
        ArrayList<PemainBola> pemainBola = new ArrayList<>();

        // Isi ArrayList dengan objek-objek "PemainBola"
        
        pemainBola.add(new PemainBola("Lionel Messi", "Penyerang", 10, "Barcelona"));
        pemainBola.add(new PemainBola("Erling Haaland", "Penyerang", 9, "Manchester City"));
        pemainBola.add(new PemainBola("Neymar Jr.", "Penyerang", 11, "Paris Saint-Germain"));
        pemainBola.add(new PemainBola("Paulo Dybala", "Penyerang", 21, "Juventus"));
        pemainBola.add(new PemainBola("Pablo Gavi", "Gelandang", 9, "Barcelona"));
        
        System.out.println("==========================================\n");
        System.out.println("Biodata Singkat Pemain Bola Favorit Shafa:\n");
        System.out.println("==========================================\n");
        
        // Loop untuk menampilkan informasi pemain bola
        for (PemainBola pemain : pemainBola) {
            System.out.println(pemain);
        }
    }
}


