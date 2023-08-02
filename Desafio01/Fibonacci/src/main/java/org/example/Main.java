package org.example;

public class Main {
    public static void main(String[] args) {
        int limite = 4000000;
        int soma = 0;
        int a = 1;
        int b = 1;
        int c = a + b;

        while (c<limite){
            soma += c;
            a = b + c;
            b = c+a;
            c = a +b;

            System.out.println(soma);
        }




    }
}