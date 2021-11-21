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
public class atividade12 {
    public static void main(String[] args) {  
        String nome;
        float n1, n2, n3, n4; 
        double total; 
        double media;
        Scanner Ler = new Scanner(System.in);
       
        System.out.println("Calcula a média da matéria de Lógica de Programação");
        System.out.println("");
        System.out.print("Qual e o seu nome:");
        nome = Ler.nextLine();
        
        System.out.print("Informe a nota 1: ");
        n1 = Ler.nextFloat();
        
        System.out.print("Informe a nota 2: ");
        n2 = Ler.nextFloat();
        
        System.out.print("Informe a nota 3: ");
        n3 = Ler.nextFloat();
        
        System.out.print("Informe a nota 4: ");
        n4 = Ler.nextFloat();
        
        total = n1+n2+n3+n4;
        media = total/4;
        System.out.println(nome+" a sua media é "+media);
    }
}