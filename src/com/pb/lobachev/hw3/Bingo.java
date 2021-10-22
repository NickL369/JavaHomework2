package com.pb.lobachev.hw3;
import java.util.Scanner;


public class Bingo {
    public static void main(String[] args) {
        int count = 0;
        int a = (int) (Math.random() * 100);

        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать! Если Вы захотите выйти введите -1");
        String bingoInput = bingoInput ( scan,count,a);
        System.out.println(bingoInput);
        }




    private static String bingoInput( Scanner sc,int count,int a ) {

        boolean flag = false;
        String  result = "";

        while (!flag) {
            count = count +1;

            try {
                System.out.println("Введите число:");
                String scan = sc.next();
                int step = Integer.parseInt(scan);


                if(count > 50){
                    result  = "Лимит попыток исчерпан";
                    flag = true;
                }
                else if(step == -1 ){
                    result  = "Хорошего дня!";
                    flag = true;

                }

                else if(step == a){
                flag = true;
                    result = "Вы угадали! Использовано попыток  " + count;
               }
                else if(step < a ){
                    System.out.println("Введено число меньше задуманного");
                }
                else if(step > a ){
                    System.out.println("Введено число больше задуманного");
                }
            } catch (NumberFormatException ex) {

                System.out.println("Введено не число");
            }
        }



        return result;
    }



}