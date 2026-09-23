package org.ae.model;

/**
 *
 * @author Andres Aquino
 * @version 1.0
 */
public class LineaFactura {
    private int numeroFactura;
    private String fechaEmision;
    private long cuiCliente;
    private String nombreCliente;
    private String correoCliente;
    private String isbnLibro;
    private String tituloLibro;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private String usuarioAtendio;
    private double granTotal;

    /**
     *constructor por defecto sin parametros
     */
    public LineaFactura() {
    }

    /**
     *obtiene e numero identificador de la factura
     *it status
     * 
     * @return el numero de la factura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     *
     * @param numeroFactura
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     *
     * @return
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     *
     * @param fechaEmision
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     *
     * @return
     */
    public long getCuiCliente() {
        return cuiCliente;
    }

    /**
     *
     * @param cuiCliente
     */
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    /**
     *
     * @return
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     *
     * @param nombreCliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     *
     * @return
     */
    public String getCorreoCliente() {
        return correoCliente;
    }

    /**
     *
     * @param correoCliente
     */
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    /**
     *
     * @return
     */
    public String getIsbnLibro() {
        return isbnLibro;
    }

    /**
     *
     * @param isbnLibro
     */
    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    /**
     *
     * @return
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     *
     * @param tituloLibro
     */
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    /**
     *
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @return
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     *
     * @param precioUnitario
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     *
     * @return
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     *
     * @param subtotal
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     *
     * @return
     */
    public String getUsuarioAtendio() {
        return usuarioAtendio;
    }

    /**
     *
     * @param usuarioAtendio
     */
    public void setUsuarioAtendio(String usuarioAtendio) {
        this.usuarioAtendio = usuarioAtendio;
    }

    /**
     *
     * @return
     */
    public double getGranTotal() {
        return granTotal;
    }

    /**
     *
     * @param granTotal
     */
    public void setGranTotal(double granTotal) {
        this.granTotal = granTotal;
    }
}
