import java.util.Scanner;
public class Mahasiswa03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();

            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = sc.next().charAt(0);
            sc.nextLine();//Menghilangkan karakter newLine

            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();//Menghilangkan karakter newLine

            arrayOfMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        System.out.println("Data Mahasiswa: ");
        double totalIpk = 0;
        for (int i = 0; i < 3; i++){
            System.out.println("Data Mahassiswa ke-" + (i + i));
            arrayOfMahasiswa[i].cetakInfo();
            totalIpk += arrayOfMahasiswa[i].ipk;
        }

        double rataRataIpk = totalIpk / 3;
        System.out.println("Rata-rata IPK: " + String.format("%.2f", rataRataIpk));
    }
}

class Mahasiswa{
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;

    public Mahasiswa (String nama, String nim, char jenisKelamin, double ipk){
        this.nama = nama;//Merujuk pada atribut yang ada pada class mahasiswa
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public void cetakInfo(){//Method yang digunakan untuk mencetak info dari mahasiswa
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nilai IPK: " + ipk);
    }   
}

