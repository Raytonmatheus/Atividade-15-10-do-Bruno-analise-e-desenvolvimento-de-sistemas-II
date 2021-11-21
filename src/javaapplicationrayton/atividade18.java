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
public class atividade18 {
    public static void main (String [] args){
        Scanner  sc = new  Scanner(System.in);
        float espaco, horas, vm;
        System.out.println( "Digite o espaço que o carro percorreu em km (utilizando vírgula): ");
        espaco=sc.nextFloat();
        System.out.println( "Digite o tempo em que o veículo ficou em moviemnto em horas (utilizando vírgula): ");
        horas=sc.nextFloat();
        
       vm=espaco/horas;
       System.out.println("A velocidade média do veículo neste percurso foi: "+vm+" km/h");              
        }
    }
