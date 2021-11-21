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
public class atividade9 {
    public static void main (String [] args){
      int ma1, ma2, sm1, sm2, soma, n1=12, n2=13, n3=14, n4=15, n5=5, n6=6, n7=7, n8=8;
      sm1=n1+n2+n3+n4;
      sm2=n5+n6+n7+n8;
      ma1=sm1/4;
      ma2=sm2/4;
      soma=ma1+ma2;
      System.out.println("O resultado da média aritmética dos números 12, 13, 14 e 15 é: "+ ma1);
      System.out.println("O resultado da média aritmética dos números 5, 6 ,7 e 8 é: "+ ma2);
      System.out.println("O resultado da soma das duas medias é: "+ soma);
    }
}
