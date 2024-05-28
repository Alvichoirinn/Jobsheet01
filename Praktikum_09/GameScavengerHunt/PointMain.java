package GameScavengerHunt;

public class PointMain {
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Benda yang digunakan untuk melihat waktu?", "Jam");
        game.addPoint("Benda apa yang jika ditekan akan mengeluarkan suara?", "Bel");
        game.addPoint("Benda yang digunakan untuk menulis dikertas?", "Bolpoin");

        game.startGame();
    }
}



