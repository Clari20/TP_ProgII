package Programacion2;

import java.util.ArrayList;

public class Figura {



        private String nombreFigura;
        private ArrayList<Poligono> EsUnPoligono;
        private ArrayList<Elipse> EsUnElipse;

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
}
