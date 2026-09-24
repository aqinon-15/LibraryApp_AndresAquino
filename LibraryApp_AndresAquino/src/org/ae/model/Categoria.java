package org.ae.model;
    
/**
 *
 * @author Andres Aquino
 */
public class Categoria {
        private int idCategoria;
        private String nombreCategoria;
        
    /**
     *
     */
    public Categoria (){
        }
        
    /**
     *
     * @param idcategoria damos los id osea usuarios de categorias
     * @param nombreCategoria damos los nombres de categorias 
     */
    public Categoria(int idcategoria, String nombreCategoria){
            this.idCategoria = idCategoria;
            this.nombreCategoria = nombreCategoria;
        }
        
    /**
     *
     * @return pedimos los id osea usuarios de categorias
     */
    public int getIdCategoria (){
            return idCategoria;
        }
        
    /**
     *
     * @param idCategoria damos id osea los usuarios de categorias 
     */
    public void setIdCategoria(int idCategoria) {
            this.idCategoria = idCategoria;
        }

    /**
     *
     * @return pedimos los Nonbre Categorias de get
     */
    public String getNombreCategoria() {
            return nombreCategoria;
        }
        
    /**
     *
     * @param nombreCategoria damos los nombre de categorias 
     */
    public void setNombreCategoria(String nombreCategoria) {
            this.nombreCategoria = nombreCategoria;
        }
        
    /**
     *
     * @return pedimos o requerimos de los String
     */
    @Override
        public String toString() {
            return nombreCategoria;
        }
    }   