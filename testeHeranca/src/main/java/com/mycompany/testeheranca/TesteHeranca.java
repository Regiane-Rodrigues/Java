/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeheranca;

import java.util.Scanner;

/**
 *
 * @author regiane.lima
 */
public class TesteHeranca {
    static Scanner inserir = new Scanner(System.in);
    public static void main(String[] args) {
       int escolhaMenu = -1;
       
       
        System.out.println("-----------------------------------------");
        System.out.println(" || Sistema Loja de Conveniêcnia ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Venda \n2 - Compra \n3 - Estoque \n4 - Produto \n5 - Fiscal \n6 - Financeiro \n7 - Pessoa \n8 - Banco \n9 - Pagamento \n0 - Sair");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenu = inserir.nextInt();

                switch (escolhaMenu) {
                    case 1:
                       adicionarPessoaFisica();
                        break;
                    case 0:
                        System.out.println("Obrigado Volte Sempre!");
                        break;
                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Favor informar outra opção.");
                inserir.next(); //favor não apagar garante que o menu não entre em loop infinito caso uma informação errada seja passada no scanner
            }
        } while (escolhaMenu != 0);
    }
    
    
    public static void adicionarPessoaFisica(){
     
        Pessoa pessoa = new PessoaFisica("bviabd", 1, "bjfjgv", 3, "sgjj", "dfgjg","ffgjf",13,1321, "1232165");
        pessoa.adicionarPessoa();
        
    
    }
   
    
 }

