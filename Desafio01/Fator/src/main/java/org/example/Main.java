package org.example;

public class Main {
    public static void main(String[] args) {

        long numero = 600851475143L;

        for(long i=2;i<numero ;++i) {
            while(numero % i==0)
                numero = numero / i;

        }
        System.out.println(numero);
    }
}