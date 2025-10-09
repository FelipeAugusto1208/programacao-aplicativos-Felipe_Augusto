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
    //Questao 01
//    public int calculaDelta(int A, int B, int C) {
//        int calculo = (int) (Math.pow(B, 2) - (4 * A * C));
//        return calculo;
//    }
    
     //Questao 02
//    public int soma(int n1, int n2){;
//        return n1+n2;
//    }
//    public int sub(int y,int z){
//        return y-z;
//    }
//    public int mult(int a, int b){
//        return a*b;
//    }
//    public double div(double r,double c){
//        return r/c;
//    }
   
      //Questao 3.a
//        public String getMesPorExtenso(int mes){
//            String nomeMes;
//            switch (mes){
//                case 1:
//                    nomeMes= "Janeiro";
//                    break;
//                case 2:
//                    nomeMes= "Fevereiro";
//                    break;
//                case 3:
//                    nomeMes="Março";
//                    break;
//                case 4:
//                    nomeMes= "Abril";
//                    break;
//                case 5:
//                    nomeMes = "Maio";
//                    break;
//                case 6: 
//                    nomeMes = "Junho";
//                    break;
//                case 7:
//                    nomeMes ="Julho";
//                    break;
//                case 8:
//                    nomeMes = "Agosto";
//                    break;
//                case 9:
//                    nomeMes = "Setembro";
//                    break;
//                case 10:
//                    nomeMes = "Outubro";
//                    break;
//                case 11:
//                    nomeMes = "Novembro";
//                    break;
//                case 12:
//                    nomeMes = "Dezembro";
//                    break;
//                default:
//                    nomeMes ="Mes invalido";
//                  
//                   
//            }
//            return nomeMes;
//        }
        
    
        //Questao 3.b
//    public String getMesPorExtenso(int mes){
//        String[] meses={
//            "Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"
//                
//        };
//        if (mes >= 1 && mes <= 12){
//            return meses[mes - 1];
//        }else{
//            return "Mes invalido";
//        }
//    }
    
        //Questao 4
    
//        public double salario(){
//            Random dom = new Random();
//            
//            return 1000+(10000-1000) * dom.nextDouble();
//        }
//        public double media(int funcionarios){
//            double somaSalarial= 0;
//            
//            
//            for (int i = 0;i < funcionarios; ++i){
//                somaSalarial += salario();
//            }
//            return somaSalarial / funcionarios;
//        }    
        
    
        //Questao 5
//    public int posicaoMenor(double[] vetor){
//        double menor = vetor[0];
//        int pos = 0;
//        
//        for(int i=1; i<vetor.length; i++){
//            if(vetor[i] < menor){
//                menor = vetor[i];
//                pos = i;
//            }
//        }
//        return pos;
//    }
    
    //Questao 6
    
//    public int fibonacci (int num) {
//        int a = 0, b = 1, c;
//        System.out.print("Sequencia de Fibonacci: ");
//        for(int i=0; i<num; i++){
//            System.out.print(a + " ");
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        return a;
//    }
    
    //Questao 7
    
//    public  int nome(String[] nomes, String buscadonome){;
//        for(int i = 0; i <nomes.length; i++){
//            if(nomes[i].equalsIgnoreCase(buscadonome)){
//                return i;
//            }
//        }
//        return -1;
//    }
    
    
     //Questao 8
//        public String dog(String nome_pet, String raca, int idade, String nome_dono, String numero_contato) {
//        String dados = "pet\n";
//        dados += "Nome: " + nome_pet + "\n";
//        dados += "Raça: " + raca + "\n";
//        dados += "Idade: " + idade + "\n";
//        dados += "Nome do dono: " + nome_dono + "\n";
//        dados += "Contato: " + numero_contato;
//        return dados;
//    }
//
//    public String getServicoPorExtenso(int opcao) {
//        String serv;
//        switch (opcao) {
//            case 1:
//                serv = "Banho";
//                break;
//            case 2:
//                serv = "Tosa";
//                break;
//            case 3:
//                serv = "Banho e Tosa";
//                break;
//            case 4:
//                serv = "Consulta Veterinaria";
//                break;
//            default:
//                serv = "Opcao invalida";
//        }
//        return serv;
//    }
    
        //Questao 09
    
