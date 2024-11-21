package buoi2;

import java.util.Scanner;

public class GiaiPT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("mời nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("mời nhập b: ");
        double b = scanner.nextDouble();


        if(a == 0){
            if(b == 0){
                System.out.println("phuong trinh có vô số nghiệm");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }else {
            double x = -b/a;
            System.out.println("nghiệm của phương trình là: "+ x);
        }
    }
}
