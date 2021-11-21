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
public class atividade16 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float altura, IMC, massa;
        System.out.println("Digite a sua massa separado por virgula: ");
        massa = ler.nextFloat();
        System.out.println("Digite sua altura separado por virgula: ");
        altura = ler.nextFloat();        
        IMC = massa/(altura*altura);
        System.out.println( "O cálculo do seu IMC é: "+IMC);
    }
}
