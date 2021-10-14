package com.pb.lobachev.hw2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args)throws IOException {
        System.out.println("Введите 2 значения и знак арифметической операции");

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2= new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int operand1  =  Integer.parseInt(reader1.readLine());
        int  operand2 = Integer.parseInt(reader2.readLine());
        String  sign = reader3.readLine();






        String result1 = null;
        int result2 = 0 ;

switch(sign){
    case "/":
        switch(operand2){
    case 0:
        result1 = "На ноль делить нельзя";
        break;


            default:
                result2 = operand1 / operand2;
                break;
    }

    case "*":
        result2 = operand1 * operand2;
        break;

    case "+":
        result2 = operand1 + operand2;
        break;
    case "-":
        result2 = operand1 - operand2;
        break;
    default:
        result1 = "недопустимая операция";
        break;

}





Interval interval = new Interval();
String gap1 = interval.Gap(operand1);
String gap2 = interval.Gap(operand2);





if(result1 != null ){
    System.out.println(result1);
}
else {
    String gapreuslt = interval.Gap(result2);
    System.out.println("Результат " + result2 + " Данное значение" + gapreuslt);


    System.out.println("Первое введенное число " + gap1);
    System.out.println("Второе введенное число " + gap2);


}




    }
}
