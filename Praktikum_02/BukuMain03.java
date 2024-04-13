public class BukuMain03 {

    String judul, pengarang;
    int halaman, stok, harga;

    //Konstruktor 
    public BukuMain03(String judul, String pengarang, int halaman, int stok, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stock: " + stok);
        System.out.println("Harga: " + harga);
    }
    //Modifikasi method sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada 
    void terjual(int jml){
        if (stok > 0){
        stok -= jml;
        }else {
            System.out.println("Stok buku tidak mencukupi!");
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
    public static void main(String[] args) {

    //Instansisasi 
    BukuMain03 buku1 = new BukuMain03("Today End Tomorrow Comes", "Denanda Pratiwi", 198,13,71000);

    //buku1.judul = "Today End Tomorrow Comes";
    //buku1.pengarang = "Denanda Pratiwi";
    //buku1.halaman = 198;
    //buku1.stok =13;
    //buku1.harga = 71000;

    buku1.tampilInformasi();
    buku1.terjual(5);
    buku1.gantiHarga (60000);
    buku1.tampilInformasi();

    BukuMain03 buku2 = new BukuMain03("Self Reward", "Maheera Ayesha", 160, 29, 59000);
    buku2.terjual(11);
    buku2.tampilInformasi();

    BukuMain03 bukuAlvi = new BukuMain03("Dasar Pemrograman", "Eko Hariyanto", 203, 10, 45000 );
    bukuAlvi.terjual(4);
    bukuAlvi.tampilInformasi();
   } 
}
