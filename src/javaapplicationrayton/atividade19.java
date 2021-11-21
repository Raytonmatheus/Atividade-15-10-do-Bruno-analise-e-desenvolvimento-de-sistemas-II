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
public class atividade19 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
         int v1, v2, v3;
         System.out.println("Insira o primeiro valor: ");
         v1 = ler.nextInt();
         System.out.println("Insira o segundo valor: ");
         v2 = ler.nextInt();
         System.out.println("Insira o terceiro valor: ");
         v3 = ler.nextInt();
         
         if (v1>v2 && v1>v3 && v3>v2){         
             System.out.println("O maior valor é: "+v1);
             System.out.println("O menor valor é: "+v2);
             System.out.println("O valor do meio é: "+v3);
         }
         else if (v1>v2 && v1>v3 && v3<v2){         
             System.out.println("O maior valor é: "+v1);
             System.out.println("O menor valor é: "+v3);
             System.out.println("O valor do meio é: "+v2);
         }
         else if(v2>v1 && v2>v3 && v3>v1) {              
              System.out.println("O maior valor é: "+v2);
              System.out.println("O menor valor é: "+v3);
              System.out.println("O valor do meio é: "+v1);
         }
         else if(v2>v1 && v2>v3 && v3<v1) {
              System.out.println("O maior valor é: "+v2);
              System.out.println("O menor valor é: "+v3);
              System.out.println("O valor do meio é: "+v1);
         }
         else {
              System.out.println("ERRO: você não digitou um valor válido para a estrutura"); 
         }        
    }
}