import java.lang.Character.Subset;

public class Buku03 {
    
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stock: " + stok);
        System.out.println("Harga: " + harga);
    }
    //Modifikasi method sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada 
    void terjual(int jml){
        stok -= jml;
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    int hitungHargaTotal (int jumlah){
        return harga * jumlah;
    }

    int hitungDiskon(int hargaTotal){
        int diskon = 0;
        if (hargaTotal > 150000){
            diskon = (int)(0.12 * hargaTotal);
        }else if (hargaTotal >= 75000 && hargaTotal <= 150000){
            diskon = (int)(0.05 * hargaTotal);
        }
        return diskon;
    }

    int hitungHargaBayar (int jumlah){
        int total = hitungHargaTotal(jumlah);
        int diskon = hitungDiskon(total);
        return total - diskon;
    }

    public static void main(String[] args) {
        //Buat objek baru dari class Buku03
        Buku03 buku1 = new Buku03();
        //Set nilai objek
        buku1.judul = "Mempelajari Dasar Pemrograman";
        buku1.pengarang = "Eko Hariyanto, Indri Sulistianingsih";
        buku1.halaman = 203;
        buku1.stok = 10;
        buku1.harga = 45000;
      
        buku1.tampilInformasi();
        buku1.terjual(4);
        buku1.gantiHarga(45000);
        int jumlah = 4;
        int totalHarga = buku1.hitungHargaTotal(4);
        int diskon = buku1.hitungDiskon(180000);
        int hargaBayar = buku1.hitungHargaBayar(4);
        buku1.tampilInformasi();

        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga Bayar: " + hargaBayar);

        
    }
}
