package com.cursoemvideo.some.anoemes;

import java.util.Scanner;

public class AnoEMes {

    public static void main(String[] args) {
    int ano = 2019;
    String resp = "s";
    while (resp.equals("s") || resp.equals("S")){
        
        String mes[] = {"jan","fev","mar","abr",
        "mai","jun","jul","ago","set","out","nov","dez"}; 
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        
        if(ano%4==0){dias[1] = 29;} 
        else {dias[1] = 28;}
        System.out.println("Estamos no ano " + ano);
        ano += 1;
        
        for(int c = 0; c<mes.length;c++) {
            System.out.println("O mês " + mes[c] + " tem " + dias[c] + " dias");
        }
        
    Scanner s = new Scanner(System.in);
    System.out.print("Quer continuar [S/N]? ");
    resp = s.next();
    
        }         
    }
}
