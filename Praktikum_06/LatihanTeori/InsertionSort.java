package LatihanTeori;

public class InsertionSort {
    public static void main(String[] args) {
    int [] data = { 10, 14, 27, 35, 42, 19, 33, 29 };
        int n = data.length;
        insertionSort (data, n);

        //Print Sorted Array
        for(int i = 0; i < n; i++){
        System.out.print(data[i]+ " ");
        }
    }

    public static void insertionSort(int [] arr, int size){
        for(int i = 1; i < size; i++){
            int temp = arr[i];
            int j = i;
            //untuk mengubah menjadi descending dapat dilakukan dengan mengubah tanda lebih dari dengan kurang dari  pada perulangan loop
            while (j > 0 && arr[j - 1] > temp){
                arr[j] = arr[j - 1];
                j--;
                }
                arr[j] = temp;
            }
        }
    }




