/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeheranca;
//import java.util.Scanner;

/**
 *
 * @author regiane.lima
 */
public class PessoaFisica extends Pessoa{
   // Scanner ler = new Scanner(System.in);   
    private int cpf;
    private String dataNascimento;

    public PessoaFisica(String nomeCompleto, int telefone, String email, int cep, String cidade, String estado,String rua, int numeroLocal,int cpf, String dataNascimento) {
        super(nomeCompleto, telefone, email, cep, cidade, estado, rua, numeroLocal);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public void adicionarPessoa(){
    
        System.out.println("Nome Completo: ");
        nomeCompleto = ler.nextLine();
        
        System.out.println("Telefone: ");
        telefone = ler.nextInt();
        
        System.out.println("Email: ");
        email = ler.nextLine();
        
        System.out.println("CEP: ");
        cep = ler.nextInt();
        
        System.out.println("Estado: ");
        estado = ler.nextLine();
        
        System.out.println("Cidade: ");
        cidade = ler.nextLine();
        
        System.out.println("Rua: ");
        rua = ler.nextLine();
        
        System.out.println("Numero: ");
        numeroLocal = ler.nextInt();
        
        System.out.println("Cpf: ");
        cpf = ler.nextInt();
        
        System.out.println("Data Nascimento: ");
        dataNascimento = ler.nextLine();
        
        
    }
   
}
