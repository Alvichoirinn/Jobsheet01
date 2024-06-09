import java.util.Scanner;
public class GraphMain03 {
    public static void main(String[] args)throws Exception {
        Scanner alvi = new Scanner(System.in);

        Graph03 gedung = new Graph03(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        int choice;
        do {
            System.out.println("Menu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge Pengguna");
            System.out.println("6. Update jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            choice = alvi.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan gedung asal : ");
                    int asal = alvi.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    int tujuan = alvi.nextInt();
                    System.out.print("Masukkan jarak : ");
                    int jarak = alvi.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal yang ingin dihapus : ");
                    int asalHapus = alvi.nextInt();
                    System.out.print("Masukkan gedung tujuan yang ingin dihapus : ");
                    int tujuanHapus = alvi.nextInt();
                    gedung.removeEdge(asalHapus, tujuanHapus);
                    break;
                case 3:
                    System.out.print("Masukkan gedung yang ingin dicek degree-nya : ");
                    int gedungDegree = alvi.nextInt();
                    gedung.degree(gedungDegree);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal : ");
                    int asalCek = alvi.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    int tujuanCek = alvi.nextInt();
                    if (gedung.isAdjecent(asalCek, tujuanCek)) {
                        System.out.println("Gedung " + (char) ('A' + asalCek) + " dan Gedung " + (char) ('A' + tujuanCek) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asalCek) + " dan Gedung " + (char) ('A' + tujuanCek) + " tidak bertetangga");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal : ");
                    int asalUpdate = alvi.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    int tujuanUpdate = alvi.nextInt();
                    System.out.print("Masukkan jarak baru : ");
                    int jarakBaru = alvi.nextInt();
                    gedung.updateJarak(asalUpdate, tujuanUpdate, jarakBaru);
                    break;
                case 7:
                    int edgeCount = gedung.hitungEdge();
                    System.out.println("Jumlah edge dalam graf adalah: " + edgeCount);
                    break;
                case 8:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (choice != 8);

        alvi.close();
    }
}
