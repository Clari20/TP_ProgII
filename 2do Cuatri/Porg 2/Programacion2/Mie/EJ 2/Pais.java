package Programacion2;

import java.util.ArrayList;

public class Pais {

    private String nombrePais;
    private ArrayList<Pais> LimitaConOtro;
    private ArrayList<Provincia> tieneProvincia;

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }


    }

