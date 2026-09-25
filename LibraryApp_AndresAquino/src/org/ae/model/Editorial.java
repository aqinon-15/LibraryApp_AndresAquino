package org.ae.model;

/**
 *
 * @author Andres Aquino
 */
public class Editorial {
    private String nit;
    private String nombreEditorial;
    private String telefonoEditorial;
    private String direccionEditoria;

    /**
     *
     */
    public Editorial() {
    }

    /**
     *
     * @param nit damos el nit
     * @param nombreEditorial damos lo que viene siendo el nombre editorial
     * @param telefonoEditorial damos el telefono editorial
     * @param direccionEditoria damos la direccion del editorial
     */
    public Editorial(String nit, String nombreEditorial, String telefonoEditorial, String direccionEditoria) {
        this.nit = nit;
        this.nombreEditorial = nombreEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.direccionEditoria = direccionEditoria;
    }

    /**
     *
     * @return resivimos el Nit de get
     */
    public String getNit() {
        return nit;
    }

    /**
     *
     * @param nit tenemos de dar el nit
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     *
     * @return resivimos el NombreEditorial 
     */
    public String getNombreEditorial() {
        return nombreEditorial;
    }

    /**
     *
     * @param nombreEditorial damos el nombre editorial 
     */
    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    /**
     *
     * @return resivimos el telefono editorial
     */
    public String getTelefonoEditorial() {
        return telefonoEditorial;
    }

    /**
     *
     * @param telefonoEditorial damos el telefono editorial
     */
    public void setTelefonoEditorial(String telefonoEditorial) {
        this.telefonoEditorial = telefonoEditorial;
    }

    /**
     *
     * @return resivimos la DireccionEditorial
     */
    public String getDireccionEditoria() {
        return direccionEditoria;
    }

    /**
     *
     * @param direccionEditoria damos la direccionEditorial 
     */
    public void setDireccionEditoria(String direccionEditoria) {
        this.direccionEditoria = direccionEditoria;
    }

    /**
     *
     * @return resivimos el nombre de Editorial
     */
    @Override
    public String toString() {
        return nombreEditorial;
    }
}
