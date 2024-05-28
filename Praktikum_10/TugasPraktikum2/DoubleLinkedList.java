package TugasPraktikum2;

public class DoubleLinkedList {
    private class Node {
        Film03 data;
        Node prev, next;
        
        public Node(Film03 data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head, tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(Film03 data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Film03 data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addIndex(Film03 data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        } else if(current != null) {
            addLast(data);
        }
    }

    public void removeFirst() {
        if (head != null) {
            if (head.next == null) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void removeLast() {
        if (tail != null) {
            if (tail.prev == null) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void removeAtIndex(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        if (current != null && current.prev != null) {
            if (current.next != null) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            } else {
                current.prev.next = null;
                tail = current.prev;
            }
        }
    }

    public Film03 searchById(int id) {
        Node current = head;
        while (current != null) {
            if (current.data.getId() == id) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void sortDescendingByRating() {
        if (head == null) {
            return;
        }
        boolean swapped;
        do {
            Node current = head;
            swapped = false;
            while (current.next != null) {
                if (current.data.getRating() < current.next.data.getRating()) {
                    Film03 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printList() {
        Node current = head;
        int index = 0;
        while (current != null) {
            System.out.println("ID: " + current.data.getId() + ", Judul: " + current.data.getJudul() + ", Rating: " + current.data.getRating());
            current = current.next;
            index++;
        }
    }
}
