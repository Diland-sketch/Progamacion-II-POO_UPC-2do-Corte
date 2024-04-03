/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherencia;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Oficial extends Operario{
    
    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre() + " -> Operario -> Oficial";
    }
    
    
    
}
