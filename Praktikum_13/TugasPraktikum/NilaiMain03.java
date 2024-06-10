package TugasPraktikum;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NilaiMain03 {
    String kodeNilai;
    double nilai;
    Mahasiswa03 mhs;
    MataKuliah03 mk;

    public NilaiMain03 (String kodeNilai, double nilai, Mahasiswa03 mhs, MataKuliah03 mk) {
        this.kodeNilai = kodeNilai;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }

    List<Mahasiswa03> mhs1 = new ArrayList<>();
    List<MataKuliah03> mk1 = new ArrayList<>();

    public void tambahMhs(Mahasiswa03... mhs) {
        mhs1.addAll(Arrays.asList(mhs));
    }

    public void tambahMk(MataKuliah03... mk) {
        mk1.addAll(Arrays.asList(mk));
    }

    public void tampilMhs() {
        mhs1.forEach(mhs -> {
            System.out.println(mhs.nim + "\t" + mhs.nama + "\t\t" + mhs.noTelp);
        });
    }
    
    public void tampilMk() {
        mk1.forEach(mk -> {
            System.out.println(mk.kodeMk + "\t" + mk.namaMk + "\t\t" + mk.sks);
        });
    }    

    int linierSearchMhs(String nim) {
        for (int i = 0; i < mhs1.size(); i++) {
            if (nim.equals(mhs1.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int linierSearchMk(String mk) {
        for (int i = 0; i < mk1.size(); i++) {
            if (mk.equals(mk1.get(i).kodeMk)) {
                return i;
            }
        }
        return -1;
    }

    Mahasiswa03 cariMhs(String nim) {
        for (int i = 0; i < mhs1.size(); i++) {
            if (nim.equals (mhs1.get(i).nim)) {
                return mhs1.get(i);
            }
        }
        return null;
    }

    MataKuliah03 cariMk(String mk) {
        for (int i = 0; i < mk1.size(); i++) {
            if (mk.equals (mk1.get(i).kodeMk)) {
                return mk1.get(i);
            }
        }
        return null;
    }

    public String toString(int idx1, int idx2) {
        return mhs1.get(idx1).nim + "\t" + mhs1.get(idx1).nama + "\t" + 
            mk1.get(idx2).namaMk + "\t" + mk1.get(idx2).sks + "\t";
    }

    static Comparator<NilaiMain03> CompNilai = (n1, n2) -> {
        if (n1.nilai < n2.nilai) {
            return -1;
        } else if (n1.nilai > (n2).nilai) {
            return 1;
        } else {
            return 0;
        }
    };

    public void hapusMhs(String nim) {
        int index = linierSearchMhs(nim);
        if (index != -1) {
            mhs1.remove(index);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);

        List<NilaiMain03> nill = new ArrayList<>();
        NilaiMain03 n = new NilaiMain03("", 0, null, null);

        Mahasiswa03 m1 = new Mahasiswa03("20001", "Thalhah", "021xxx");
        Mahasiswa03 m2 = new Mahasiswa03("20002", "Zubair", "021xxx");
        Mahasiswa03 m3 = new Mahasiswa03("20003", "Abdur", "021xxx");
        Mahasiswa03 m4 = new Mahasiswa03("20004", "Sa'ad", "021xxx");
        Mahasiswa03 m5 = new Mahasiswa03("20005", "Sa'id", "021xxx");
        Mahasiswa03 m6 = new Mahasiswa03("20006", "Ubaidah", "021xxx");

        n.tambahMhs(m1, m2, m3, m4, m5, m6);

        MataKuliah03 mk1 = new MataKuliah03("00001", "Interner of Things", 3);
        MataKuliah03 mk2 = new MataKuliah03("00002", "Algoritma dan Struktur Data", 2);
        MataKuliah03 mk3 = new MataKuliah03("00003", "Algoritma dan Pemrograman", 2);
        MataKuliah03 mk4 = new MataKuliah03("00004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah03 mk5 = new MataKuliah03("00005", "Algoritma dan Struktur Data", 3);

        n.tambahMk(mk1, mk2, mk3, mk4, mk5);

        NilaiMain03 n1 = null;
        String nimMhs, mkMhs;

        int menu = 0;
        do {
            System.out.println("************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("************************************************");
            System.out.print("Pilih\t: ");
            menu = sd.nextInt();
            System.out.println("");

        switch (menu) {
            case 1:
                System.out.print("Kode\t: ");
                String kd = sc.nextLine();
                System.out.print("Nilai\t: ");
                double nilaiMhs = sb.nextDouble();
                System.out.println("");

                System.out.println("DAFTAR MAHASISWA");
                System.out.println("************************************************");
                System.out.println("NIM\tNama\t\tNo.Telp");
                n.tampilMhs();
                System.out.println("************************************************");
                System.out.print("Pilih Mahasiswa by nim\t\t: ");
                nimMhs = sc.nextLine();
                Mahasiswa03 mahasiswa;
                mahasiswa = n.cariMhs(nimMhs);

                System.out.println("");
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("************************************************");
                System.out.println("Kode\tMata Kuliah\t\t\tSKS");
                n.tampilMk();
                System.out.print("Pilih Mata Kuliah by Kode\t: ");
                mkMhs = sc.nextLine().trim(); // tambahkan trim() di sini
                MataKuliah03 mataKuliah;
                mataKuliah = n.cariMk(mkMhs);

                n1 = new NilaiMain03(kd, nilaiMhs, mahasiswa, mataKuliah);

                nill.add(n1);
                System.out.println("");
                break;


            case 2:
                System.out.println("DAFTAR NILAI MAHASISWA");
                System.out.println("************************************************");
                System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                for (int  i = 0; i < nill.size(); i++) {
                    n.linierSearchMhs(nill.get(i).mhs.nim);
                    n.linierSearchMk(nill.get(i).mk.kodeMk);
                
                    System.out.println(n.toString(n.linierSearchMhs(nill.get(i).mhs.nim), n.linierSearchMk(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                }
                System.out.println("");
                break;

            case 3: 
                System.out.println("DAFTAR NILAI MAHASISWA");
                System.out.println("************************************************");
                System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                int sks = 0;
                for (int  i = 0; i < nill.size(); i++) {
                    n.linierSearchMhs(nill.get(i).mhs.nim);
                    n.linierSearchMk(nill.get(i).mk.kodeMk);

                    System.out.println(n.toString(n.linierSearchMhs(nill.get(i).mhs.nim), n.linierSearchMk(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                }
                System.out.println("************************************************");
                System.out.print("Masukkan Data Mahasiswa NIM\t\t: ");
                String input = sc.nextLine();
                System.out.println("");
                for (int i = 0; i < nill.size(); i++) {
                    if (input.equalsIgnoreCase(nill.get(i).mhs.nim)) {
                        sks += nill.get(i).mk.sks;
                        n.linierSearchMhs(nill.get(i).mhs.nim);
                        n.linierSearchMk(nill.get(i).mk.kodeMk);
                
                        System.out.println(n.toString(n.linierSearchMhs(nill.get(i).mhs.nim), 
                        n.linierSearchMk(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                    }
                }                

            case 4: 
                System.out.println("DAFTAR NILAI MAHASISWA");
                System.out.println("************************************************");
                System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                nill.sort(CompNilai);
                for (int  i = 0; i < nill.size(); i++) {
                    n.linierSearchMhs(nill.get(i).mhs.nim);
                    n.linierSearchMk(nill.get(i).mk.kodeMk);

                    System.out.println(n.toString(n.linierSearchMhs(nill.get(i).mhs.nim), n.linierSearchMk(nill.get(i).mk.kodeMk))+ nill.get(i).nilai);
                }
                System.out.println("");
                break;

            case 5:
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nimHapus = sc.nextLine();
                n.hapusMhs(nimHapus);
                System.out.println("Data Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");
                System.out.println("");
                break;

            case 6:
                System.out.println("************************************************");
                System.out.println("Terima Kasih");
                System.out.println("************************************************");
                break;
            }
        } while (menu < 5 && menu > 0);   
    }
}

