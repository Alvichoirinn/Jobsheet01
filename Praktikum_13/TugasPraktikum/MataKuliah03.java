package TugasPraktikum;

public class MataKuliah03 {
    String kodeMk, namaMk;
    int sks;

    public MataKuliah03(String kodeMk, String namaMK, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    public String toString() {
        return String.format("%\t%-40s%s", kodeMk, namaMk, sks);
    }
}
