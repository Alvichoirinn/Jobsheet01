public class Fungsi04 {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] harga = {75000, 50000, 60000, 10000};
        int[] penguranganStock = {-1, -2, 0, -5};

    
        System.out.println("1. Pendapatan Setiap Cabang Jika Semua Bunga Terjual");
        System.out.println("==============================");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("Pendapatan Cabang " + (i + 1) + ": " + totalPendapatan);
        }

        System.out.println("2. Jumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden");
        System.out.println("==============================");
        for (int j = 0; j < stock[0].length; j++) {
            int totalStock = 0;
            for (int i = 0; i < stock.length; i++) {
                totalStock += stock[i][j];
            }
            System.out.println("Stock " + (j + 1) + ": " + totalStock);
        }

        System.out.println("3. Jumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden setelah Pengurangan Stock");
        System.out.println("==============================");
        for (int j = 0; j < stock[0].length; j++) {
            int totalStock = 0;
            for (int i = 0; i < stock.length; i++) {
                totalStock += stock[i][j];
            }
            System.out.println("Stock " + (j + 1) + ": " + totalStock);
        }
    }
}