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
public class Exercicio1 {
    public void executarExercicio1(){
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("--------------------------");
        System.out.println("Exercicio 1: Programa que recebe o nome e o ano de nascimento e retorna nome e idade.");
        System.out.println("--------------------------");
        
        String nome;


        while (true) {
            System.out.println("Digite seu nome: ");
            nome = ler.nextLine();

            if (nome.matches("[a-zA-ZÀ-ÿ ]+")) {
            break;
                } else {
                System.out.println("Digite um nome válido (apenas letras).");
            }
        }
        
        int anoNascimento;
        int anoAtual = 2026;
        
        while (true) {
            System.out.println("Digite o ano do seu nascimento: ");
            String entrada = ler.nextLine();

    
            if (!entrada.matches("\\d+")) {
                System.out.println("Digite apenas números!");
                continue;
            }

            anoNascimento = Integer.parseInt(entrada);

    
            if (anoNascimento > 1900 && anoNascimento <= anoAtual) {
                break;
            } else {
                    System.out.println("Digite um ano válido!");
                }
        }
   
        System.out.println("Olá " + nome + ", você tem " + (anoAtual - anoNascimento) + " anos");
              
        
        System.out.println("--------------------------");
        System.out.println("Retornando ao menu...");
        System.out.println("--------------------------");
        System.out.println("");
        System.out.println("");
    }
}
