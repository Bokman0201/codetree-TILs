import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b= sc.nextDouble();
        double c = a/b;
        System.out.printf("%.20f",c);

    }
}