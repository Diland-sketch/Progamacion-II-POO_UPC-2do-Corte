/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherencia2;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Ordenador {
    
    private String codigo;
    private double precio;

    public Ordenador() {
    }

    public Ordenador(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "codigo=" + codigo + ", precio=" + precio + '}';
    }
    
}
