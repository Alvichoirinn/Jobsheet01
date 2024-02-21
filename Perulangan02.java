import java.util.Scanner;
/**
 * Perulangan02
 */
public class Perulangan02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = input.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length()-2));

        if(n < 10){
            n += 10;
        }

        for (int i = 1; i <= n; i++){
            if (i != 6 && i != 10){
                if (i % 2 == 0){
                    System.out.print(i + " ");
                }else {
                    System.out.print(" * ");
                }
            }
        }

        input.close();

    }
}