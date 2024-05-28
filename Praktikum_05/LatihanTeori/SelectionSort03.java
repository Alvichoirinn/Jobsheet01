package LatihanTeori;
public class SelectionSort03 {
    public static void main(String[] args) {
        int [] data = {23, 35, 7, 14, 67} ;
        int n = data.length;
        selectionSort (data, n);

        //Print Sorted Array
        for (int i = 0; i < n; i++){
            System.out.print(data[i] + " ");
        }
    }

    public static void selectionSort(int [] arr, int size){
        for (int i = 0; i < size - 1; i++){
                int idxMin = i;
                for (int j = i + 1; j < size; j++) {
                    if (arr[j] < arr[idxMin]){
                        idxMin = j;
                    }
                } 
                //Swap arr[i] with arr [idMin]
                int temp = arr[i];
                arr[i] = arr[idxMin];
                arr[idxMin] = temp;
                
            }
        }
    }
