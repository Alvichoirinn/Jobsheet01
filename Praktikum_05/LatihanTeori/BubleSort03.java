package LatihanTeori;

public class BubleSort03 {
    public static void main(String[] args) {
        //Deklarasi
        int [] data = {6, 5, 3, 1, 8, 7, 2, 4};
        int n = data.length;
        bubbleSort (data, n);
    
        //Print Sorted Array
        for(int i = 0; i < n; i++){
            System.out.print(data[i]+ " ");
        }
    }

    public static void bubbleSort(int[] arr, int size){
        for (int i = 0; i < size - 1; i++){
            for (int j =0; j < size - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                //Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            }
        }
    }

}
