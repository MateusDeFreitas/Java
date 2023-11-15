
package com.cursoemvideo.some.testes;

import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        /*
        int n1, n2;
        n1 = 5;
        n2 = 6;
        boolean r;
        r = (n1>n2)?true:false;
        System.out.println(r);
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("A média é :"+m);
        if (m>9) {
            System.out.println("Parabéns");
        }
        */
        /*
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int nasc = t.nextInt();
        int i = 2023 - nasc;
        System.out.println("Sua idade é: "+i);
        if(i < 16) {
            System.out.println("Voto proibido.");
        } else if (i < 18 || i >= 60) {
            System.out.println("Voto opcional");
        } else {
            System.out.println("Voto obrigatório");
        }
        */
        int total = 0;
int c[] = new int[13];
for (int i = 0; i<c.length; i++) {
	c[i] = i + i;
}
for (int i = 0; i<c.length; i++) {
	total += c[i];
}
System.out.println(total);
        
        
        
        
        
    }
}
