public class BinaryTreeArray03 {
    int [] data;
    int idxLast;

    public BinaryTreeArray03() {
        data = new int [10];
    }
    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void add(int data) {
        if (idxLast + 1 < this.data.length) {
            this.data[++idxLast] = data;
        }
    }

    void traversePreOrder() {
        traversePreOrder(0);
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " ");
            }
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder() {
        traversePostOrder(0);
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " ");
            }
        }  
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if (2 * idxStart + 1 <= idxLast && data[2 * idxStart+ 1] != 0) {
                traverseInOrder(2*idxStart+1);
            }
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart]+" ");
            } 
            if (2 * idxStart + 2 <= idxLast && data[2 * idxStart + 2] != 0) {  
            traverseInOrder(2*idxStart+2);
            }
        }
    }
}