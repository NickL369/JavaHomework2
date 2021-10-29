package com.pb.lobachev.hw4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CustomTokenizer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer strparcer = StrPacer(scan);
       System.out.println(strparcer);

    }

    private static StringBuffer StrPacer(Scanner sc) {
        String text = sc.nextLine();
        final StringBuffer buffer = new StringBuffer(text);
        final Pattern patter = Pattern.compile("\\b(\\p{javaLowerCase})");
        final Matcher matcher = patter.matcher(buffer);
        while (matcher.find()) {
            buffer.replace(matcher.start(), matcher.end(), matcher.group().toUpperCase());
        }
        return buffer;
    }
}






