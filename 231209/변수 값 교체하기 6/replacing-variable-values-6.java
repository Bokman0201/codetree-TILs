public class Main {
    public static void main(String[] args) {
        int a =2;
        int b =5;

        int tmpt = a;
        a =b;
        b =tmpt;

        System.out.println(a+"\n"+b);
    }
}