package TugasPraktikum1;

public class NodeVaksin03 {
    int nomor;
    String nama;
    NodeVaksin03 prev, next;

    NodeVaksin03(int nomor, String nama) { //(Konstruktor Berparameter)
        this.nomor = nomor;//this digunakan untuk membedakan dengan nama yang sama pada konstruktor
        this.nama = nama;
        this.prev = null;
        this.next = null;
    }
}