package Minggu7;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class PencarianMahasiswa03 {
    Mahasiswa03 listMhs[] = new Mahasiswa03[5];
    int idx;
    
    void tambah(Mahasiswa03 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx ++;
        }else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for (Mahasiswa03 m : listMhs) {
            if (m != null) {
                m.tampil();
            }
        }
        System.out.println("--------------------");
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos){
        if (pos != -1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        }else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void Tampildata(int x, int pos){
        if (pos != -1){
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    //method FindBinarySearch dengan algoritma pencarian data menggunakan teknik binary searching
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }else if (listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid-1);
            }else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    //Deklarasi method findBinarySearchNama
    public int FindBinarySearchNama(String cari, int left, int right) {
        int mid;//variabel mid digunakan untuk menyimpan indeks tengah 
        boolean foundMultiple = false;//digunakn untuk menandai apakah ditemukan lebih dari satu pencarian
        int count = 0;//digunakan untuk menghitung pencarian yang cocok
    
        if (right >= left) {//mengecek apakah right lebih besar sama dengan left
            mid = (left + right) / 2;
            int result = cari.compareToIgnoreCase(listMhs[mid].nama);
    
            if (result == 0) {
                foundMultiple = true;
                count++;
                int i = mid - 1;
                while (i >= left && listMhs[i].nama.compareToIgnoreCase(cari) == 0) {
                    count++;
                    i--;
                }
                i = mid + 1;
                while (i <= right && listMhs[i].nama.compareToIgnoreCase(cari) == 0) {
                    count++;
                    i++;
                }
                if (count > 1) {
                    System.out.println("Peringatan: Ditemukan " + count + " hasil dengan nama " + cari + "!");
                    return mid;
                } else {
                    foundMultiple = false; 
                }
                } else if (result < 0) {
                    return FindBinarySearchNama(cari, left, mid - 1);
                } else {
                    return FindBinarySearchNama(cari, mid + 1, right);
                }
            }
        return -1;//apabila ditemukan nilai yang cocok, kembalikan nilai -1
    }
}
