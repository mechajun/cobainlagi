/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_1301142190_hafidh_tugas.pkg1;

import java.util.Map;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class Library {
    /*
        cek berapa buku yang dipinjam 
    */
    int pinjam;
    int ada;
    int jml_judul;
    
    void pinjam(Book b){
        //set ketersediaan buku
            b.borrowed();
            ada--;
            pinjam++;
    }
    
    void kembali(Book b){
        //set ketersediaan buku
            b.returned();
            ada++;
            pinjam--;
    }
    
    void cek(){
        int i = 0;
        
        System.out.println("Jumlah buku yang dipinjam "+pinjam+" buah");
        System.out.println("Jumlah buku yang tersedia di perpustakaan "+ada+" buah");
    }
    
    void cekBuku(Book b){
        System.out.println("Judul : "+b.judul);
        System.out.println("Jumlah tersedia: "+b.jumlah);
        System.out.println("Jumlah dipinjam: "+b.bnyk_pinjam);
        System.out.println("");
    }
}
