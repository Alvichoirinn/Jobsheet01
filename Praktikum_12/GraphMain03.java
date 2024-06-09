import java.util.Scanner;
public class GraphMain03 {
    public static void main(String[] args)throws Exception {
        Scanner alvi = new Scanner(System.in);

        System.out.print("Masukkan jumlah vertex : ");
        int jmlVertex = alvi.nextInt();
        GraphMatriks03 graph = new GraphMatriks03(jmlVertex);

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
                    graph.makeEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal yang ingin dihapus : ");
                    int asalHapus = alvi.nextInt();
                    System.out.print("Masukkan gedung tujuan yang ingin dihapus : ");
                    int tujuanHapus = alvi.nextInt();
                    graph.removeEdge(asalHapus, tujuanHapus);
                    break;
                case 3:
                    System.out.print("Masukkan gedung yang ingin dicek degree-nya : ");
                    int gedungDegree = alvi.nextInt();
                    int degree = graph.inDegree(gedungDegree);
                    System.out.println("Degree dari gedung " + (char) ('A' + gedungDegree) + " adalah " + degree);
                    break;
                case 4:
                    graph.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal : ");
                    int asalCek = alvi.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    int tujuanCek = alvi.nextInt();
                    if (graph.matriks[asalCek][tujuanCek] != 0) {
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
                    graph.updateJarak(asalUpdate, tujuanUpdate, jarakBaru);
                    break;
                case 7:
                    int edgeCount = graph.hitungEdge();
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
