import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("\\.");
        String y = arr[0];
        String m = arr[1];
        String d = arr[2];

        System.out.printf("%s-%s-%s",m,d,y);


    }
}