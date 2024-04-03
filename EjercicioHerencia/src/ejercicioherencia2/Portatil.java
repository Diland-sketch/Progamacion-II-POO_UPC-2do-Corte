/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherencia2;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Portatil extends Ordenador{
    
    private double peso;

    public Portatil() {
    }

    public Portatil(double peso) {
        this.peso = peso;
    }

    public Portatil(double peso, String codigo, double precio) {
        super(codigo, precio);
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        return "Portatil... Ideal para sus viajes";
    }
    
}
