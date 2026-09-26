package org.ae.dao;

import java.util.List;
import org.ae.model.LineaVenta;
import org.ae.model.Venta;

/**
 *
 * @author andres aquino
 */
public interface VentaDAO extends Crud<Venta, Integer>{
    //crearVenta inserta el encabezado de la venta, sus líneas y descuenta el stock.
    //Devuelve el no_venta generado (o -1 si falla).

    /**
     *
     * @param venta damos o mejor dicho entregamos venta
     * @param lineas damos lineas
     * @return recibimos venta y lineas
     */
    int crearVenta(Venta venta, List<LineaVenta> lineas);
}
