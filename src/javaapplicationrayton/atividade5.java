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
public class atividade5 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com o primeiro número: ");
        int  n1 = sc.nextInt();
        System.out.println("entre com o segundo número: ");
        int n2 = sc.nextInt();
        if (n1>n2){
            System.out.println("O maior número é: " + n1);
        }
        else if (n1<n2){
            System.out.println("O maior número é: " + n2);
        }
        else {
            System.out.println("ERRO: Você não digitou um número válido ou os números são iguais " );
        }
    }
    
}
