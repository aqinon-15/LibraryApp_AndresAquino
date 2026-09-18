package org.ae.model;

/**
 *representa la entidad que esta dentro de venta
 * contiene informacion basica del emcabezado de alguna transaccion de venta
 * 
 * @author Andres Aquino
 */
public class Venta {
    private int noVenta;
    private String fechaVenta;
    private double totalVenta;
    private long cuiCliente;
    private int idUsuario;

    /**
     *Contructor que viene por defecto de la clase venta
     */
    public Venta() {
    }

    /**
     *El constructor con los campos necesarios para inizializar una venta
     * 
     * @param noVenta identificador unico de la venta
     * @param fechaVenta la fecha en la que se hizo la venta
     * @param totalVenta El total acumulado de toda la venta
     * @param cuiCliente el dpi o bein dice cui de la persona relacionada a la venta
     * @param idUsuario Identificador del usuario que registro la venta
     */
    public Venta(int noVenta, String fechaVenta, double totalVenta, long cuiCliente, int idUsuario) {
        this.noVenta = noVenta;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
        this.cuiCliente = cuiCliente;
        this.idUsuario = idUsuario;
    }

    /**
     *obtiene el numero correlativo o ID de la venta
     * 
     * @return numeor de la venta
     */
    public int getNoVenta() {
        return noVenta;
    }

    /**
     *establece el numero de venta 
     * 
     * @param noVenta numero de venta que hay que asignar
     */
    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    /**
     *obtiene la fecha en la que feu registrada la venta
     * 
     * @return
     */
    public String getFechaVenta() {
        return fechaVenta;
    }

    /**
     *establece la fehca de registro de la venta
     * 
     * @param fechaVenta fecha por asignar
     */
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     *
     * @return
     */
    public double getTotalVenta() {
        return totalVenta;
    }

    /**
     *Establece el total de la venta
     * 
     * 
     * @param totalVenta total por asignar
     */
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    /**
     *obtiene el dpi del cliente al que pertenece la venta
     * 
     * @return dpi del cliente
     */
    public long getCuiCliente() {
        return cuiCliente;
    }

    /**
     *Establece el dpi del cliente relacionado con la ventaw
     * @param cuiCliente dpi del cliente a asignar
     */
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    /**
     *Obtiene la identificacion del empleado que realizo la venta
     * 
     * @return identificacion usuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     *establece la identidicacion del usuario
     * 
     * @param idUsuario id usuario por asignar
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
