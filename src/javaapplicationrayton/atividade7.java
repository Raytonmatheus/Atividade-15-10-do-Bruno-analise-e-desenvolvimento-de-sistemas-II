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
public class atividade7 {
    public static void main (String [] args){
        int somaimpar=0;
        long multpar=0;
        for (int i=0; i<=50; i++){
            if(i%2==0){
             multpar=multpar*i;                
            }
            else{
                somaimpar=somaimpar+i;
            }
        }
        System.out.println("A soma dos números ímpares entre 0 e 50 é: "+ somaimpar);
        System.out.println("A multiplicação dos números pares entre 0 e 50 é: "+ multpar);
        /*Para o resultado da multiplicação dos números pares serem diferentes de zero, é preciso alterar o valor de i=0 para i=1 e multpar=0 para multpar=1*/
    }
    
}
