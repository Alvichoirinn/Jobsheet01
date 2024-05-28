package TugasPraktikum2;
import java.util.Scanner;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList filmList = new DoubleLinkedList();
        Scanner alvi = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("==============================");
            System.out.println("    DATA FILM LAYAR LEBAR     ");
            System.out.println("==============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih menu: ");
            pilihan = alvi.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Data File Posisi Awal ID Film: ");
                    int idAwal = alvi.nextInt();
                    alvi.nextLine();
                    System.out.print("Judul Film: ");
                    String judulAwal = alvi.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingAwal = alvi.nextDouble();
                    filmList.addFirst(new Film03(idAwal, judulAwal, ratingAwal));
                    break;
                case 2:
                    System.out.print("Masukkan Data Posisi Akhir ID Film: ");
                    int idAkhir = alvi.nextInt();
                    alvi.nextLine();
                    System.out.print("Judul Film: ");
                    String judulAkhir = alvi.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingAkhir = alvi.nextDouble();
                    filmList.addLast(new Film03(idAkhir, judulAkhir, ratingAkhir));
                    break;
                case 3:
                    System.out.print("Masukkan Data Film Urutan Ke- ID Film: ");
                    int idIndex = alvi.nextInt();
                    alvi.nextLine();
                    System.out.print("Judul Film: ");
                    String judulIndex = alvi.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingIndex = alvi.nextDouble();
                    System.out.print("Data Film ini akan masuk di urutan ke-");
                    int index = alvi.nextInt();
                    filmList.addIndex(new Film03(idIndex, judulIndex, ratingIndex), index);
                    break;
                case 4:
                    filmList.removeFirst();
                    break;
                case 5:
                    filmList.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan Index: ");
                    int hapusIndex = alvi.nextInt();
                    filmList.removeAtIndex(hapusIndex);
                    break;
                case 7:
                    System.out.println("Cetak Data: ");
                    filmList.printList();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film yang dicari: ");
                    int cariId = alvi.nextInt();
                    Film03 foundFilm = filmList.searchById(cariId);
                    if (foundFilm != null) {
                        System.out.println("Film ditemukan: ID: " + foundFilm.getId() + ", Judul: " + foundFilm.getJudul() + ", Rating: " + foundFilm.getRating());
                    } else {
                        System.out.println("Film dengan ID " + cariId + " tidak ditemukan");
                    } 
                    break;
                case 9:
                    filmList.sortDescendingByRating();
                    System.out.println("Daftar Film berhasil diurutkan berdasarkan rating sevara descending");
                    break;
                case 10:
                    System.out.println("Terima kasih telah mengguankan program ini ");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi");
                }
            } while (pilihan != 10);
        }
    } 


