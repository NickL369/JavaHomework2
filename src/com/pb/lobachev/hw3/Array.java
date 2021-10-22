package com.pb.lobachev.hw3;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    static void Bubble(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        if (count > 0) {
            Bubble(arr);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите пожалуйста 10 чисел:");
        int[] arr;
        arr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            arr[i] = number;
        }
        Bubble(arr);

        int countpositive = 0;
        int countsummelements= 0;
        for (int i = 0; i < arr.length - 1; i++){
            countsummelements = countsummelements + arr[i];
           if(arr[i] > 0){
               countpositive++;
           }

        }




        System.out.println("Наш массив отсортирован:" +Arrays.toString(arr));


        System.out.println("Вот столько положительных чисел "+ countpositive );
        System.out.println("Общая сумма числен в массиве " + countsummelements);
    }
}
