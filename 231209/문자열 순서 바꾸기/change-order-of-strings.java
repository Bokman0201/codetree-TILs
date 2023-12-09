import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next(), t = sc.next();

        String a = s;
        s=t;
        t=a;
        System.out.printf("%s\n%s", s,t); 
    }
}