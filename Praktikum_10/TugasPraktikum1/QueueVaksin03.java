package TugasPraktikum1;

public class QueueVaksin03 {
    NodeVaksin03 front, rear;
    int size;

    QueueVaksin03(){
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int nomor, String nama) {
        NodeVaksin03 newNode = new NodeVaksin03(nomor, nama);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            String nama = front.nama;
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                front.prev = null;
            }
            size--;
            return nama;
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin: ");
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("|No.    |Nama   |");
            NodeVaksin03 current = front;
            while (current != null) {
                System.out.printf("|%-8d|%-8s|\n", current.nomor,  current.nama);
                current = current.next;
            }
        }
    }
}
