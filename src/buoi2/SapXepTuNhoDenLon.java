package buoi2;

import java.util.Scanner;

public class SapXepTuNhoDenLon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập 3 số nguyên dương: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
//cach1
//        if(a > b){
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        if(a > c){
//            int temp = a;
//            a = c;
//            c = temp;
//        }
//        if(b> c){
//            int temp = b;
//            b = c;
//            c = temp;
//        }
//
//        System.out.println("thứ tự lần lượt là: "+ a+ " "+ b+ " "+ c);
    //cách 2
//        int min, midle, max;
//        if(a <= b && a <=c){
//            min = a;
//            if(b <= c){
//                midle = b;
//                max = c;
//            }else {
//                midle = c;
//                max = b;
//            }
//        }else if(b <= a && b <= c){
//            min = b;
//            if(a <= c){
//                midle = a;
//                max = c;
//            }else {
//                midle = c;
//                max = a;
//            }
//        }else {
//            min = c;
//            if(b <= a){
//                midle = b;
//                max = a;
//            }else {
//                midle = a;
//                max = b;
//            }
//        }
//
//        System.out.println("thứ tự lần lượt là: "+ min + " "+ midle+ " "+ max);

        //cách 3 dùng toán tử 3 ngôi
        int min = (a <= b && a <= c) ? a : (b<= c ? b : c);
        int max = (a >= b && a >= c) ? a : (b>= c ? b : c);
        int mid = (a + b + c) -min - max;

        System.out.println("thứ tự lần lượt là: "+ min+ " " + mid + " " + max);
    }
}
