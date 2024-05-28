package LatihanTeori;

public class Latihan03 {
    public static void main(String[] args) {
        int [] data = {23,35,7,14,67};
        int n = data.length;

        // Bubble Sort
        bubbleSort(data, n);
        System.out.println("Descending Bubble Sort:");
        printArray(data, n);

        // Selection Sort
        selectionSort(data, n);
        System.out.println("\nDescending Selection Sort:");
        printArray(data, n);

        // Insertion Sort
        insertionSort(data, n);
        System.out.println("\nDescending Insertion Sort:");
        printArray(data, n);
    }

        public static void bubbleSort(int[] arr, int size){
            for (int i = 0; i < size - 1; i++){
                for (int j =0; j < size - i - 1; j++){
                    if (arr[j] < arr[j + 1]){
                    //Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void selectionSort(int [] arr, int size){
            for (int i = 0; i < size - 1; i++){
                    int idxMin = i;
                    for (int j = i + 1; j < size; j++) {
                        if (arr[j] > arr[idxMin]){
                            idxMin = j;
                        }
                    } 
                    //Swap arr[i] with arr [idMin]
                    int temp = arr[i];
                    arr[i] = arr[idxMin];
                    arr[idxMin] = temp;
                    
                }
            }
        

        public static void insertionSort(int [] arr, int size){
            for(int i = 1; i < size; i++){
                int temp = arr[i];
                int j = i;
                //untuk mengubah menjadi descending dapat dilakukan dengan mengubah tanda lebih dari dengan kurang dari  pada perulangan loop
                while (j > 0 && arr[j - 1] < temp){
                    arr[j] = arr[j - 1];
                    j--;
                    }
                    arr[j] = temp;
                }
            }


        public static void printArray(int[] arr, int size){
            for(int i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

