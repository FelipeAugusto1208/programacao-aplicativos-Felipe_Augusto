/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade06_felipe_augusto;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade06_Felipe_Augusto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        
        // Questao 1
        
//        double nota;
//        do {
//        System.out.print("Digite uma nota: ");
//        nota = entrada.nextDouble();
//        if (nota < 0 || nota > 10) {
//        System.out.println("Erro: Nota invalida, tente novamente");}}
//        while (nota < 0 || nota > 10);
//        System.out.println("Nota valida: "+nota);
        
        // Questao 2
        
//        int num,soma,quantidade;
//        double media = 0.0;
//        soma = 0;
//        quantidade = 0;
//        do {
//        System.out.print("0 para sair \nDigite um numero: ");
//        num = entrada.nextInt();
//        if (num != 0) {
//        soma += num;
//        quantidade++;}}
//        while (num != 0);
//        if (quantidade > 0) {
//        media = soma / quantidade;
//        System.out.println("Soma: "+soma);
//        System.out.println("Quantidade: "+quantidade);
//        System.out.println("Media: "+media);}
//        else {
//        System.out.println("Nenhum numero valido foi digitado");}
        
        // Questao 3
        
//        int chute,tentativa;
//        tentativa = 0;
//        chute = 0;
//        int num_chute =(int)(Math.random()*100)+1;
//        System.out.println("Tente acertar o numero de 1 a 100");
//        do {
//        System.out.print("De seu chute: ");
//        chute = entrada.nextInt();
//        tentativa++;
//        if (chute < 1 || chute > 100) {
//        System.out.println("Numero fora do intervalo de 1 a 100");
//        } else {
//        if (chute < num_chute) {
//        System.out.println("Palpite: "+chute+"\nMuito baixo");
//        } else {
//        if (chute > num_chute) {
//        System.out.println("Palpite: "+chute+"\nMuito alto");
//        } else {
//        System.out.println("Acertou em "+tentativa+" tentativas");
//        }}}}
//        while (chute != num_chute);

        // Questao 4
        
//        int n;
//        String op = null;
//        do{
//        do{
//        System.out.print("Digite um numero inteiro: ");
//        n = entrada.nextInt();
//        if (n <= 0) {
//        System.out.println("Numero invalido");
//        }}
//        while (n <= 0);
//        for (int i =0; i < n; i++){
//        System.out.println(n-i);
//        }
//        entrada.nextLine();
//        System.out.print("Digite S para repetir ou N para sair: ");
//        op = entrada.nextLine();
//        }
//        while (op.equalsIgnoreCase("S"));

        // Questao 5
        
//        String senha = "senai123";
//        String chute;
//        int tentativa = 3;
//        do{
//        System.out.print("Senha: ");
//        chute = entrada.nextLine();
//        if (!senha.equals(chute)) {
//            tentativa--;
//            System.out.println("Incorreta.Tentativas restantes: "+tentativa);
//        }else {
//            System.out.println("Acesso concedido");
//        }}while (tentativa > 0 && !senha.equals(chute));
        
        // Questao 6
        
//        int num;
//        
//        System.out.print("Digite um numero que deseja ver a tabada: ");
//        num = entrada.nextInt();
//      
//        System.out.println("A tabuada a seguir vai ser do numero: "+num);
//        for(int i = 1 ;i<=10;i++) {
//            System.out.println(num+"x"+i+"="+(num*i));}
//        
        
     
          //Questao 7
          
//          int num;
//          int par = 0;
//          int impar = 0;
//          
//          System.out.print("Digite um numero: ");
//          num = entrada.nextInt();
//          for (int i = 1; i<=num; i++){
//              if (i % 2 == 0){
//                  par += i;
//              }else{
//                  impar += i;
//              }
//          }
//            System.out.println("A soma dos valores pares: "+par);
//            System.out.println("A soma dos valores impares: "+impar);
//
        
        // Questao 8 
        
//        int n;
//        System.out.print("Digite um numero maior que 1: ");
//        n = entrada.nextInt();
//        if(n <= 1){
//            System.out.print("Numero invalido");
//        }else{
//            for (int i = 2; i <= n; i++){
//                boolean primo = true;
//                for(int k = 2; k*k <= i;k++){
//                    if (i % k == 0){
//                        primo = false;
//                        break;
//                    }
//                }
//                if (primo == true);
//                System.out.print(i+" ,");
//            }
//        }

    }
    
}
