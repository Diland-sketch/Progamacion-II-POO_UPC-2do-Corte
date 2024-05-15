/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2docorte;

/**
 *
 * @author OSMAR LOPEZ
 */
class GuiaDocumento extends Guia {
    private double peso;

    public GuiaDocumento(int noGuia, Persona remitente, Persona destinatario, double valorDeclarado, String descripcion, double peso) {
        super(noGuia, remitente, destinatario, valorDeclarado, descripcion);
        this.peso = peso;
    }

    @Override
    public void calcularValor() {
        this.valorAPagar = 5000 * this.peso + 0.05 * this.valorDeclarado;
    }

    // Getter específico para peso
    public double getPeso() {
        return peso;
    }
}
