/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2docorte;

import java.util.List;

/**
 *
 * @author OSMAR LOPEZ
 */
public class AgenciaEnvios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona remitente1 = new Persona("123", "Juan Perez", "Calle 1", "Ciudad A", "111-111");
        Persona destinatario1 = new Persona("456", "Maria Gomez", "Calle 2", "Ciudad B", "222-222");

        Persona remitente2 = new Persona("789", "Ana Lopez", "Calle 3", "Ciudad C", "333-333");
        Persona destinatario2 = new Persona("012", "Carlos Ruiz", "Calle 4", "Ciudad D", "444-444");

        // Crear guías
        Guia guia1 = new GuiaDocumento(1, remitente1, destinatario1, 1000, "Documentos legales", 2);
        Guia guia2 = new GuiaPaquete(2, remitente2, destinatario2, 2000, "Paquete grande", 10, 20, 30);

        // Crear libro de guías
        LibroDeGuias libro = new LibroDeGuias();
        libro.registrarGuia(guia1);
        libro.registrarGuia(guia2);

        // Simular entrega de una guía
        Guia guiaEntregada = libro.entregarGuia(1);
        if (guiaEntregada != null) {
            System.out.println("Guía entregada: " + guiaEntregada.getNoGuia() + ", Valor a pagar: " + guiaEntregada.getValorAPagar() + ", Fecha de entrega: " + guiaEntregada.getFechaEntrega());
        } else {
            System.out.println("No se pudo entregar la guía");
        }

        // Consultar guías por estado
        List<Integer> guiasPendientes = libro.consultarGuias("pendiente");
        List<Integer> guiasEntregadas = libro.consultarGuias("entregada");

        System.out.println("Guías pendientes: " + guiasPendientes);
        System.out.println("Guías entregadas: " + guiasEntregadas);
    }
}