//     public String matric(String matricula, String nome, double not1, double trab){
//         String dados = "alunos\n";
//         dados += "Matricula: "+matricula+"\n";
//         dados += "Nome aluno: "+nome+"\n";
//         dados += "Nota da primeira prova: "+not1+"\n";
//         dados += "Nota do trabalho: "+trab+"\n";
//         return dados;
//     } 
//     public double media(double not1, double trab){
//         double mediana = (not1 + trab)/2;
//         return mediana;
//     }
    
    
    // Questao 10
    
//    public static class Gabarito{
//        public char respostaQuestao(int numeroQuestao){
//            char respostas[] = {'A', 'C', 'D', 'A', 'A', 'B', 'C', 'D', 'B', 'E', 'A', 'B', 'A', 'C', 'C'};
//            return respostas[numeroQuestao -1];
//        }
//    }
//    
//    public static class Prova {
//        Gabarito gabarito;
//        char respostaAluno[] = new char [15];
//        int i = 0;
//        
//        public Prova (Gabarito g) {
//            this.gabarito = g;
//        }
//        
//        public void respostaAluno(char resposta) {
//            if (i < 15) {
//                respostaAluno[i] =  resposta;
//                i++;
//            }
//        }
//        
//        public int acertos () {
//            int cont = 0;
//            for (int i = 0; i < 15; i++) {
//                if (respostaAluno[i] == gabarito.respostaQuestao(i+1)) {
//                    cont++;
//                }
//            }
//            return cont;
//        }
//        
//        public double nota () {
//            double total = 0;
//            for (int i = 0; i < 15; i++) {
//                if (respostaAluno[i] == gabarito.respostaQuestao(i + 1)) {
//                    if (i < 10) {
//                        total += 0.5;
//                    }
//                    else {
//                        total += 1;
//                    }
//                }
//            }
//            return total;
//        }
//        
//        public double maior(Prova outra) {
//            int acertos1 = this.acertos();
//            int acertos2 = outra.acertos();
//            double nota1 = this.nota();
//            double nota2 = outra.nota();
//            
//            if (acertos2 > acertos1) {
//                return outra.nota();
//            }
//            else {
//                if (acertos2 < acertos1){
//                    return this.nota();    
//                }
//                else {
//                    if (nota2 > nota1) {
//                        return outra.nota();
//                    }
//                    else {
//                        if (nota2 < nota1) {
//                            return this.nota();
//                        }
//                        else {
//                            return Math.max(nota1, nota2);
//                        }
//                    }
//                }
//            }
//        }
//    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner en = new Scanner (System.in);
    
        // TODO code application logic here
        //Questao 01
//        Atividade08_Alexandre_Henrich equacao = new Atividade08_Alexandre_Henrich(); 
//        System.out.print("Dada a equacao de 2° grau -3x²+4x-2=0.\nQual o resultado para x1 e x2?\n");
//        int D = equacao.calculaDelta(-3, 4, -2);
//        double x1 = (-4 + Math.sqrt(D)) / (2 * -3);
//        double x2 = (-4 - Math.sqrt(D)) / (2 * -3);
//        System.out.print("x1 = " + x1 + "\n");
//        System.out.print("x2 = " + x2 + "\n");
//        System.out.print("Alexandre");


        //Questao 02
