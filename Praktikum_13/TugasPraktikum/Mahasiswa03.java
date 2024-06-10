package TugasPraktikum;

public class Mahasiswa03 {
    String nim;
    String nama;
    String noTelp;

    public Mahasiswa03() {
    }

    public Mahasiswa03(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = notelp;
    }

    public String toString() {
        return String.format("%s\t%-15s", nim, nama, noTelp);
    }
}
