package buoi2;

import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("mời nhập số nguyên: ");
        int n = scanner.nextInt();

        String result = n %2 == 0 ? "so chẵn" : "số lẻ";
        System.out.println(result);

//        if(n %2 == 0){
//            System.out.println(n+ " la số chẵn");
//        }else {
//            System.out.println(n +" là số lẻ");
//        }
    }
}
