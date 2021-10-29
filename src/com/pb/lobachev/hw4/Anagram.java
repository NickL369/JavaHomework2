package com.pb.lobachev.hw4;
import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    public static void main(String[] args) {
        System.out.println("введите два предложения, а мы проверим являются ли они анограммой");
        Scanner scan = new Scanner(System.in);
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        boolean a =  sort(text1).equals(sort(text2));
        System.out.print(a);
    }

    public static String sort(String text) {
        char[] content = text.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}



//в анаграмме одинаковое количество букв, это решения для анаграммы
//а согласно задания решения во втором варианте, я просто не совсем понял, нужно подстроку найти с случайным расположением символов или анаграмму
