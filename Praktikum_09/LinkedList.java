public class LinkedList {
    Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Linked list: ");
            Node currentNode = head;
        
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst (int input) {
        Node newNode = new Node(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }    

    public void addLast (int input) {
        Node newNode = new Node(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter (int key, int input) {
        Node newNode = new Node(input, null);

        if (!isEmpty()) {
            Node currentNode = head;

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }  
    
    public void insertBefore(int key, int input) {
        Node newNode = new Node(input, null);
        
        if (isEmpty()) {
            System.out.print("Linked list kosong");
            return;
        }
        
        if (head.data == key) {
            addFirst(input);
            return;
        }
        
        Node currentNode = head;
        while (currentNode.next != null && currentNode.next.data != key) {
            currentNode = currentNode.next;
        }
        
        if (currentNode.next == null) {
            System.out.print("Key tidak ditemukan");
        } else {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void insertAt(int index, int key) {
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(key);
            return;
        }

        Node newNode = new Node(key, null);
        Node currentNode = head = head;//Inisialisasi varibel 
        int count = 0;

        while (currentNode != null && count < index - 1) {//Loop ini menavigasi melalui linked list hingga mencapai node sebelum posisi index  
            currentNode = currentNode.next;
            count++;
        }

        if (currentNode == null) {
            System.out.println("Index lebih besar dari jumlah elemen di dalam linked list ");
        } else {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public int getData(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
    
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
    
        return currentNode.data;
    }
    
    public int size() {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public int indexOf(int key) {
        Node currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node currentNode = head;
        
            while (currentNode != null ) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                
                currentNode = currentNode.next;
            }
        }
    }

    public void removeAt(int index) {
        if(index < 0) {
            System.out.println("Linked list kosong");
            return;
        }
        
        if(index == 0) {
            removeFirst();
            return;
        }
        
        Node currentNode = head;
        int count = 0;
        
        while (currentNode != null && count < index - 1) {
            currentNode = currentNode.next;
            count++;
        }
        
        if(currentNode == null || currentNode.next == null) {
            System.out.println("Index lebih besar dari jumlah elemen di dalam linked list");
        } else {
            currentNode.next = currentNode.next.next;
        }
    }  
}



