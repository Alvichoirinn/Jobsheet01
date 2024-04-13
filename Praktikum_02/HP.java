public class HP {

    String merk;
    String tipe;
    float ukuranLayar;
    int harga;

    public HP(String mr, String tp, float ukuran) {
        merk = mr;
        tipe = tp;
        ukuranLayar = ukuran;
    }

    void cekKondisi(boolean c) {
        if (c) {
            System.out.println("HP ini second");
        } else {
            System.out.println("HP ini masih baru");
        }
    }

    void tampilInformasi() {
        System.out.printf("HP merk %s tipe %s dengan ukuran layar %.1f\n", merk, tipe, ukuranLayar);
    }

    void mengirimPesan(String pesan, String paketData, String penerima) {
        if (paketData.equalsIgnoreCase("ada")) {
            System.out.printf("Pesan \"%s\" berhasil dikirim ke %s\n", pesan, penerima);
        } else {
            System.out.println("Pengiriman pesan gagal");
        }
    }

    public static void main(String[] args) {
        HP hp = new HP("Samsung", "Galaxy S20", 6.2f);
        hp.tampilInformasi();
        hp.cekKondisi(false);
    }
}
