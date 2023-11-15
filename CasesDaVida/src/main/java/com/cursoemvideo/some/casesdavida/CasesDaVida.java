package com.cursoemvideo.some.casesdavida;

import java.util.Scanner;

public class CasesDaVida {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o número de pernas desse animal: ");
        int pernas = leitor.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");
        switch(pernas) {
            case 1:
                tipo = "sacy";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 3:
                tipo = "triciclo";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6:
                tipo = "aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
}
