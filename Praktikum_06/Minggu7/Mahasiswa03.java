package Minggu7;

public class Mahasiswa03 {

    //Deklarasi atribut
    int nim;
    String nama;
    int umur;
    double ipk;

    // konstruktor dengan nama Mahasiswa dengan parameter dibawah
    Mahasiswa03 (int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    //method tampil bertipe void
    void tampil(){
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
    

}
