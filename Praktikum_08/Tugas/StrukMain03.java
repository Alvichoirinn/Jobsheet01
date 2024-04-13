package Tugas;

/**
 * StrukMain03
 */
import java.util.Stack;

public class StrukMain03 {
    public static void main(String[] args) {
    
        Stack<Struk03> stackStruk03= new Stack<>();
       
        //Memasukkan Struk kedalam stack 
        stackStruk03.push(new Struk03(1, "01/02/2024", 5, 100000));
        stackStruk03.push(new Struk03(2, "12/02/2024", 4, 80000));
        stackStruk03.push(new Struk03(3, "24/02/2024", 3, 120000));
        stackStruk03.push(new Struk03(4, "27/02/2024", 3, 75000));
        stackStruk03.push(new Struk03(5, "10/03/2024", 4, 80000));
        stackStruk03.push(new Struk03(6, "12/03/2024", 5, 120000));
        stackStruk03.push(new Struk03(7, "24/03/2024", 4, 100000));
        stackStruk03.push(new Struk03(8, "28/03/2024", 5, 120000));

        //Menampilkan informasi yang tersimpan dalam stack
        System.out.println("\nInformasi struk belanja yang masih tersimpan di dalam stack : ");
        for(Struk03 struk : stackStruk03){
            System.out.println(struk);
        }

        //Mengambil struk untuk ditukarkan voucher 
        System.out.println("\nMengambil struk belanja untuk ditukarkan dengan voucher belanja : ");
        int jumalahStrukditukarkan = 5;
        for(int i = 0; i < jumalahStrukditukarkan; i++){
            if(stackStruk03.isEmpty()){
                System.out.println("Tidak ada struk yang dapat ditukarkan");
                break;
            }
            Struk03 strukDitukarkan = stackStruk03.pop();
            System.out.println("Struk yang ditukarkan ke-" + (i + 1) + " : " + strukDitukarkan);
        }
    }
}






