/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2docorte;

import java.util.Date;

/**
 *
 * @author OSMAR LOPEZ
 */
    abstract class Guia implements Servicio {
    protected int noGuia;
    protected Persona remitente;
    protected Persona destinatario;
    protected double valorDeclarado;
    protected String descripcion;
    protected double valorAPagar;
    protected String estado;
    protected Date fechaEntrega;

    public Guia(int noGuia, Persona remitente, Persona destinatario, double valorDeclarado, String descripcion) {
        this.noGuia = noGuia;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.valorDeclarado = valorDeclarado;
        this.descripcion = descripcion;
        this.estado = "pendiente";
        this.valorAPagar = 0;
        this.fechaEntrega = null;
    }

    // Getters y Setters
    public int getNoGuia() {
        return noGuia;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public abstract void calcularValor();
}
