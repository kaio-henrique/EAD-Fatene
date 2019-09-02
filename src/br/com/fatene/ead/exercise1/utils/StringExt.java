package br.com.fatene.ead.exercise1.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExt {

    private static final String PATTERN_REGEX = "(?i)[aeiou]";

    public void showValue(String input) {
        normal(input);
        reverse(input);
        hidden(input);
        pLanguage(input);
    }

    private void normal(String input) {
        System.out.println("Normal: " + input);
    }

    private void reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        System.out.println("Reverse: " + sb.reverse().toString());
    }

    private void hidden(String input) {
        System.out.println("Hidden: " + input.replace(input, ""));
    }

    private void pLanguage(String input) {
        StringBuilder sb = new StringBuilder();
        Pattern tokenP = Pattern.compile(PATTERN_REGEX);

        for (char s : input.toCharArray()) {
            Matcher m = tokenP.matcher(String.valueOf(s));

            if (m.find()) {
                sb.append(s);
            } else {
                if (!" ".equals(String.valueOf(s))) {
                    sb.append("P").append(s);
                } else {
                    sb.append(" ");
                }
            }
        }

        System.out.println("P Language: " + sb.toString());
    }

}