package TugasPraktikum2;

public class Film03 {
    int filmId;
    String judul;
    double rating;

    public Film03(int filmId, String judul, double rating) {
        this.filmId = filmId;
        this.judul = judul;
        this.rating = rating;
    }

    public int getId(){
        return filmId;
    }

    public String getJudul() {
        return judul;
    }

    public double getRating() {
        return rating;
    }
    
}