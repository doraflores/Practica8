package org.example;

import java.util.List;

public class Nivel {
    private String nombre;
    private int numero;
    private String dificultad;
    private List<Obtaculo> obtaculos;
    private List<CheckPoint> checkPoints;
    private List<ElementoDinamico> elementoDinamicos;
    private Inventario inventario;

    public Nivel(String nombre, int numero, String dificultad, Inventario inventario){
        this.nombre = nombre;
        this.numero = numero;
        this.dificultad = dificultad;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void agregarObstaculo(List<Obtaculo> obtaculos){
        // añade un obstaculo al nivel
    }

    public void agregarCheckPoint(List<CheckPoint> checkPoints){
        // Añade un checkPoint al nivel
    }

    public void agregarElementoDinamico(List<ElementoDinamico> elementoDinamicos){
        // añade un elemento dinámico
    }

    public void moverElementosDinamicos(){
        // item sobre todos los elementos dinámicos e invoca
        // su método mover con parámetros aleatorios
    }

    public void mostrarEstado(){
        // muestra el estado actual del nivel
    }
}
