package org.ae.system;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.ae.manager.SesionContext;
import org.ae.model.Usuario;

/**
 * Clase principal de la aplicación.
 * 
 * @author Andres Aquino
 */
public class Principal extends Application {

    private static Stage escenarioPrincipal;
    private static final Logger log = Logger.getLogger(Principal.class.getName());

    /**
     * Cambia la escena actual de la aplicación utilizando la ruta del archivo FXML proporcionada.
     * Maneja internamente las excepciones de entrada y salida para facilitar su llamada.
     *
     * @param rutaFXML La ruta del archivo FXML que se va a cargar.
     */
    public static void cambiarEscena(String rutaFXML) {
        try {
            CambiarEscena(rutaFXML);
        } catch (IOException e) {
            log.log(Level.SEVERE, "Error al cambiar de escena a: " + rutaFXML, e);
        }
    }

    /**
     * Carga y muestra una nueva escena en el escenario principal a partir de una ruta FXML.
     *
     * @param rutaFXML damos el ruta FXML
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    public static void CambiarEscena(String rutaFXML) throws IOException {
        log.log(Level.INFO, "Se Cambio de escena a: {0}", rutaFXML);
        Parent raiz = FXMLLoader.load(
                Principal.class.getResource(rutaFXML));
        Scene escena = new Scene(raiz);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        escenarioPrincipal.centerOnScreen();
        escenarioPrincipal.show();
    }

    /**
     * devuelve la ruta del dashboard correspondiente al rol del usuario con
     * sesion activa. si no hay sesion o el rol es desconocido, devuelve la
     * ruta del login.
     * 
     * @return pedimos la ruta de DashboardSegundoRol
     */
    public static String rutaDashboardSegunRol() {
        Usuario usuario = SesionContext.getInstancia().getUsuarioActual();
        if (usuario == null || usuario.getRol() == null) {
            return "/org/ae/view/fxml/InicioSesionView.fxml";
        }
        switch (usuario.getRol().toLowerCase()) {
            case "admin":
                return "/org/ae/view/fxml/AdminDashboradView.fxml";
            case "empleado":
                return "/org/ae/view/fxml/EmpleadoView.fxml";
            case "cajero":
                return "/org/ae/view/fxml/CajeroView.fxml";
            default:
                return "/org/ae/view/fxml/InicioSesionView.fxml";
        }
    }

    /**
     * Método principal que inicia la aplicación JavaFX.
     *
     * @param args damos el main 
     */
    public static void main(String[] args) {
        log.info("Se inicio el programa");
        launch(args);
    }

    /**
     * Inicializa el escenario principal y muestra la ventana de inicio de sesión.
     *
     * @param escenarioPrincipal damops el escenario Principal
     * @throws Exception Si ocurre un error durante el inicio de la aplicación.
     */
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Principal.escenarioPrincipal = escenarioPrincipal;
        CambiarEscena("/org/ae/view/fxml/InicioSesionView.fxml");
    }

}