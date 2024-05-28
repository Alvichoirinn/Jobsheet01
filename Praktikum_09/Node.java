public class Node {
    //tempat penyimpanan data yang terdiri dari dua bagian/field
    int data;//data untuk menyimpan nilai
    Node next;//pointer ke node selanjutnya

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}