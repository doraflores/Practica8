package org.example;

public class Personaje implements Destruible, ElementoDinamico{
    private String nombre;
    private int vida;
    private int posicionX;
    private int posicionY;

    public Personaje(String nombre, int vida, int x, int y){
        this.nombre = nombre;
        this.vida = vida;
        this.posicionX = x;
        this.posicionY = y;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public void recibirDano(int dano){
        // reduce vida segun dño rcibido
    }

    @Override
    public void mover(String direccion, int distancia) {
        // mueve el personaje según dirección(norte, sur, este, oeste) y distanci
    }

    @Override
    public void destruye() {
        // metodo que ejecuta la logica de destruccion del elemento
    }
}
