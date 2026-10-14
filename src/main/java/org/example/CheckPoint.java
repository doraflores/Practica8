package org.example;

public class CheckPoint {
    private String nombre;
    private int posicionX;
    private int posicionY;
    private boolean activado;

    public CheckPoint(String nombre, int x, int y){
        this.nombre = nombre;
        this.posicionX = x;
        this.posicionY = y;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public boolean isActivado(){
        return activado;
    }

    public void activar(){
        activado = true;
    }
}
