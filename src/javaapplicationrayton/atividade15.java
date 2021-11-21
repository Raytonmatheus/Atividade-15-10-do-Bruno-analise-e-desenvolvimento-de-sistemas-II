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
public class atividade15 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float comprimento, largura, area, perimetro;
        System.out.println("Digite a largura do retângulo: ");
        largura = ler.nextFloat();
        System.out.println ("Digite o comprimento do retângulo: ");
        comprimento = ler.nextFloat();
        area = comprimento * largura;
        perimetro =  (2 * comprimento) + (2 * largura);
        System.out.println ("O valor calculado da área do retângulo é: "+ area);
        System.out.println("O valor calculado do perímetro do retângulo é: " + perimetro);
        
    }
    
}
