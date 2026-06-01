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
public class Exercicio3 {
    public void executarExercicio3() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Para calcular a area de um retangulo, primeiro escreva a base do retangulo: ");
        double base = input.nextDouble();
        System.out.println("Agora escreva a altura do retangulo: ");
        double altura = input.nextDouble();
        
        double area = base * altura;
        
        System.out.println("A area do retangulo com base " + base + " e altura " + altura + " é: " + area);
        
    }
}
