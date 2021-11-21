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
public class atividade13 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        float valor, real, dolar = (float) 5.47;  
        System.out.println("*******************CONVERSOR DE REAL EM DÓLAR*******************");
        System.out.println("                     câmbio US$1,00 = R$5,47");
        System.out.println("OBS.: valores decimais devem ser digitados com vírgula. "
                + "EXEMPLO: R$ 2,45");
        System.out.println(" ");
        System.out.println("Digite o valor em Real R$:  ");
        real = ler.nextFloat();
        if (real<=0){
            System.out.println("ERRO: Não é um valor válido. O valor deve ser diferente de zero");
        }
        else{valor  = real / dolar;
        System.out.println("O valor em Dolar é U$$: " + valor);
    }}
}

    /*static final double cambio=5.47;//ponha o valor da taxa aq

    
    public static double calculaValor(double reais, int codigo ){
        double total = 0;
        /*VA FAZER - aqui vc coloca o calculo dos valores, ja fiz a maior parte do
         * seu trabalho acho que aq vc consegue. pois eh "if" e calculos como no C
         * ;)
         */
/*
        return total ;
    }

    public static void main(String[] args) {
        
        //primeiramente criamos um objeto teclado que sera pro onde vc vai ler os valores
        Scanner ler = new Scanner(System.in);
        double reais;
        int codigoMoeda;//boa pratica de programação, sempre defina as variaveis no inicio das funçoes


        System.out.println("Qual o valor em reais?");//primeiramente escreva na tela a pergunta
        reais = ler.nextDouble();// depois leia a resposta
        System.out.println("Qual o codigo da moeda? 1 = euro, 2 dolar");
        codigoMoeda = ler.nextInt();
        if (reais == 0) {
            System.out.println("Valor invalido! Digite um valor em reais, diferente de zero");
        }
        
        calculaValor(reais,codigoMoeda);

    }
}/*/