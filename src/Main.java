import java.util.Scanner;

public class Main {

    public static int first(int n,int a){
        if (n==0){
            return 0;
        }
        else {
            return a + first(n-1,a);
        }
    }

    public static int second(int n,int a){
        if (n==0){
            return 1;
        }
        else {
            return a * second(n-1,a);
        }
    }

    public static int third(int n,int a){
        if (n==0){
            return a;
        }
        else {
            return third(a%n,n);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        System.out.println("Умножение");
        System.out.println(first(n,a));
        System.out.println("Степень");
        System.out.println(second(n,a));
        System.out.println("Nod");
        System.out.println(third(n,a));
    }
}
