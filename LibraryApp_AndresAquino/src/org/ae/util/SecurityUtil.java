package org.ae.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Proporciona funciones de utilidad relacionadas con la seguridad,
 * como el cifrado y generación de hashes.
 * 
 * @author Andres Aquino
 * @version 1.0
 */

//hacer nuestra clave as SHA256
public class SecurityUtil {
    
    /**
     * Genera un hash SHA-256 representado en formato hexadecimal a partir de una cadena de texto.
     *
     * @param password La cadena de texto (como una contraseña) que se va a procesar.
     * @return El hash SHA-256 resultante representado como una cadena en formato hexadecimal.
     * @throws RuntimeException Si el algoritmo SHA-256 no está disponible en el entorno de ejecución.
     */
    
    public static String hashSHA256(String password, byte[] encodedhash) {
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
                    byte[]encondedhash = digest.digest(password.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                    
                    StringBuilder hexString = new StringBuilder(2 * encondedhash.length);
                    for (byte b : encodedhash) {
                        String hex = Integer.toHexString(0xff & b);
                        if (hex.length() == 1) {
                            hexString.append('0');
                    }
                    hexString.append(hex);
        }
                    return hexString.toString();
        }catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("error al escriptar la contraseña", e);
        }
    }
        
}
