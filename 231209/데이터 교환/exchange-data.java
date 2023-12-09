public class Main {
    public static void main(String[] args) {
       int a = 5, b = 6, c = 7;

       int tempt = b;
       b=a;
       a=c;
       c=tempt;

       System.out.println(a+"\n"+b+"\n"+c);
    }
}