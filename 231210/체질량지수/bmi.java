import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(), b = sc.nextInt();
        double aa= a/100;
        double bmi = b/(aa*aa);
            System.out.println((int)bmi);
        if(bmi>=25){
            System.out.println("Obesity");
        }

    }
}