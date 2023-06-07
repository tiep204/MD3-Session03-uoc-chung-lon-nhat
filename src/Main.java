import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập một số nguyên dương a: ");
        int a = sc.nextInt();
        System.out.println("Mời bạn nhập một số nguyên dương b: ");
        int b = sc.nextInt();
        if (a==0||b==0){
            System.out.println("không có ước chung lớn nhất");
        }
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println("ƯCLN là: " + a);
    }
}