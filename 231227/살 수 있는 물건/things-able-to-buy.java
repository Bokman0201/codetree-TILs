import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int  a= sc.nextInt();

        int book =3000, mask=1000;

        if(a>=book){
            System.out.println("book");
        }
        else if(a>=mask&&a<book){
            System.out.println("mask");
        }
        else{
            System.out.println("no");
        }
        
    }
}