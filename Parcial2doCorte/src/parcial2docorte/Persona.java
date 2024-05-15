/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2docorte;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Persona {
    
    private String noDocumento;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String telefono;

    public Persona(String noDocumento, String nombre, String direccion, String ciudad, String telefono) {
        this.noDocumento = noDocumento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    // Getters
    public String getNoDocumento() {
        return noDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }
    
}
