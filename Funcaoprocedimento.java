
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.funcaoprocedimento;

/**
 *
 * @author aluno
 */


import java.util.Scanner;

import java.io.InputStream;

public class Funcaoprocedimento {

    public static void main(String[] args) {
         double v = 0, vp, lcubo, vc, altura, largura, comprimento;
        Scanner dado;
         dado = new Scanner(System.in);
         int opcao;
         

        do{
            menu();
           System.out.println("escolha uma opção");
           opcao = dado.nextInt();
             
          switch (opcao){
  
          
              
            case 1 ->{
            System.out.println("Digite o lado do cubo");
            lcubo = dado.nextDouble();
            vc = volumeCubo(lcubo);
            System.out.println("O volume cubo de lado " + lcubo + "é:" + v +".");
            }
            case 2 ->{
            System.out.println("Digite as dimensões do paralelepípedo altura, largura e comprimento):");
            System.out.println("Altura");
            altura = dado.nextDouble();
            System.out.println("Largura");
            largura = dado.nextDouble();
            System.out.println("Comprimento");
            comprimento = dado.nextDouble();
            vp = altura*largura*comprimento;
           System.out.println("Volume do paralelepipedo é:" + vp);     
            }
            case 0->{
            System.out.println("Fim do progama.");
            }
            default->
            System.out.println("Opção inválida"); 
            }
        }while(opcao!=0);
            
    }
   public static void menu(){
                System.out.println("(1) Calcular o volume do cubo.");
                System.out.println("(2) Calcular o volume do paralelepípedo.");
                System.out.println("(0) Sair."); 
              
}

    private static double volumeCubo(double lcubo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
