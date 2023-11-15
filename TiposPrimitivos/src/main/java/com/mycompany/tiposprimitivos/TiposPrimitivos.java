package com.mycompany.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
       /*
       float n1 = 10.5f;
       int n2 = 10;
       float x = n1+n2;
       System.out.println(x);
       */
       
       /*
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o nome do aluno: ");
       String nome = teclado.nextLine();
       System.out.println("Digite a nota do "+nome);
       Float nota = teclado.nextFloat();
       System.out.printf("a nota do %s é %.2f \n ",nome,nota);
       */
       
       int idade = 18;
       String valor = Integer.toString(idade);
       System.out.println(valor);
       int idadedois = Integer.parseInt(valor);
       
    }
}
