package Programacion2;

import java.util.ArrayList;

public class Provincia {


    private String nombreProvincia;
    private ArrayList<Ciudad> ciudad;
    private ArrayList<Pais> limitaConPais;


    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public Provincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
}
