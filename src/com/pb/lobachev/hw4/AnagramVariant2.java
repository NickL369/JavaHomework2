package com.pb.lobachev.hw4;
import java.util.Scanner;



public class AnagramVariant2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        String text11 = text1.toLowerCase().replaceAll("[^a-zа-я]", "");
        String text22 = text2.toLowerCase().replaceAll("[^a-zа-я]", "");
        boolean resanagramm2 = Anagramm2 ( text11,text22);
        String res = "";
        if(resanagramm2 == true){
            res = "Это анограмма";
        }else if(resanagramm2 == false){
            res = "Это НЕ анограмма";
        }else{
            res = "ERROR что то пошло не так, обратитесь в тех поддержку";
        }
        System.out.println(res);

    }





    static boolean Anagramm2(String text11, String text22) {
        int length1;
        int count = 0;
        boolean result = false ;
        boolean a ;
        String[] text111 = text11.split("");
        String[] text222 = text22.split("");
        if(text111.length > text222.length){
            length1 = text222.length;
        }else{
            length1 = text111.length;
        }


        for (int i = 0; i < text111.length; i++) {
            for (int j = 0; j < text222.length; j++) {
            if(text111[i].equals(text222[j]) == true) {
                count = count + 1;
                i++;


            }

        }
            if(count == length1){

                result = true;
            }

    }
        return result;

    }


}





