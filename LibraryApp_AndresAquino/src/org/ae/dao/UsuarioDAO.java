package org.ae.dao;

import java.util.ArrayList;
import org.ae.model.Usuario;

/**
 *
 * @author andres aquino
 */
public interface UsuarioDAO {
    public Usuario iniciarSesion(String usernarme, String passwordHash);
    public boolean crearUsuario(Usuario usuario);
    public boolean actualizarUsuario(Usuario usuario);
    public boolean cambiarPassword(int idUsuario, String passwordHash);
    public boolean desactivarUsuario(int idUsuario);
    public boolean eliminarUsuario(int idUsuario);
    public ArrayList<Usuario> listarTodosUsuarios();
    public Usuario obtenerUsuarioPorId(int idUsuario);
}
