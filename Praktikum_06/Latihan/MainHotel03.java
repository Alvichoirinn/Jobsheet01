package Latihan;

import java.util.Scanner;
public class MainHotel03 {
    public static void main(String[] args) {
        HotelService03 list = new HotelService03();

        //Menambah 5 objek Mahasiswa
        Hotel03 m1 = new Hotel03("Nusa", "Malang", 130000, (byte)2);
        Hotel03 m2 = new Hotel03("Rara", "Bandung", 140000, (byte)3);
        Hotel03 m3 = new Hotel03("Dompu", "Bandung", 120000, (byte) 1);
        Hotel03 m4 = new Hotel03("Abdul", "Malang", 150000, (byte)5);
        Hotel03 m5 = new Hotel03("Ummi", "Surabaya", 145000, (byte)4);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data hotel sebelum sorting = ");
        list.tampil();

        System.out.println("Data hotel sesudah sorting desc berdasarkan harga = ");
        list.bubbleSortHarga();
        list.tampil();

        System.out.println("Data hotel setelah sorting asc berdasarkan harga = ");
        list.selectionSortHarga();
        list.tampil();

        System.out.println("Data hotel sesudah sorting desc berdasarkan bintang = ");
        list.bubbleSortBintang();
        list.tampil();

        System.out.println("Data hotel setelah sorting asc berdasarkan bintang = ");
        list.selectionSortBintang();
        list.tampil();
    }
}
