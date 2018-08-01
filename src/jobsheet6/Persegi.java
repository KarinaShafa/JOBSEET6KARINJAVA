/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

/**
 *
 * @author ASUS
 */
import java.io.*;
public class Persegi {
    public static void main (String [] args) throws IOException{
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String x = "";
        System.out.println("---Luas Persegi----");
        System.out.print("Masukkan nilai sisi :");
        
        try {
            x = data.readLine();
            int angka = Integer.parseInt(x);
            int hitungLuas = angka * angka;
        } catch (IOException | NumberFormatException e){
            System.out.println("Error");
        }
        String hitungLuas = null;
        System.out.println("Luas persegi dengan sisi" + x + "adalah" + hitungLuas);
    }
    
    
}
