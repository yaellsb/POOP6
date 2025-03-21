/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 * Clase que construye a un objeto Pokemon.
 * @author yaelb
 */
public class Pokemon {
    private String color;
    private String nombre;
    private String especie;
    private int dificultad;
    private int size;
    /**
     * Constructor vacio de la clase Pokemon.
     */
    public Pokemon() {
    }
    /**
     * Constructor que inicializa todos los atributos de la clase Pokemon.
     * @param color color del pokemon
     * @param nombre nombre del pokemon
     * @param especie tipos de pokemon: agua, fuego, roca
     * @param dificultad dificultad para atrapar
     * @param size que tan grande es en cm
     */
    public Pokemon(String color, String nombre, String especie, int dificultad, int size) {
        this.color = color;
        this.nombre = nombre;
        this.especie = especie;
        this.dificultad = dificultad;
        this.size = size;
    }
    /**
     * Método que obtiene el color del pokemon
     * @return String que contiene el color del pokemon
     */
    public String getColor() {
        return color;
    }
    /**
     * Método que modifica el color del pokemon.
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método que obtiene el nombre del pokemon.
     * @return String que contiene el nombre del pokemon
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que modifica el nombre del pokemon.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que obtiene la especie del pokemon.
     * @return String que contiene la especie del pokemon
     */
    public String getEspecie() {
        return especie;
    }
    /**
     * Método que modifica la especie del pokemon.
     * @param especie [agua, fuego, roca]
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    /**
     * Método que obtiene la dificultad del pokemon.
     * @return Entero con el valor de la dificultad
     */
    public int getDificultad() {
        return dificultad;
    }
    /**
     * Método que modifica la dificultad de la especie.
     * @param dificultad [1-100]
     */
    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
        if (dificultad <= 0) {
            System.out.println("Dificultad invalida");
        } else if(dificultad>100) {
            System.out.println("Maximo superado:");
            this.dificultad = 100;
        }
    }
    /**
     * Método que obtiene el tamanio del pokemon.
     * @return Entero con el valor del tamanio
     */
    public int getSize() {
        return size;
    }
    /**
     * Método que modifica el tamanio del pokemon.
     * @param size [cm]
     */
    public void setSize(int size) {
        this.size = size;
    }
    /**
     * Método que imprime el mensaje para atacar.
     */
    public void atacar() {
        System.out.println("El pokemon "+nombre+" ha atacado");
    }
    /**
     * Método que imprime el mensaje para defender.
     */
    public void defender(){
        System.out.println("El pokemon "+nombre+" se ha defendido");
    }
    /**
     * Método que imprime el mensaje para curarse.
     */
    public void curarse() {
        System.out.println("El pokemon "+nombre+" se esta curando");
    }
    /**
     * Método que imprime el mensaje para retirarse.
     */
    public void retirarse() {
        System.out.println("El pokemon "+nombre+" se ha retirado");
    }
}
