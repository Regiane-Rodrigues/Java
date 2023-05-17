/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeheranca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author regiane.lima
 */
public class Pessoa {
    private static int contador = 0;
    
    Scanner ler = new Scanner(System.in);
    
    public String nomeCompleto;
    public int telefone;
    public String email;
    public int cep;
    public String estado;
    public String cidade;
    public String rua;
    public int numeroLocal;
    public int idPessoa;
    
    public  Pessoa(String nomeCompleto, int telefone, String email, int cep, String cidade, String estado,String rua, int numeroLocal){
    
        this.nomeCompleto = nomeCompleto;
       this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numeroLocal = numeroLocal;
        this.idPessoa = ++contador;
        
    }

    
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
        
        }
    
 
    
    
    public void editar(){
        
        
        
    }
    
    public void excluir(){
    }
    
    public void listar(){
    
    
    
    
    }
    
}

   
   
