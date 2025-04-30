package Programacion2;

import java.util.ArrayList;

public abstract class Poligono {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Poligono(String nombre) {
        this.nombre = nombre; //lo usa el hijo al cosntructor
    }

    protected String nombre;

    private ArrayList<Lado> TieneAlMenosTresLados;

}
