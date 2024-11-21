package luyen_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        char operator;
//        Double number1, number2, result;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter operator (either +, -, *, or /): ");
//
//        operator = scanner.next().charAt(0);
//        System.out.println("enter number1 and number2 respectively: ");
//
//        number1 = scanner.nextDouble();
//        number2 = scanner.nextDouble();
//
//        switch (operator){
//            case  '+':
//                result = number1 + number2;
//                System.out.println(number1 + " + " + number2 + " = "+ result);
//                break;
//            case  '-':
//                result = number1 - number2;
//                System.out.println(number1 + " - " + number2 + " = "+ result);
//                break;
//            case  '*':
//                result = number1 * number2;
//                System.out.println(number1 + " * " + number2 + " = "+ result);
//                break;
//            case  '/':
//                result = number1 / number2;
//                System.out.println(number1 + " / " + number2 + " = "+ result);
//                break;
//            default:
//                System.out.println("invalid operator!");
//                break;
//
//        }

//        int[] age = new int[5];
//
//        for (int i = 0; i < 5; i++){
//            System.out.println(age[i]);
//        }
//    int[] age = {3,5,21,6,3};
//    for (int i = 0; i < 5; i++){
//        System.out.println(age[i]);
//    }
//    int[] numbers = {1,2,3,4,6,5,7,9,4};
//    int sum = 0;
//    Double average;
//
//    for (int number : numbers){
//        sum += number;
//    }
//    int arrayLength = numbers.length;
//    average = (double)sum / arrayLength;
//        System.out.println("sum = "+ sum);
//        System.out.println("average = "+ average);
//    int [][] a = {
//            {1,2,3},
//            {3,4,5,6},
//            {7},
//    };
//
//    //dùng for thường để in ra
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//        }
//        System.out.println("");
//
//        for (int[] innerArray: a) {
//            for (int data: innerArray) {
//                System.out.print(data + " ");
//
//            }
//
//        }
//    int [][][] numbers = {
//            {
//                    {1,2,3},
//                    {4,5,6},
//            },
//            {
//                    {7,8,9,10,11,21},
//                    {12,23},
//                    {12,34,45,46,67}
//            },
//    };
//
//    for(int [][] array2D: numbers){
//        for(int[] array1D: array2D){
//            for(int temp: array1D){
//                System.out.print(temp+ " ");
//            }
//        }
//    }

        //sao chép mảng bằng toán tử gán
//        int [] numbers = {1,2,3,4,5,6};
//        int [] positiveNumbers = numbers;
//
//        for(int number: positiveNumbers){
//            System.out.print(number+ " ");
//        }

        //dùng cấu trúc vòng lắp để sao chép
//        int[] source = {1,2,3,4,5,6};
//        int[] destination = new int[6];
//
//        for (int i = 0; i< source.length; i++){
//            destination[i] = source[i];
//        }
//
//        System.out.println(Arrays.toString(destination));


        //sử dụng hàm arraycopy
//        int [] n1 = {2,1,3,4,5,6,7};
//        int [] n3 = new int[6];
//
//        int [] n2 = new int[n1.length];
//
//        System.arraycopy(n1, 0, n2, 0, n1.length);
//        System.out.println("n2 = "+ Arrays.toString(n2));
//
//        System.arraycopy(n1, 2, n3, 1, 2);
//        System.out.println("n3 = "+ Arrays.toString(n3));

        //sử dụng hàm copyOfRange
//        int source [] = {1,2,3,4,5,6};
//        int [] destination1 = Arrays.copyOfRange(source, 0, source.length);
//        System.out.println("destination1 = "+ Arrays.toString(destination1));
//
//        int[] destination2 = Arrays.copyOfRange(source, 2,5);
//        System.out.println("destination2 = "+ Arrays.toString(destination2));

        //mảng 2d
//        int[][] source = {
//                {1,2,3,4,5},
//                {3,4,5,6,7},
//                {2,3,5},
//        };
//
//        int[][] destination = new int[source.length][];
//
//        for(int i = 0; i < source.length; i++){
//            destination[i] = new int[source[i].length];
//            System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
//        }
//        System.out.println(Arrays.deepToString(destination));






    }
}
