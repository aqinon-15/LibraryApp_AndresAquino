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
     * @param numeroFactura damos el numero de factura
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     *
     * @return nos da la fecha de emision
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     *
     * @param fechaEmision damos la fecha de emicion
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     *
     * @return nos dan el cui del cliente 
     */
    public long getCuiCliente() {
        return cuiCliente;
    }

    /**
     *
     * @param cuiCliente resivimos el cui de cliente
     */
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    /**
     *
     * @return nos da el nombre de cliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     *
     * @param nombreCliente damos nombreCliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     *
     * @return nos da el correoCliente
     */
    public String getCorreoCliente() {
        return correoCliente;
    }

    /**
     *
     * @param correoCliente damos correo cliente
     */
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    /**
     *
     * @return resivimos de IsbnLibro
     */
    public String getIsbnLibro() {
        return isbnLibro;
    }

    /**
     *
     * @param isbnLibro damos el IsbnLibro
     */
    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    /**
     *
     * @return dos dan el titulo del libro
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     *
     * @param tituloLibro damos el titulo del libro
     */
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    /**
     *
     * @return nos da la cantidad del get
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad damos la cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @return nos dan PrecioUnatario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     *
     * @param precioUnitario damos el precioUnitario
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     *
     * @return resivimos el subTotal de get
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     *
     * @param subtotal damos el subTotal
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     *
     * @return resivimos el UsuarioAtendio
     */
    public String getUsuarioAtendio() {
        return usuarioAtendio;
    }

    /**
     *
     * @param usuarioAtendio damos el usuarioAtendio
     */
    public void setUsuarioAtendio(String usuarioAtendio) {
        this.usuarioAtendio = usuarioAtendio;
    }

    /**
     *
     * @return resivimos el GranTotal
     */
    public double getGranTotal() {
        return granTotal;
    }

    /**
     *
     * @param granTotal damos lo que viene siendo el granTotal
     */
    public void setGranTotal(double granTotal) {
        this.granTotal = granTotal;
    }
}
