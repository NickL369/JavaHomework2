package com.pb.lobachev.hw2;

public class Interval {


    static String Gap(int operand) {
        String res;
         if(operand <0 ){
             res = "Число меньше 0";
         }else
if(operand>0 && operand <15 ){
    res = "Число в промежутке [0 -14]";
}else
if(operand>14 && operand <36 ){
    res = "Число в промежутке  [15 - 35]";
}else
if(operand>35 && operand <51 ){
    res = "Число в промепжутке [36 - 50]";
}else
if(operand>50 && operand <101 ){
    res = "Число в промежутке [51 - 100]";
}
else
    {
        res = "число более 100";
    }

    return res;

    }

}
