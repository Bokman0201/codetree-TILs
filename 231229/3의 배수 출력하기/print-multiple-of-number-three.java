import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a = sc.nextInt();

        while(i<=a){
            if(i%3==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}