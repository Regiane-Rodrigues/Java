package com.mycompany.lojaconveniencia;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LojaConveniencia {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //declarando o atributo que serve para escolher a opção do menu, ainda sem solução para caso não seja int
        int escolha = 0;
        
        System.out.println("-----------------------------------------");
        System.out.println(" || Sistema Loja de Conveniêcnia ||");
        
        
       while(escolha < 1 || escolha >9){
        
             System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Venda");
            System.out.println("2 - Compra");
            System.out.println("3 - Estoque");
            System.out.println("4 - Produto");
            System.out.println("5 - Fiscal");
            System.out.println("6 - Financeiro");
            System.out.println("7 - Pessoa");
            System.out.println("8 - Banco");
            System.out.println("9 - Pagamento");
            System.out.println("-----------------------------------------");
        
                try{
                
                    escolha = Integer.parseInt(input.nextLine());
                    
                if(escolha < 1 || escolha > 9){
                
                    System.out.println("Opcão inválida. Escolha uma opção valida para continuar!");
                }
                }catch(NumberFormatException e){
                    System.out.println("Opcão inválida. Escolha uma opção valida para continuar!");
                 }
        }
            
                if(escolha == 1){
                
                    testeVenda();
                
                } else if(escolha == 2){
                    System.out.println("Test compra");
                } else {
                    
                    System.out.println("Obrigada por usar nosso sistema!");
                }
                
    } 
         public static void testeVenda() {
        
        Scanner ler = new Scanner(System.in);
        
        int escolha = -1;
        
        System.out.println("-----------------------------------------");
        System.out.println(" || Teste Menu Vendas ||");
        
        do {            
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Teste");
            System.out.println("0 - Sair");
            System.out.println("-----------------------------------------");
            escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Teste Venda");
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("erro");
                    break;
            }
        //aqui ele volta para o menu princial ao invés de encerrar o programa
        } while (escolha != 0);
    
        
         }
}     