//        Scanner en = new Scanner(System.in);
//        System.out.println("Calcular \n1-soma\n2-subtracao\n3-multiplicacao\n4-divisao");
//        int opcao,num1,num2;
//        System.out.print("Escolha uma opcao:");
//        opcao = en.nextInt();
//        double resultado;
//        Atividade08_Alexandre_Henrich calculadora = new Atividade08_Alexandre_Henrich();
//        
//        switch (opcao){
//        
//            case 1:
//                System.out.print("Digite 1 numero inteiro:");
//                num1= en.nextInt();
//                System.out.print("Digite outro numero inteiro:");
//                num2 = en.nextInt();
//                resultado = calculadora.soma(num1,num2);
//                System.out.printf("A soma de %d e %d e %.2f",num1,num2,resultado);
//                break;
//            case 2:
//                System.out.print("Digite 1 numero inteiro:");
//                num1= en.nextInt();
//                System.out.print("Digite outro numero inteiro:");
//                num2 = en.nextInt();
//                resultado = calculadora.sub(num1,num2);
//                System.out.printf("A Subtracao de %d e %d e %.2f",num1,num2,resultado);
//                break;
//            case 3:
//                System.out.print("Digite 1 numero inteiro:");
//                num1= en.nextInt();
//                System.out.print("Digite outro numero inteiro:");
//                num2 = en.nextInt();
//                resultado = calculadora.mult(num1,num2);
//                System.out.printf("A multiplicacao de %d e %d e %.2f",num1,num2,resultado);
//                break;
//            case 4:
//                System.out.print("Digite 1 numero inteiro:");
//                num1= en.nextInt();
//                System.out.print("Digite outro numero inteiro:");
//                num2 = en.nextInt();
//                resultado = calculadora.div(num1,num2);
//                System.out.printf("A divisao de %d e %d e %.2f",num1,num2,resultado);
//                break;
//        }

        //Questao 3.a
//        Atividade08_Alexandre_Henrich mesPorExtenso = new Atividade08_Alexandre_Henrich();
//        System.out.print("Digite um numero de (1 a 12): ");
//        int mes= en.nextInt();
//        System.out.print("O mes é"+mesPorExtenso.getMesPorExtenso(mes));

        //Questao 3.b
//        Atividade08_Alexandre_Henrich mesPorExtenso = new Atividade08_Alexandre_Henrich();
//        int mes;
//        System.out.print("Digite um numero referente a um mes: ");
//        mes = en.nextInt();
//        System.out.print("O mes e: "+mesPorExtenso.getMesPorExtenso(mes));



        //Questao 4
//        Atividade08_Alexandre_Henrich calc = new Atividade08_Alexandre_Henrich();
//        System.out.print("Quantos funcionarios estao na empresa (1 a 50)? ");
//        int fun= en.nextInt();
//        double mediaSalarial = calc.media(fun);
//        System.out.printf("A media salarial de "+fun+" e de :R$%.2f",mediaSalarial);
//       



        //Questao 5
        
//        double pesos[] = new double[10];
//
//        for(int i=0; i<10; i++){
//            System.out.print("Digite o peso da posicao "+i+": ");
//            pesos[i] = en.nextDouble();
//        }
//        
//        Atividade08_Alexandre_Henrich obj = new Atividade08_Alexandre_Henrich();
//        int posicao = obj.posicaoMenor(pesos);
//        System.out.println("O menor peso e "+pesos[posicao]+" e esta na posicao "+posicao);



        //Questao 6
        
//        System.out.print("Digite a quantidade de termos da sequencia de Fibonacci: ");
//        int num = en.nextInt();
//        Atividade08_Alexandre_Henrich obj = new Atividade08_Alexandre_Henrich ();
//        obj.fibonacci(num);




//        Questao 7
//        Atividade08_Alexandre_Henrich name = new Atividade08_Alexandre_Henrich();
//        String[] nomes = new String [10];
//        System.out.print("Digite 10 nomes: ");
//        for(int i = 0;i < 10;i++){
//            nomes[i] = en.nextLine();
//                
//        }
//        System.out.print("DIgite o nome que deseja buscar:");
//        String buscadonome = en.nextLine();
//        
//        int indice = name.nome(nomes,buscadonome);
//        
//        if (indice != -1){
//            System.out.print("Nome encontrado na posicao: "+indice);
//        }else{
//            System.out.print("Nome  nao encontrado");
//        }



        //Questao 8
        
