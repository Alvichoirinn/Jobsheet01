package TugasPraktikum1;
import java.util.Scanner;

public class QueueVaksinMain03 {
    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        Scanner alvi = new Scanner(System.in);
        QueueVaksin03 queue = new QueueVaksin03();
        int pilih = 0; // Inisialisasi variabel pilih dengan nilai awal

            do {
                menu();
                System.out.print("Pilih menu: ");
                if (alvi.hasNextInt()) {
                pilih = alvi.nextInt();
                alvi.nextLine();
                switch (pilih) {
                    case 1:
                        System.out.println("-----------------------------");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("-----------------------------");
                        System.out.print("Nomor Antrian: ");
                        int nomor = alvi.nextInt();
                        alvi.nextLine();
                        System.out.print("Nama Penerima: ");
                        String nama = alvi.nextLine();
                        queue.enqueue(nomor, nama);
                        System.out.println("Data Penerima Vaksin berhasil ditambahakan");
                        break;
                    case 2:
                        String removedNama = queue.dequeue();
                        if (removedNama != null) {
                            System.out.println("Data " + removedNama + " telah selesai divaksinasi");
                        } else {
                            System.out.println("Antrian masih kosong");
                        }
                        break;
                    case 3:
                        queue.print();
                        System.out.println("Sisa Antrian: " + queue.size());
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan program ini");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, silahkan coba lagi");
                }
                } else {
                    System.out.println("Input tidak valid, silahkan masukkan angka");
                    alvi.nextLine();
                } 
            } while (pilih != 4);
        }
    }

