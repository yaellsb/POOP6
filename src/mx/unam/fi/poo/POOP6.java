/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.unam.fi.poo;

import pokemon.Pokemon;

/**
 *
 * @author yaelb
 */
public class POOP6 {

    /**
     * Método principal que inicializa la ejecución del programa.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        
        Pokemon poke = new Pokemon();
        poke.setNombre("Pikachu");
        poke.atacar();
        poke.curarse();
        poke.defender();
        poke.retirarse();
    }
    
}
