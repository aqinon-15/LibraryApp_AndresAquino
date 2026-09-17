package org.ae.model;

public class AutorLibro {
    private int idAutorLibro;
    private int idAutor;
    private String isbn;
    
    public AutorLibro() {
    }
    
    public AutorLibro(int idAutorLibro, int idAutor, String isbn) {
        this.idAutorLibro = idAutorLibro;
                this.idAutor = idAutor;
                this.isbn = isbn;
    }
    
public int getIdAutorLibro() {
    return idAutorLibro;
}

public void setIdAutorLibro(int idAutorLibro) {
    this.idAutorLibro = idAutorLibro;
}

