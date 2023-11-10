import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height;
        double weight;
        BigDecimal bd;

    

            System.out.print("体重（kg）を入力してください: ");
            weight = scanner.nextDouble();

            System.out.print("身長（m）を入力してください: ");
            height = scanner.nextDouble();
            height = height * 0.01;

            double result = weight / (height * height);

            bd = new BigDecimal(result);
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            System.out.println(bd);
            
    }
}
