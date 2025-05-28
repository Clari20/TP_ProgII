package org.example.model;



import java.time.LocalDate;
import java.util.Objects;

public class Libro {
    private Integer id;
    private String titulo;

    private LocalDate fechaPublicacion;
    private String genero;
    private Integer numeroPaginas;
    private String editorial;
    private String descripcion;
    private boolean disponible;

    // ID del autor (clave foránea)
    private Integer autorId;

    // Objeto Autor relacionado (para consultas con JOIN)
    private Autor autor;

    // Constructor vacío para mapeo desde base de datos







    public Libro(int id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo, Autor autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }



    public Libro(String titulo, LocalDate fechaPublicacion,
                 String genero, Integer numeroPaginas, String editorial,
                 String descripcion, Integer autorId) {

        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.autorId = autorId;
    }

    public Libro(int id, String titulo, Autor autor, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }


    // Getters y Setters con validaciones
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío");
        }
        this.titulo = titulo.trim();
    }




    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        if (fechaPublicacion != null && fechaPublicacion.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de publicación no puede ser futura");
        }
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero != null ? genero.trim() : null;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        if (numeroPaginas != null && numeroPaginas <= 0) {
            throw new IllegalArgumentException("El número de páginas debe ser positivo");
        }
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial != null ? editorial.trim() : null;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion != null ? descripcion.trim() : null;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getAutorId() {
        return autorId;
    }

    public void setAutorId(Integer autorId) {
        if (autorId == null || autorId <= 0) {
            throw new IllegalArgumentException("El ID del autor debe ser válido");
        }
        this.autorId = autorId;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
        if (autor != null && autor.getId() != null) {
            this.autorId = autor.getId();
        }
    }

    public boolean esValido() {
        return titulo != null && !titulo.trim().isEmpty() &&
                autorId != null && autorId > 0;
    }

    public void prestar() {
        if (!disponible) {
            throw new IllegalStateException("El libro ya está prestado");
        }
        this.disponible = false;
    }


    public void devolver() {
        if (disponible) {
            throw new IllegalStateException("El libro ya está disponible");
        }
        this.disponible = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Libro{id=" + id +
                ", titulo='" + titulo + '\'' +
                ", disponible=" + disponible +
                ", autor=" + (autor != null ? autor.getNombre() : "null") +
                '}';
    }

}
