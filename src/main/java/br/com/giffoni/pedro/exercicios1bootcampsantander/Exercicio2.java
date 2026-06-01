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
public class Exercicio2 {
    public void executarExercicio2(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva o tamanho do lado de um quadrado pra saber a sua área total: ");
        double lado = input.nextDouble();
        
        double area = lado * lado;
        
        System.out.println("A area do quadrado de lado " + lado + ", é: " + area);
    }
    
}
