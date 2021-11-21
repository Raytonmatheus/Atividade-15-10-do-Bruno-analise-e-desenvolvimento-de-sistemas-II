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
import  java.util.Scanner; 
public class atividade6 {
    public static void main (String [] args){
        Scanner  sc = new  Scanner(System.in);
        System.out.println( "Digite um número entre 1 e 10 :");
        int  numero=sc.nextInt();
        while(numero  <1 ||  numero > 10){
            System.out.println("ERRO: Não é  permitido números  menores  que 1 ou maiores  que 10.\n Digite um novo  valor : \n");
            numero=sc.nextInt();
          }
       System.out.println("\n");/*vamos dar um bom espaço para não confundir Bruno*/
               
        for (int i=1;  i<=10; i++) {
            System.out.println(numero*i); 
        } 
    }
    
}
