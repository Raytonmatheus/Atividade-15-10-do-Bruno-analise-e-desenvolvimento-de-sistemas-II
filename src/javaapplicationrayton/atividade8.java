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
public class atividade8 {
    public static void main (String [] args){
        int n1, n2;
        Scanner  sc = new  Scanner(System.in);
        System.out.println( "Digite o primeiro número: ");
        n1=sc.nextInt();
     
        System.out.println( "Digite o segundo número: ");
        n2=sc.nextInt();
        if (n1==n2){
            System.out.println("os números são iguais");
        }
        else {
            System.out.println("os números são diferentes" );
        }
    }
    
}
