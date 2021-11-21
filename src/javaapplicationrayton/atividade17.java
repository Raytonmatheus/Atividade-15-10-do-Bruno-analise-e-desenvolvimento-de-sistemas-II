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
public class atividade17 {
 
    public static void main(String[] args) {

        String a1;
        String a2;
        String aux;
        Scanner Ler= new Scanner(System.in);
        System.out.println("digite o valor de a1: ");
        a1 = Ler.nextLine();
        System.out.println("digite o valor de a2: ");
        a2 = Ler.nextLine();
        aux = a2;
        a2 = a1;
        a1 = aux;   
        System.out.println("o conteúdo das variaveis foram trocados ");
        System.out.println("a1 agora é: "+a1+ " e a2 agora é: "+a2);
    } 
}