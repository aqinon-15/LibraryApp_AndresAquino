package org.ae.model;

/**
 *
 * @author Andres Aquino
 */
public class Autor {
    private int idAutor;
    private String nombreAutor;
    private String apellidoAutor;
    private String nacionalidad;
    private String biografia;
   //en esta parte se hacen los atributos hacia el persosaje 

    /**
     *
     */
    public Autor () {
}

    /**
     *
     * @param idAutor damos el id o usuario de autor
     * @param nombreAutor damos el nombre Autor
     * @param apellidoAutor damos el apellido de autor
     * @param nacionalidad damos la nacionalidad
     * @param biografia damos la biografia 
     */
    public Autor(int idAutor, String nombreAutor, String apellidoAutor, String nacionalidad, String biografia) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }
//el get es como preguntarle como se llama ala propia class y el set como se llamara

    /**
     *
     * @return pedimos el id autor o usuario como le guste llamarle
     */
    public int getIdAutor() {
        return idAutor;
    }

    /**
     *
     * @param idAutor damos el id o usuario de autor
     */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    /**
     *
     * @return pedimos el get nombre de autor
     */
    public String getNombreAutor() {
        return nombreAutor;
    }

    /**
     *
     * @param nombreAutor damos el nombre de autor 
     */
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    /**
     *
     * @return pedimos el apellido de autor
     */
    public String getApellidoAutor() {
        return apellidoAutor;
    }

    /**
     *
     * @param apellidoAutor damos el apellido de autor 
     */
    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    /**
     *
     * @return peidimos la nacionalidad del id
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     *
     * @param nacionalidad damos la nacionalidad del id
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     *
     * @return pedimos la biografia del get
     */
    public String getBiografia() {
        return biografia;
    }

    /**
     *
     * @param biografia damos la biografia del set
     */
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
//sirve para simplemente en el codigo no aparezca un codigo, si no el nombre de la class

    /**
     *
     * @return pedimos el String 
     * 
     */
    @Override
    public String toString() {
        return nombreAutor + " " + apellidoAutor;
    }
}
