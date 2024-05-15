/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2docorte;

/**
 *
 * @author OSMAR LOPEZ
 */
class GuiaPaquete extends Guia {
    private double largo;
    private double ancho;
    private double alto;

    public GuiaPaquete(int noGuia, Persona remitente, Persona destinatario, double valorDeclarado, String descripcion, double largo, double ancho, double alto) {
        super(noGuia, remitente, destinatario, valorDeclarado, descripcion);
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void calcularValor() {
        double volumen = largo * ancho * alto;
        this.valorAPagar = 1500 * volumen + 0.10 * this.valorDeclarado;
    }

    // Getters específicos para dimensiones
    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
}

