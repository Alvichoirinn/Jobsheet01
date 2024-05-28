package GameScavengerHunt;

public class Point {
    String question;
    String answer;
    Point nextPoint;

    public Point(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.nextPoint = null;
    }
}