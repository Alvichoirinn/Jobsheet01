package GameScavengerHunt;
import java.util.Scanner;

public class ScavengerHunt {
    private Point startPoint;
    private Point currentPoint;

    public ScavengerHunt() {
        this.startPoint = null;
        this.currentPoint = null;
    }

    public void addPoint(String question, String answer) {
        Point newPoint = new Point(question, answer);
        if(startPoint == null) {
            startPoint = newPoint;
            currentPoint = newPoint;
        } else {
           currentPoint.nextPoint = newPoint;
           currentPoint = newPoint;
        }  
    }

    public void startGame() {
        if (startPoint == null) {
            System.out.println("Tidak ada titik untuk dimulai");
            return;
        }
        currentPoint = startPoint;
        Scanner sc = new Scanner(System.in);
        while (currentPoint != null) {
            System.out.print("Pertanyaan: " + currentPoint.question);
            String userAnswer = sc.nextLine();
            if (userAnswer.equalsIgnoreCase(currentPoint.answer)) {
                System.out.println("Jawaban benar!");
                currentPoint = currentPoint.nextPoint;
            } else {
                System.out.println("Jawaban salah, Coba lagi");
            }
        }
        System.out.println("Selamat! Anda telah menemukan harta karun!");
    }
}