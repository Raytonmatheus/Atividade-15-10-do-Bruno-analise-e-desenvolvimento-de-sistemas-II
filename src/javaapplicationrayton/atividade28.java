/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationrayton;

/**
 *
 * @author Rayton
 */
import java.util.Scanner;
public class atividade28 {
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o número para gerar a série Fibonacci: ");
        int n = ler.nextInt();
        if (n>0){
	
	for (int i = 1; i <= n; i++) {
            System.out.println("(" + i + "):" + atividade28.fibo(i) + "\t");
        }}
        else{
            System.out.println("ERRO: Número inválido rejeitado pelo sistema");
        }

    }

}

