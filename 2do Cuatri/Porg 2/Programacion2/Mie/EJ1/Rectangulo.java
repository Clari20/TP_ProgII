package Programacion2;

public abstract class Rectangulo extends Cuadrilatero{
    public Rectangulo(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String nombre;
}
