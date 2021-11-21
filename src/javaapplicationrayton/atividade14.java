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
public class atividade14 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        float valor, dolar, real = (float) 5.47;  
        System.out.println("*******************CONVERSOR DE DÓLAR EM REAL*******************");
        System.out.println("                     câmbio US$1,00 = R$5,47");
        System.out.println("OBS.: valores decimais devem ser digitados com vírgula. "
                + "EXEMPLO: R$ 2,45");
        System.out.println(" ");
        System.out.println("Digite o valor em Dólar U$$:  ");
        dolar = ler.nextFloat();
        if (dolar<=0){
            System.out.println("ERRO: Não é um valor válido. O valor deve ser diferente de zero");
        }
        else{valor  = real * dolar;
        System.out.println("O valor em Real é R$: " + valor);
    }}
}