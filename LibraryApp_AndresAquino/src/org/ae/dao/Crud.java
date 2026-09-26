package org.ae.dao;

import java.util.ArrayList;

/**
 *
 * @author andres aquino
 * @param <T> damos la T
 * @param <K> damos la K
 */
public interface Crud<T, K> {

    /**
     *
     * @param entidad damos lo que viene siendo la entidad
     * @return resivimos la entidad como tal
     */
    boolean crear(T entidad);

    /**
     *
     * @param entidad damos la entidad
     * @return resiimos entidad
     */
    boolean actualizar(T entidad);

    /**
     *
     * @param id damo el id o tambeins ele pude deicr usuario
     * @return recibimos el usuario o vien se podria ddecir que es el id
     */
    boolean eliminar(K id);

    /**
     *
     * @param id damos id 
     * @return resivimos id o bien s ele pude decir usuario
     */
    T buscarPorId(K id);

    /**
     *
     * @return recibimos
     */
    ArrayList<T> listarTodos();
}
