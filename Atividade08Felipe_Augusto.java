/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade08.alexandre_henrich;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
/**
 *
 * @author Aluno
 */
public class Atividade08Alexandre_Henrich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner en = new Scanner(System.in);
        Random rand = new Random();
        
        String[] tipo = new String[10];
        double[] valor = new double[10];
        int operacoes = 0, posicao = 0;
        
        double saldo = 100.00,deposito,dolar = 0;
        String sair = "N",retorna = "N";
        int menu,vezes,protocol;
        double salario,emp,parcelas,total;
        double calc,calc2,calc3;    
       
        do{
            System.out.println("\n====CAIXA RAPIDO====\n");
            System.out.print("1.Saldo \n2.Deposito \n3.Extrato Bancario \n4.Empresimo \n5.Comprar Dolar \n0.Sair \nDigite o que deseja fazer: ");
            menu = en.nextInt();
            retorna = "N";
            
           switch (menu){
               
               case 1:
                   System.out.println("\n== SALDO DA SUA CONTA ==\n");
                   System.out.println("Saldo em reais: R$ "+saldo+"\nSaldo em dolar: U$ "+dolar);
                   en.nextLine();
                   break;
                   
               case 2:
                   System.out.println("\n== DEPOSITO DA SUA CONTA ==\n");
                   do {
                       System.out.print("Informe o valor do deposito (R$):  ");
                   deposito = en.nextDouble();
                   if (deposito < 1 || deposito > 4999.99) {
                       System.out.println("!!!Valor invalido!!! \nO deposito deve ser maior que R$ 0,00 e ate R$ 5.000,00. Digite novamente.");
                       
                   }} while (deposito < 1 || deposito > 4999.99);
                   
                   saldo += deposito;
                   System.out.println("Deposito realizado com sucesso!");
                   
                   tipo[posicao] = "Deposito + "+deposito;
                   valor[posicao] = deposito;
                   posicao = (posicao + 1) % 10;
                   if (operacoes < 10) operacoes++;
                   
                   en.nextLine();
                   break;
                   
               case 3:
                  
                   
                   System.out.println("\n== EXTRATO BANCARIO ==\n");
                    if (operacoes == 0) {
                        System.out.println("Nenhuma extrato");
                    }
                    else {
                        System.out.println("Ultimas 10 movimentacoes:\n");
                        int indice = (posicao - operacoes + 10) % 10;
                        for (int i = 0; i < operacoes; i++) {
                            int atual = (indice + i) % 10;
                            System.out.println("\n "+(i + 1)+") "+tipo[i]+" ");
                        }
                    }
                        
                   en.nextLine();
                   break;
                   
                   
                   
                   
                   
                   
               case 4:
                   
                   
                   System.out.println("\n===Emprestimo===\n");
                   
                   do{
                       System.out.print("Informe o valor do emprestimo (R$): ");
                       emp = en.nextDouble();
                       if (emp < 200 || emp > 100000) {
                           System.out.println("Insira um valor de empresimo de R$ 200,00 a R$ 100.000,00\n");
                       }
                   }while (emp < 200 || emp > 100000);
                   
                   System.out.print("Informe o seu salario bruto (R$):  ");
                   salario = en.nextDouble();
                   
                   do{
                     System.out.print("Quantidade de parcelas (6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72x): ");
                     vezes = en.nextInt();
                     System.out.print("\n");
                     if (vezes != 6 && vezes != 12 && vezes != 18 && vezes != 24 && vezes !=30 && vezes != 36 && vezes != 40 && vezes != 48 && vezes != 56 && vezes != 60 && vezes !=72 ) {
                         System.out.println("Insira uma quantidade de parcela valida.\n");
                     }
                   }while (vezes != 6 && vezes != 12 && vezes != 18 && vezes != 24 && vezes !=30 && vezes != 36 && vezes != 40 && vezes != 48 && vezes != 56 && vezes != 60 && vezes !=72 );

                   
                   calc = (salario * 30)/100;
                   calc2 = (emp * 2)/100;
                   total = calc2 + emp;
                   calc += calc2;
                   calc3 = emp/vezes;
                   protocol = rand.nextInt(99999);
                   if (calc <= calc3){
                       System.out.print("Valor da parcela: R$ "+calc3+"\nValor do emprestimo: R$ "+emp+"\nValor total do emprestimo a ser pago: R$ "+total+"\nEmprestimo indisponivel! O valor da parcela nao pode ultrapassar o valor de R$ "+calc+"\n");
                   }else{
                       System.out.print("Valor da parcela: R$ "+calc3+" x "+vezes+"\nValor do emprestimo: R$ "+emp+"\nValor total do emprestimo a ser pago: R$ "+total+"\n\nEmprestimo disponivel! \nEntre em contato com a central e informe o numero de protocolo EM"+protocol+".");
                   }
                   en.nextLine();
                   break;
                   
                   
                   
               case 5:
                   String resposta;
                   double calc4,quant;
                   
                   
                   do {
                       retorna = "N";
                       System.out.println("\n=== COMPRAR DOLAR ===\n");
                   System.out.println("Seu saldo bancario e de R$"+saldo);
                   System.out.print("Quantos dolares deseja comprar (US$)?  ");
                   quant = en.nextDouble();                  
                   calc4 = quant*5.32;
                   en.nextLine();
                   if (calc4 > saldo) {
                       System.out.println("Custo em Reais: R$ "+calc4+"\nSeu saldo atual e insuficiente.");
                       System.out.print("Deseja simular novamente(R), voltar ao menu(V) ou encerrar o programa (E)? ");
                       retorna = en.nextLine();

                   }
                   else {
                       System.out.print("Custo em Reais: R$ "+calc4+"\nConfirma compra? (S/N): ");
                       resposta = en.nextLine();                   
                   
                   if (resposta.equalsIgnoreCase("S")) {
                       saldo -= calc4;
                       dolar += quant;
                       System.out.println("\nCompra realizada com sucesso. \nNovo saldo: \n-Reais: R$ "+saldo+"\n-Dolares: US$ "+quant);
                   }
                   else {
                       if (resposta.equalsIgnoreCase("N")) {
                       System.out.print("Deseja simular novamente(R), voltar ao menu(V) ou encerrar o programa (E)? ");
                       retorna = en.nextLine();
                       
                   }    
                   }
                   }
                   
                   }while (retorna.equalsIgnoreCase("R"));
                   
                   tipo[posicao] = "Compra de Dolar - R$ "+calc4+" | + US$ "+quant;
                   posicao = (posicao + 1) % 10;
                   if (operacoes < 10) operacoes++;
                   
                   
                   break;
                   
                    
                case 0:
                    System.out.println("Encerrando programa");
                    sair = "S";
                    break;
                
                default:
                    
                    System.out.println("Opção inválida, tente novamente.");
           }
           
           
           do{
               if (sair.equalsIgnoreCase("S") || retorna.equalsIgnoreCase("E")) {
           sair = "S";}
           else {if (retorna.equalsIgnoreCase("V")) {}
           else {
               System.out.print("\nDeseja retorna ao menu inicial (V) ou encerrar o programa (E): ");
               retorna = en.nextLine();
               if (retorna.equalsIgnoreCase("E")) {
               System.out.println("Encerrando programa");
               sair = "S"; 
               }    
               else { if (retorna.equalsIgnoreCase("V")) {}
               else {System.out.println("Opcao invalida.");}
               }}} 
           } while (!sair.equalsIgnoreCase("S") && !retorna.equalsIgnoreCase("V"));
           
               
        }while (!sair.equalsIgnoreCase("S"));
        
    }
    
}



        