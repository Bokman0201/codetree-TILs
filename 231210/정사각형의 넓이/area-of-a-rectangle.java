import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sq = n*n;
            System.out.println(sq);

        if(n<5){
            System.out.println("tiny");
        }
    }
}