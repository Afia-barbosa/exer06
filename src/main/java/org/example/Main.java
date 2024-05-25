package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A,B,VariavelTemp;

        System.out.println("------Troca variaveis--------");

        System.out.print("Digite a variavel A:");
        A = entrada.nextInt();

        System.out.print("Digite a variavel B:");
        B = entrada.nextInt();

        VariavelTemp = A;
        A = B;
        B = VariavelTemp;

        System.out.println("A = "+A+" | B = "+B+"\n");

    }
}