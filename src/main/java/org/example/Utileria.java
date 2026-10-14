package org.example;

public class Utileria implements ElementoDinamico{
    private String nombre;
    private String descripcion;
    private int posicionX;
    private int posicionY;

    public Utileria(String nombre, String descripcion, int x, int y){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.posicionX = x;
        this.posicionY = y;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void usar(){
        // ejecuta la accion del objeto
    }

    @Override
    public void mover(String direccion, int distancia) {
        // desplaza la utileria según dirección y distancia
    }
}
