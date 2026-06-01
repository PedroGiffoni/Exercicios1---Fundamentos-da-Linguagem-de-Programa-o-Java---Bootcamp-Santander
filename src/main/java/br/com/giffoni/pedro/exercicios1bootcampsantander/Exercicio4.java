/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giffoni.pedro.exercicios1bootcampsantander;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Exercicio4 {
    public void executarExercicio4(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Para saber a diferença de idade entre duas pessoas, primeiramente escreva o nome da pessoa 1: ");
        String nome1 = input.next();
        System.out.println("Agora escreva a idade da pessoa 1: ");
        int idade1 = input.nextInt();
        System.out.println("Escreva o nome da pessoa 2: ");
        String nome2 = input.next();
        System.out.println("Agora escreva a idade da pessoa 2: ");
        int idade2 = input.nextInt();
        int diferencaIdade = Math.abs(idade1 - idade2);
        
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de: " + diferencaIdade + " anos!");
      
    }
}
