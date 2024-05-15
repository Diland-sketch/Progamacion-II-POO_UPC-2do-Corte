/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2docorte;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author OSMAR LOPEZ
 */
class LibroDeGuias {
    private Map<Integer, Guia> guias;

    public LibroDeGuias() {
        this.guias = new HashMap<>();
    }

    public void registrarGuia(Guia guia) {
        this.guias.put(guia.getNoGuia(), guia);
    }

    public Guia entregarGuia(int noGuia) {
        if (guias.containsKey(noGuia)) {
            Guia guia = guias.get(noGuia);
            if (guia.getEstado().equals("pendiente")) {
                guia.calcularValor();
                guia.setFechaEntrega(new Date());
                guia.setEstado("entregada");
                return guia;
            }
        }
        return null;
    }

    public List<Integer> consultarGuias(String estado) {
        List<Integer> resultado = new ArrayList<>();
        for (Guia guia : guias.values()) {
            if (guia.getEstado().equals(estado)) {
                resultado.add(guia.getNoGuia());
            }
        }
        return resultado;
    }
}

