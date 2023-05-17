/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioredefinicao;

/**
 *
 * @author aluno
 */
public class ExercicioRedefinicao {

    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.fazerBarulho();
        
        animal = new Gato();
        animal.fazerBarulho();
        
    }
}
