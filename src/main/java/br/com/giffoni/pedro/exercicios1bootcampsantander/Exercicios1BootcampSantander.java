/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.exercicios1bootcampsantander;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Exercicios1BootcampSantander {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int opcao = 0;
        
        while (opcao != 5){
        
        System.out.println("--------------MENU--------------");
        System.out.println("Digite 1 para rodar o programa 1:");
        System.out.println("Digite 2 para rodar o programa 2:");
        System.out.println("Digite 3 para rodar o programa 3:");
        System.out.println("Digite 4 para rodar o programa 4:");
        System.out.println("Digite 5 para sair:");
        
        opcao = ler.nextInt();
        
        switch (opcao) {
            case 1:
                Exercicio1 ex1 = new Exercicio1();
                ex1.executarExercicio1();
                break;
            case 2:
                Exercicio2 ex2 = new Exercicio2();
                ex2.executarExercicio2();
                break;
            case 3:
                Exercicio3 ex3 = new Exercicio3();
                ex3.executarExercicio3();
                break;
            case 4:
                Exercicio4 ex4 = new Exercicio4();
                ex4.executarExercicio4();
                break;
            case 5:
                System.out.println("Encerrando programa!");
                break;
            default:
                System.out.println("Escolha uma opção válida!");
                break;
        }
    }
        ler.close();     
    }
}
