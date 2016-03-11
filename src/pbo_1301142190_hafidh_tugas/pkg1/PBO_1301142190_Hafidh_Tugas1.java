/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_1301142190_hafidh_tugas.pkg1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Hafidh Fikri Rasyid
 */
public class PBO_1301142190_Hafidh_Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        Library TelU = new Library();
        
        Map<String,Book> map = new HashMap<String, Book>();
        
        int banyak_input,opsi,binp;
        String inputan;
        boolean jalan = true;
        int h=0;
        
        do{
            System.out.println("Uklalam");
            System.out.println("Selamat datang di aplikasi perpustakaan");
            System.out.println("Silahkan pilih menu :");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembali Buku");
            System.out.println("4. Cek Ketersediaan Buku");
            System.out.println("5. Keluar");
            System.out.print("Masukkan menu : ");
            opsi = scan.nextInt();

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan judul buku : ");
                    inputan = scan.next();
                    System.out.print("Masukkan banyak buku : ");
                    banyak_input = scan.nextInt();
                    map.put(inputan, new Book());
                    //set variabel
                    map.get(inputan).judul = inputan;
                    map.get(inputan).jumlah = banyak_input;
                    TelU.ada = TelU.ada + banyak_input;
                    TelU.jml_judul++;
                    break;
                case 2:
                    //jumlah buku yang dipinjam cuman 1
                    System.out.print("Masukkan banyak judul buku yang ingin dipinjam : ");
                    binp = scan.nextInt();
                    for(int i = 0;i<binp;i++){
                        System.out.print("Masukkan judul buku : ");
                        inputan = scan.next();
                        
                        if(map.get(inputan) != null){
                            if(map.get(inputan).jumlah > 0){
                                TelU.pinjam(map.get(inputan));
                                System.out.println("Buku "+map.get(inputan).judul+" berhasil dipinjam");
                            }else{
                                System.out.println("Buku sedang dipinjam");
                            }
                        }else{
                            System.out.println("Buku tidak ditemukan");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan banyak judul buku yang ingin dikembalikan : ");
                    binp = scan.nextInt();
                    
                    for(int i = 0;i<binp;i++){
                        System.out.print("Masukkan judul buku : ");
                        inputan = scan.next();
                        
                        if(map.get(inputan) != null){
                            if(map.get(inputan).bnyk_pinjam > 0){
                                TelU.kembali(map.get(inputan));
                                System.out.println("Buku "+map.get(inputan).judul+" berhasil dikembalikan");
                            }else{
                                System.out.println("Buku sedang tersedia");
                            }
                        }else{
                            System.out.println("Buku tidak ditemukan");
                        }
                    }
                    break;
                case 4:
                    TelU.cek();
                    do{
                        TelU.cekBuku(map.get(map.keySet().toArray()[h]));
                        h++;
                    }while(TelU.jml_judul >h);
                    h=0;
                    break;
                case 5:
                    jalan = false;
                    System.out.println("Selesai");
                    break;
                default:
                    System.out.println("Inputan salah");
                    break;
            }
        }while(jalan);
    }
}
