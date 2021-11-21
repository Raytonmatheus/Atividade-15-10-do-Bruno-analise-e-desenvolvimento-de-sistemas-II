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
public class atividade36 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
         int a,b,c;
         System.out.println("Insira o valor do lado A: ");
         a = ler.nextInt();
         System.out.println("Insira o valor do lado B: ");
         b = ler.nextInt();
         System.out.println("Insira o valor do lado C: ");
         c = ler.nextInt();
         
         if ( a>b+c || b>a+c ||  c>a+b ){//fiquei com dúvida se deveria colocar o sinal como >= menor aqui Bruno, mas acho que não
             System.out.println("As medidas não formam um triângulo"); 
         }
         else {
              System.out.println("As medidas formam um triângulo "); 
         }
    }
}
