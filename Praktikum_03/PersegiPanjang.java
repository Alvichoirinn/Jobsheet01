public class PersegiPanjang{
    public int panjang;
    public int lebar;

    public PersegiPanjang(int p, int l){
        panjang = p;
        lebar = l;
    }

    //method cetak info
    public void cetakInfo(){
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }

    public int getPanjang(){
        return panjang;
    }

    public void setPanjang(int panjang){
        this.panjang = panjang;
    }

    public int getLebar(){
        return panjang;
    }

    public void setLebar(int lebar){
        this.lebar = lebar;
    }

    public int hitungLuas(){
        return panjang * lebar;
    }

    public int hitungKeliling(){
        return 2 * (panjang + lebar);
    }
}
