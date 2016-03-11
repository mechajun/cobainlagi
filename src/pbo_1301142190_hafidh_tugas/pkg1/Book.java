/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_1301142190_hafidh_tugas.pkg1;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class Book {
    String judul;
    int jumlah,bnyk_pinjam;
    
    void borrowed(){
        this.bnyk_pinjam = this.bnyk_pinjam + 1;
        this.jumlah = this.jumlah - 1;
    }
    
    void returned(){
        this.bnyk_pinjam = this.bnyk_pinjam - 1;
        this.jumlah = this.jumlah + 1;
    }
}
