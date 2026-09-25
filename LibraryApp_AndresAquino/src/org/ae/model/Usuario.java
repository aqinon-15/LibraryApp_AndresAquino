package org.ae.model;

import java.sql.Timestamp;

/**
 *
 * @author Andres aquino
 */
public class Usuario {
    
    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String passwordHash;
    private String rol;
    private boolean activo;
    private Timestamp fechaCreacion;

    /**
     *
     */
    public Usuario() {
    }

    /**
     *
     * @param id aqui tiene que colocar el id del usuario
     * @param username aqui se coloca el nombre del usuario
     * @param rol se pide el puesto del usuario
     */
    public Usuario(int id, String username, String rol) {
        this.id = id;
        this.username = username;
        this.rol = rol;
    }

    /**
     *
     * @param username nombre del usuario 
     * @param email correo electronio del usuario
     * @param firstName primer nombre del usuario
     * @param lastName segundo nombre del dicho usuario
     * @param passwordHash contraseña
     * @param rol cual es el rol que cumple el usuario 
     */
    public Usuario(String username, String email, String firstName, String lastName,
            String passwordHash, String rol) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
        this.rol = rol;
    }

    /**
     *obtiene el rol o el nivel de permiso del usuario dentro del sistema
     * 
     * @return nombre del rol (ADMIN, EMPLEADO)
     */
    public String getRol() {
        return rol;
    }

    /**
     * establece el rol que fue asignado anteriormente
     *
     * @param rol nuevo rol asignado

     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     *se obtiene el id del usuario
     * 
     * @return numero de id del usuario
     */
    public int getId() {
        return id;
    }

    /**
     *Establece un identificador unico de usuario
     * 
     * @param el ID numerico a asignar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *obtiene el nombre de usuario utilizado para comprobar la auntenticacion
     * 
     * @return el noombre del usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     *establece el nombre de usuario para el inicio de sesion
     * 
     * @param username el nombre de usuario asignado
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene la dirección de correo electrónico del usuario.
     *
     * @return el correo electrónico registrado.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece la dirección de correo electrónico del usuario.
     *
     * @param email el correo electrónico a asignar.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el nombre propio del usuario.
     *
     * @return el primer nombre.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Establece el primer nombre del usuario.
     *
     * @param firstName el nombre a asignar.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Obtiene el apellido del usuario.
     *
     * @return el apellido registrado.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece el apellido del usuario.
     *
     * @param lastName el apellido a asignar.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtiene la clave encriptada (hash) para validación de seguridad.
     *
     * @return el hash de la contraseña.
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Establece el hash de la contraseña.
     *
     * @param passwordHash el hash encriptado a asignar.
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Indica el estado de la cuenta del usuario en el sistema.
     *
     * @return {@code true} si la cuenta está activa; {@code false} si está inactiva o bloqueada.
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Define si la cuenta del usuario está habilitada para operar.
     *
     * @param activo {@code true} para activar el usuario, {@code false} para desactivarlo.
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Obtiene el registro de fecha y hora en que se creó la cuenta.
     *
     * @return marca de tiempo ({@link Timestamp}) con la fecha de registro.
     */
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Establece la fecha y hora de creación de la cuenta.
     *
     * @param fechaCreacion la marca de tiempo a asignar.
     */
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Retorna el nombre de usuario como representación en texto del objeto.
     * Esencial para mostrar texto limpio en componentes como {@code ComboBox} de JavaFX.
     *
     * @return el nombre de usuario ({@code username}).
     */
    @Override
    public String toString() {
        return username;
    }
}