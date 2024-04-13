import java.util.Scanner;
public class Tugas03 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Karyawan[] arrayOfKaryawan = new Karyawan[3];
    Absensi[] arrayOfAbsensi = new Absensi[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Masukkan data karyawan ke-" + (i + 1));
            Karyawan karyawan = new Karyawan();
            karyawan.inputDataKaryawan();
            arrayOfKaryawan[i] = karyawan;
        }

        for (int i = 0; i < 3; i++){
            System.out.println("Masukkan absensi karyawan ke-" + (i + 1));
            Absensi absensi = new Absensi();
            absensi.absensiMasuk(arrayOfKaryawan[i]);
            absensi.absensiPulang(arrayOfKaryawan[i]);
            arrayOfAbsensi[i] = absensi;
        } 

        System.out.println("Data Karyawan dan Absensi:");
        for(int i = 0; i < 3; i++){
            System.out.println("Karyawan ke-" + (i + 1));
            arrayOfKaryawan[i].cetakInfo();
            System.out.println("Absensi:");
            arrayOfAbsensi[i].cetakInfo();
        }
   }
}
  

