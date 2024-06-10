import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    
    List<Mahasiswa> mahasiswas = new ArrayList<>(); 
    
        public void tambah(Mahasiswa... mhs) {
            mahasiswas.addAll(Arrays.asList(mhs));
        }

        public void hapus(int index) {
            mahasiswas.remove(index);
        }

        public void update(int index, Mahasiswa mhs) {
            mahasiswas.set(index, mhs);
        }

        public void tampil() {
            mahasiswas.stream().forEach(mhs -> {
                System.out.println("" + mhs.toString());
            });
        }

        //int linierSearch(String nim) {
            //or (int i = 0; i < mahasiswas.size(); i++) {
                //if (nim.equals(mahasiswas.get(i).nim)) {
                    //return i;
                //}
            //}
            //return 1;
        //}
        int binarySearch(String nim) {
            return Collections.binarySearch(mahasiswas, new Mahasiswa(nim, null, null),
                new Comparator<Mahasiswa>(){
                public int compare(Mahasiswa o1, Mahasiswa o2) {
                    return o1.nim.compareTo(o2.nim);
                }
            });
        }

        public void sortAscending() {
            Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
                public int compare(Mahasiswa o1, Mahasiswa o2) {
                    return o1.nim.compareTo(o2.nim);
                }
            });
        }
    
        public void sortDescending() {
            Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
                public int compare(Mahasiswa o1, Mahasiswa o2) {
                    return o2.nim.compareTo(o1.nim);
                }
            });
        }
    public static void main(String[] args) {
        
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        //menambah objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        // sorting ascending
        lm.sortAscending();
        System.out.println("\nData Sorting secara Ascending:");
        lm.tampil();

        // sorting descending
        lm.sortDescending();
        System.out.println("\nData Sorting secara Descending:");
        lm.tampil();
    }
}

