/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioherencia;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Rafa");
        Directivo d1 = new Directivo("Mario");
        Operario op1 = new Operario("Alonso");
        Oficial of1 = new Oficial("Luis");
        Tecnico t1 = new Tecnico("Pablo");
        System.out.println(e1);
        System.out.println(d1);
        System.out.println(op1);
        System.out.println(of1);
        System.out.println(t1);
        
    }
    
}
