import java.util.Scanner;


public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height;
        double weight;
        double bmi;

        int i = 1;
        while(i <= 2) {

            System.out.print("体重（kg）を入力してください: ");
            weight = scanner.nextDouble();

            System.out.print("身長（m）を入力してください: ");
            height = scanner.nextDouble();
            height = height * 0.01;

           bmi = weight / (height * height);


            System.out.println(i + "人目のBMI");
            System.out.printf("%.2f%n",bmi);
            i = i + 1;
        }
    }
}