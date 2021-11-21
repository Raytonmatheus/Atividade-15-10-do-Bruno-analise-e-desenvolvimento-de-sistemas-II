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
public class atividade22 {
    public static void main (String [] args){
    int contador = 0;
	while(contador <= 19){
		contador++;
		if(contador%2==0){
			System.out.println("Par: " + contador);
                }
                else{
                    System.out.println("Ímpar: " + contador);
                }
    }
}
}