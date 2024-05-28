package Minggu7;
import java.util.Scanner;
public class MahasiswaMain03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Scanner s1 = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumMhs = s.nextInt();
        PencarianMahasiswa03 data = new PencarianMahasiswa03();
        //int jumMhs = 5;

        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkecil");
        Mahasiswa03[] listMhs = new Mahasiswa03[jumMhs];
        for(int i = 0; i < jumMhs; i++){
            System.out.println("----------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            s.nextLine();
            System.out.print("Nama\t: ");
            String nama = s.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa03 m = new Mahasiswa03(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();
        System.out.println("----------------------------------------------------");

        System.out.println("----------------------------------------------------");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Nim Mahasiswa yang diberi: ");
        System.out.print("NIM: ");
        int cari = s.nextInt();
        System.out.println("Menggunkan sequential Search");
        int posisi = data.FindSeqSearch(cari);

        
        //Panggil method FindBinarySearch 
        System.out.println("----------------------------------------------------");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.Tampildata(cari, posisi);

        System.out.println("----------------------------------------------------");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama: ");
        s.nextLine(); 
        String cariNama = s.nextLine();

        System.out.println("----------------------------------------------------");
        System.out.println("Menggunakan Binary Search untuk nama");
        int posisiNama = data.FindBinarySearchNama(cariNama, 0, jumMhs - 1);//Memanggil method dari objek data untuk mencari posisi nama yang dicari

        if (posisiNama != -1) {//Memeriksa posisi nama yang ditemukan tidak sama dengan -1
            System.out.println("Data ditemukan pada indeks " + posisiNama);
            System.out.println("Nama: " + listMhs[posisiNama].nama);
        } else {
            System.out.println("Data mahasiswa dengan nama " + cariNama + " tidak ditemukan!");
        }
    }
}


