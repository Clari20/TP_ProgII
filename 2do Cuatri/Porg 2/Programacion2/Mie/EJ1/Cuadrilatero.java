package Programacion2;

public abstract class Cuadrilatero extends Poligono{
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuadrilatero(String nombre) {
        super(nombre); //Tenes que hacer el cosntructor para traer el nombre
    }
    protected String nombre;
}
