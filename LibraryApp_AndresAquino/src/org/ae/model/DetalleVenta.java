package org.ae.model;

/**
 *
 * @author Andres Aquino
 */
public class DetalleVenta {
    private int idDetalleVenta;
    private int noVenta;
    private String isbn;
    private int cantidad;
    private double precio;

    /**
     *
     */
    public DetalleVenta() {
    }

    /**
     *
     * @param idDetalleVenta damos detalleVentana
     * @param noVenta damos Venta
     * @param isbn vamos a dar isbn
     * @param cantidad daremos la cantidad
     * @param precio daremos el precio
     */
    public DetalleVenta(int idDetalleVenta, int noVenta, String isbn, int cantidad, double precio) {
        this.idDetalleVenta = idDetalleVenta;
        this.noVenta = noVenta;
        this.isbn = isbn;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     *
     * @return resivimos detaelle venta
     */
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    /**
     *
     * @param idDetalleVenta damos los detalles de la venta
     */
    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    /**
     *
     * @return resivimos noVenta
     */
    public int getNoVenta() {
        return noVenta;
    }

    /**
     *
     * @param noVenta daremos lo que es noVenta
     */
    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    /**
     *
     * @return resivimos el Isbn 
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     *
     * @param isbn daremos el isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     *
     * @return nos daran la Cantidad de get
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad daremos la cantidad de set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @return nos dan el precio de get
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio damos el precio de set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
