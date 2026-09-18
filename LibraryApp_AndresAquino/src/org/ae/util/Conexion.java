package org.ae.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Administra la conexión a la base de datos MySQL mediante el patrón Singleton.
 * Lee las credenciales desde un archivo externo llamado db.properties.
 * 
 * @author Andrés Aquino
 * @version 1.0
 */
public class Conexion {
    
    /** Única instancia compartida de esta clase (Patrón Singleton). */
    private static Conexion instancia;

    /** Ruta del archivo de configuración dentro del proyecto. */
    private static final String CONFIG_FILE = "/db.properties";

    /** Dirección web o IP donde vive la base de datos. */
    private final String url;
    
    /** Nombre del usuario para acceder a la base de datos. */
    private final String user;
    
    /** Contraseña del usuario para acceder a la base de datos. */
    private final String password;
    
    /**
     * Constructor privado para evitar que se creen múltiples copias de esta clase fuera de ella.
     * Carga el driver de MySQL y lee los datos del archivo db.properties.
     * 
     * @throws IllegalStateException Si no existe el archivo db.properties o faltan datos obligatorios.
     */

    //Constructor privado para evitar que hagan "new Conexion()" fuera de esta clase
    private Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error Driver: " + e.getMessage());
        }

        Properties config = new Properties();
        try (InputStream in = getClass().getResourceAsStream(CONFIG_FILE)) {
            if (in == null) {
                throw new IllegalStateException(
                        "No se encontro " + CONFIG_FILE + " en el classpath. "
                        + "Copia db.properties.example como src/db.properties y ajusta los valores.");
            }
            config.load(in);
        } catch (IOException e) {
            throw new IllegalStateException("Error al leer " + CONFIG_FILE, e);
        }

        this.url = config.getProperty("db.url");
        this.user = config.getProperty("db.user");
        this.password = config.getProperty("db.password");
        if (url == null || user == null || password == null) {
            throw new IllegalStateException(
                    "Faltan propiedades (db.url, db.user, db.password) en " + CONFIG_FILE);
        }
    }

    /**
     * Obtiene la única instancia activa de la clase Conexion. Si no existe, la crea.
     * Es 'synchronized' para evitar que dos partes de la aplicación la creen al mismo tiempo.
     *
     * @return La instancia única de la clase {@link Conexion}.
     */
    public static synchronized Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

   /**
     * Abre y entrega una llamada o conexión directa y limpia hacia la base de datos MySQL.
     *
     * @return Un objeto {@link Connection} listo para enviar consultas SQL.
     * @throws SQLException Si ocurre un error al intentar conectar con las credenciales indicadas.
     */
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
    
}
