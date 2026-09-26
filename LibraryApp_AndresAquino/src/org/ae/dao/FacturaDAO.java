package org.ae.dao;

import java.util.ArrayList;
import org.ae.model.LineaFactura;

/**
 *
 * @author andres aquino
 */
public interface FacturaDAO {

    /**
     *
     * @param noVenta se entraga NoVebnta 
     * @return recubimos noVenta
     */
    ArrayList<LineaFactura> buscarFactura(int noVenta);
}
