package Praktikum8;

import java.util.Scanner;

public class StackMain {
    
 public static void main(String[] args) {
        Stack2 stk = new Stack2(5);

        Scanner sc = new Scanner(System.in);
        char pilih;
        do{
            System.out.println("Menu: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Get Max");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu : ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch(menu){
                case 1:
                    System.out.println("Masukkan data pakaian");
                    System.out.print("Jenis : ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna : ");
                    String warna = sc.nextLine();
                    System.out.print("Merk : ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran : ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga : ");
                    double harga = sc.nextDouble();
                    sc.nextLine();
                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    stk.getMax();
                    break;
                case 6:
                    System.out.println("Keluar dari program");
                    break;
                    default:
                    System.out.println("Pilihan tidak valid");
                    break;
                }

                System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
                pilih = sc.next().charAt(0);
                sc.nextLine();
        } while (pilih == 'y'); 
        sc.close();
    }
}
