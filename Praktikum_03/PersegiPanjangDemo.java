 import java.util.Scanner;
 public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi array objek
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
        int panjang, lebar, luas, keliling;

        //PersegiPanjang[] myArrayOfPersegiPanjang = new PersegiPanjang[100];
        //myArrayOfPersegiPanjang[5].panjang  = 20;
        

    //Modifikasi poin nomor 4
    for (int i = 0; i < 3; i++){
        //arrayOfPersegiPanjang[i] = new PersegiPanjang();
        //System.out.println("Persegi panjang ke-" + (i + 1));
        //System.out.print("Masukkan panjang: ");
        //arrayOfPersegiPanjang[i].panjang = sc.nextInt();
        //System.out.print("Masukkan lebar: ");
        //arrayOfPersegiPanjang[i].lebar = sc.nextInt();
        //arrayOfPersegiPanjang[i].cetakInfo();
        System.out.println("Persegi panjang ke-" + (i + 1));
        System.out.print("Masukkan panjang: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        lebar = sc.nextInt();
        arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
    }

    //Modifikasi point nomor 5
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++){
           System.out.println("Persegi panjang ke-" + (i + 1) 
            + ", panjang: " + arrayOfPersegiPanjang[i].getPanjang() 
            + ", lebar: " + arrayOfPersegiPanjang[i].getLebar() 
            + ", luas: " +arrayOfPersegiPanjang[i].hitungLuas() 
            + ", keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());

        }
    }
}
