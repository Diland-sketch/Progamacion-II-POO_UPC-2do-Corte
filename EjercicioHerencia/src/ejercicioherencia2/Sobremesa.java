/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherencia2;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Sobremesa extends Ordenador {
    
    private String tipoTorre;

    public Sobremesa(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }

    public Sobremesa(String tipoTorre, String codigo, double precio) {
        super(codigo, precio);
        this.tipoTorre = tipoTorre;
    }

    @Override
    public String toString(){
        return "Sobremesa... Es el que mas pesa, pero el que menos cuesta";
    }
    
    
}