//        Atividade08Alexandre_Henrich obj = new Atividade08Alexandre_Henrich();
//
//        System.out.print("=== Cadastro pet Shop Amigo Fiel ===\n\n");
//
//        System.out.print("Digite o nome do pet: ");
//        String nome_pet = en.nextLine();
//
//        System.out.print("Qual a raca do seu pet: ");
//        String raca = en.nextLine();
//
//        System.out.print("Digite a idade do pet: ");
//        int idade = en.nextInt();
//        en.nextLine();
//
//        System.out.print("Digite o nome do dono: ");
//        String nome_dono = en.nextLine();
//
//        System.out.print("Digite o contato do dono: ");
//        String numero_contato = en.nextLine();
//
//        System.out.print("=== Menu de Servicos ===\n1.Banho\n2.Tosa\n3.Banho e Tosa\n4.Consulta Veterinaria\nEscolha o procedimento desejado: ");
//        int servs = en.nextInt();
//        en.nextLine(); 
//
//        String servico = obj.getServicoPorExtenso(servs);
//
//        System.out.print("=========================\nFICHA DE ATENDIMENTO - AMIGO FIEL\n=========================\n");
//        System.out.print("Nome do pet: " + nome_pet + "\nRaça: " + raca + "\nIdade: " + idade + "\nDono(a): " + nome_dono + "\nContato: " + numero_contato + "\n");
//        System.out.print("-------------------------\n");
//        System.out.print("Procedimento: " + servico + "\n");
//
//        en.close(); 



        //Questao 09
//    Atividade08Alexandre_Henrich obj = new Atividade08Alexandre_Henrich();
//
//        System.out.print("================================\nDados do aluno\n================================\n");
//
//        System.out.print("Digite a matrícula do aluno: ");
//        String matricula = en.nextLine();
//
//        System.out.print("Digite o nome do aluno: ");
//        String nome = en.nextLine();
//        
//        double not1;
//        do {
//             System.out.print("Digite a nota correspondente à prova avaliação (0 a 5): ");
//             not1 = en.nextDouble();
//             if (not1 < 0 || not1 > 5){
//            System.out.print("Digite a nota que seja correspondenete entre (0 e 5)!");
//            }
//        }while(not1 < 0 || not1 > 5);
//            
//        
//        double trab;
//         do {
//             System.out.println("Digite a nota correspondente ao trabalho (0 a 5): ");
//             trab = en.nextDouble();
//             if (trab < 0 || trab > 5){
//            System.out.print("Digite a nota que seja correspondenete entre (0 e 5)!");
//            }
//        }while(trab < 0 || trab > 5);
//        
//
//        System.out.print("================================\n");
//
//        String resultado = obj.matric(matricula, nome, not1,trab);
//        System.out.print(resultado);
//
//        double mediaProvas = obj.media(not1, trab);
//        System.out.print("Média das notas : " + mediaProvas+" \n");
//        if(mediaProvas < 2.7){
//            System.out.print("0");
//        }else{
//            System.out.print("Parabens voce consguiu passar pra proxima fase!");
//        }
//    
    
    // Questao 10
    
//      Gabarito g = new Gabarito();
//        Prova p1 = new Prova(g);
//        Prova p2 = new Prova(g);
//        
//        System.out.println("\n===== Aluno 1 =====\n");
//        for (int i = 0; i < 15; i++) {
//            System.out.print("Digite uma resposta para questao "+(i+1)+": ");
//            char rp = en.next().charAt(0);
//            p1.respostaAluno(rp);
//        }
//        
//        System.out.println("\n===== Aluno 2 =====\n");
//        for (int i = 0; i < 15; i++) {
//            System.out.print("Digite uma resposta para questao "+(i+1)+": ");
//            char rp = en.next().charAt(0);
//            p2.respostaAluno(rp);
//        }
//        System.out.println("\nAluno 1 acertou: " + p1.acertos());
//        System.out.println("Nota do aluno 1: " + p1.nota());
//        System.out.println("\nAluno 2 acertou: " + p2.acertos());
//        System.out.println("Nota do aluno 2: " + p2.nota());
//        System.out.println("\nMaior nota entre os dois: " + p1.maior(p2));
        
        
    }
}



        