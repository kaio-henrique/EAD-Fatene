package br.com.fatene.ead.exercise1.utils;

public class StringExt {

    public void showValue(String input) {
        normal(input);
        reverse(input);
        hidden(input);
    }

    private void normal(String input) {
        System.out.println("Normal: " + input);
    }

    private void reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        System.out.println("Reverse: " + sb.reverse().toString());
    }

    private void hidden(String input) {
        System.out.println("Hidden: " +input.replace(input, ""));
    }

    private void pLanguage(String input) {
        // TODO: IMPLEMENTAR LÓGICA DA LINGUAGEM EM 'P'
    }

}
