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
import java.util.Scanner;
public class DataSiswa {
    public static void main (String [] args){
  //deklarasi variabel
    String nama, alamat;
    int usia, absen;
    //membuat scanner baru
    Scanner keyboard = new Scanner(System.in);
    //tampilkan output ke user
    System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
    System.out.print("Nama siswa : ");
    //menggunakan scanneer dan menyimpan apa yang sudah diketik di variabel nama
    nama = keyboard.next ();
    //tampilkan output lagi
    System.out.print("Alamat : ");
    //menggunakan scanner lagi
    alamat = keyboard.next ();
    System.out.print("Absen : ");
    usia = keyboard.nextInt ();
    System.out.print("USia : ");
    absen = keyboard.nextInt();
    //menampilkan apa yang sudah simpan di variabel
    System.out.println("--------------------");
    System.out.println("Nama siswa : " + nama);
    System.out.println("Alamat : " + alamat);
    System.out.println("Absen : " + usia);
    System.out.println("Usia : " + absen + "tahun" );
    }
    
}
