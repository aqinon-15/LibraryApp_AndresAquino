package org.ae.model;

/**
 *
 * @author Andres Aquino
 */
public class AutorLibro {
    private int idAutorLibro;
    private int idAutor;
    private String isbn;
    
    /**
     *
     */
    public AutorLibro() {
    }
    
    /**
     *
     * @param idAutorLibro damos los id o usuario de AutorLibro
     * @param idAutor damos los usuarios de autor
     * @param isbn damos los isbn osea sistema universal de enumeracion
     */
    public AutorLibro(int idAutorLibro, int idAutor, String isbn) {
        this.idAutorLibro = idAutorLibro;
                this.idAutor = idAutor;
                this.isbn = isbn;
    }
    
    /**
     *
     * @return pedimos los autor libro de get 
     */
    public int getIdAutorLibro() {
    return idAutorLibro;
}

    /**
     *se arreglo para subir nuevo commit
     * @param idAutorLibro damos los AutorLibro de set 
     */
    public void setIdAutorLibro(int idAutorLibro) {
    this.idAutorLibro = idAutorLibro;
}
    public int getIdAutor() {
    return idAutor;
}

public void setIdAutor(int idAutor) {
    this.idAutor = idAutor;
}

public String getIsbn() {
    return isbn;
}

public void setIsbn(String isbn) {
    this.isbn = isbn;
}

}