import java.util.Scanner;
public class Karyawan {
    String nama;
    String posisi;
    String statusKaryawan;
    String nomorRekening;

    public void inputDataKaryawan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("Posisi: ");
        posisi = sc.nextLine();
        System.out.print("Status Karyawan: " );
        statusKaryawan = sc.nextLine();
        System.out.print("Nomor Rekening: ");
        nomorRekening = sc.nextLine();
    }

    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: "  + posisi);
        System.out.println("Status Karyawan: " + statusKaryawan);
        System.out.println("Nomor Rekening: " + nomorRekening);
    }
}