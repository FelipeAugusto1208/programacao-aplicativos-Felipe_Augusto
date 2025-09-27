/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade07_felipe_augusto;
import java.util.Scanner;


/**
 *
 * @author FELIPE ROCHA
 */
public class Atividade07_Felipe_Augusto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner en = new Scanner (System.in);
        
         // Questao 1
        
//        int [][] m = new int [4][4];
//        for (int i=0; i < m.length; i++) {
//            for (int j=0; j <m[i].length; j++) {
//                System.out.print("Digite o "+i+", "+j+" numero da matriz: ");
//                m[i][j] = en.nextInt();
//            }
//        }
//        System.out.println("Matriz");
//        for (int i=0; i < m.length; i++) {
//            for (int j=0; j < m[i].length; j++) {
//                System.out.print(m[i][j] + ", ");
//            }
//            System.out.println();
//        }

        // Questao 2
        
//        int [] num = new int [8];
//        int maior = num[0];
//        for (int i=0; i < 8; i++) {
//            System.out.print("Digite o "+i+" numero: ");
//            num[i]= en.nextInt();
//        }
//        for (int i=0; i < 8; i++) {
//            if (num[i] > maior) {
//                maior = num[i];
//            }
//        }
//        System.out.println("O maior numero e: "+maior);

        // Questao 3
        
//        int [] vet1 = new int [5];
//        for (int i=0; i < 5; i++) {
//            System.out.print("Digite o "+i+" numero: ");
//            vet1[i]= en.nextInt();
//        }
//        System.out.println("Vet1");
//        for (int i=0; i < vet1.length; i++) {
//            System.out.print(vet1[i]+ ", ");
//        }
//        System.out.println();
//        int [] vet2 = vet1.clone();
//        System.out.println("Vet2");
//        for (int i=0; i < vet2.length; i++) {
//            System.out.print(vet2[i]+ ", ");
//        }

        // Questao 4
        
//        int [] array = new int [20];
//        int soma = 0;
//        int media = 0;
//        for (int i=0; i < array.length; i++) {
//            System.out.print("Digite o "+i+" numero: ");
//            array[i]= en.nextInt();
//        }
//        for (int i=0; i < array.length; i++) {
//            soma += array[i];
//        }
//        media = soma / array.length;
//        System.out.println("Numeros abaixo da media");
//        for (int i=0; i < array.length; i++) {
//            if (array[i] < media) {
//                System.out.println(array[i]);
//            }
//        }

        // Questao 5
        
        
//        String senha;
//        do {
//            System.out.print("Digite uma senha no min 8 digitos: ");
//            senha = en.nextLine();
//            if (senha.length()<8){
//                System.out.println("Falta caracter!");   
//            }else{
//                System.out.println("Senha valida!");
//            }
//        }while(senha.length()<8);
//

        // Questao 6
        
        
//        int vogal =0;
//        int cons =0;
//        String frase;
//        System.out.print("Digite uma frase desejada: ");
//        frase = en.nextLine();
//        for(int i = 0; i < frase.length();i++){
//            char c = frase.charAt(i);
//            
//            
//            if (Character.isLetter(c)){
//                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//                    vogal++;
//                }else{
//                    cons++;
//                }
//            }
//        }
//        System.out.println("Quantidade de vogais: " + vogal);
//        System.out.println("Quantidade de consoantes: " + cons);
//        
//        



        // Questao 7
        
//        int contador = 0;
//        int inicio = 0;
//        String texto;
//        String palavra;
//        
//        
//        System.out.print("Escreva um pequeno texto: ");
//        texto = en.nextLine();
//        
//        System.out.print("Digite a palavra que deseja procurar no texto: ");
//        palavra = en.nextLine();
//        
//        
//        while(true){
//            int pos = texto.indexOf(palavra,inicio);
//            if (pos ==  -1){
//                break;
//            }
//            contador++;
//            inicio = pos + 1;
//        }
//        if (contador ==0 ){
//            System.out.println("A palavra "+palavra+" nao foi encontrada!");
//        }else{
//            System.out.println("A palavra "+palavra+" apareceu "+contador+" vezes.");
//        }

        // Questao 8
        
//        String cadastrado,usuario;
//        int tentativas = 3;
//        System.out.print("Digite o nome para cadastro: ");
//        cadastrado = en.nextLine();
//        do {
//            System.out.print("Digite o nome de usuario para login: ");
//            usuario = en.nextLine();
//            if (cadastrado.equals(usuario)) {
//                tentativas = 0;
//                System.out.println("Acesso concedido");
//            }else {
//                if (tentativas > 1) {
//                    tentativas--;
//                    System.out.println("Acesso negado - tentativas restantes: "+tentativas);  
//                }
//                else {
//                    tentativas--;
//                    System.out.println("Conta bloqueado");
//                }
//            }
//        }while (tentativas > 0);

        
        
    }
    
}
