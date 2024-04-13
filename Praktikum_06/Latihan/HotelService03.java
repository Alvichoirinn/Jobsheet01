package Latihan;

import jobsheet6.Mahasiswa03;

public class HotelService03 {
    Hotel03 listHotel[] = new Hotel03 [5];
    int idx;

       //Setelah ini tuliskan method tambah()
       void tambah(Hotel03 h){
        if (idx < listHotel.length){
            listHotel[idx] = h;
            idx++;
        } else{
            System.out.println("Data sudah penuh!!");
        }
    }

    //setelah ini tuliskan method tampil()
    void tampil(){
        for (Hotel03 h : listHotel){
            h.tampil();
            System.out.println("----------------------------");
        }
    }

    //setelah ini tuliskan method 
    void bubbleSortHarga(){
        for(int i = 0; i < listHotel.length - 1; i++){
            for(int j = 1; j < listHotel.length - i; j++){
                if(listHotel[j]. harga < listHotel [j-1].harga){
                    //di bawah ini proses swap atau penukuran
                    Hotel03 tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortHarga(){
        for(int i = 0; i < listHotel.length - 1; i++){
            int idxMin = i;
            for (int j = i + 1; j < listHotel.length; j++){
                if(listHotel[j].harga < listHotel[idxMin].harga){
                    idxMin = j;
                }
            }
            //Swap
            Hotel03 tmp = listHotel[idxMin];
            listHotel[idxMin] = listHotel[i];
            listHotel[i] = tmp;
        }
    }

    void bubbleSortBintang(){
        for(int i = 0; i < listHotel.length - 1; i++){
            for(int j = 1; j < listHotel.length - i; j++){
                if(listHotel[j].bintang > listHotel [j-1].bintang){
                    //di bawah ini proses swap atau penukuran
                    Hotel03 tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortBintang(){
        for(int i = 0; i < listHotel.length - 1; i++){
            int idxMin = i;
            for (int j = i + 1; j < listHotel.length; j++){
                if(listHotel[j].bintang > listHotel[idxMin].bintang){
                    idxMin = j;
                }
            }
            //Swap
            Hotel03 tmp = listHotel[idxMin];
            listHotel[idxMin] = listHotel[i];
            listHotel[i] = tmp;
        }
    }
    
}
