/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.animal;

/**
 *
 * @author aluno
 */


public class Animal {
        
   
        public String nome;
        public String tipo;
        public String cor;
        public char sexo;
        public int idade;
        
    void latir(){
    
        if(idade > 7)
            System.out.println("Woof, woof");
        else if (idade > 4)
            System.out.println("Ruff, ruff");
        else
            System.out.println("Ypi, Ypi");
    
    }
       
}


