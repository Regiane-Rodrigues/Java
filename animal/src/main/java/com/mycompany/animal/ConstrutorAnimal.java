/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

public class ConstrutorAnimal {

    private String nomeAnimal;
    private String corAnimal;
    private String tipoAnimal;    
    private int idadeAnimal;
    private char sexoAnimal;
      
    public ConstrutorAnimal(String nome, String cor, String tipo, int idade, char sexo) {

        nomeAnimal = nome;
        corAnimal = cor;
        tipoAnimal = tipo;
        idadeAnimal = idade;
        sexoAnimal = sexo;
    }

    public String getNome() {

        return "Nome do Animal: " + nomeAnimal;

    }
    
    //
    
    public String getIdade() {

        return "Idade do Animal: " + idadeAnimal;

    }
    
    
    public String getCor() {

        return "Cor do Animal: " + corAnimal;

    }
    
    public String getTipo() {

        return "Tipo do Animal: " + tipoAnimal;

    }
    
    public String getSexo() {

        return "Sexo do Animal: " + sexoAnimal;

    }

    

    }


