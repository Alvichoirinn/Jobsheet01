import java.util.Scanner;
public class Absensi{
    String nama;
    String posisi;
    int tanggal;
    boolean statusAbsen;

    public void absensiMasuk(Karyawan karyawan){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tanggal absen masuk karyawan " + karyawan.nama + ": ");
        tanggal = sc.nextInt();
        statusAbsen = true;
    }

    public void absensiPulang(Karyawan karyawan){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tanggal absen pulang karyawan " + karyawan.nama + ": ");
        tanggal = sc.nextInt();
        statusAbsen = true;
    }

    public void cetakInfo(){
        System.out.println("Tanggal: + tanggal");
        System.out.println("Status Absen: " + (statusAbsen ? "Hadir" : "Tidak Hadir"));
    }
}