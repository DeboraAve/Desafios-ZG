package org.example;

public class Soma {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int res = 0;



        for(int i = 0; i < 1000; i++){
            if(i % a == 0 || i % b == 0) {
                res += i;
            }
        }

        System.out.println("A soma dos multiplos de 3 e 5 abaixo de 1000, é: " +res);
    }
}
