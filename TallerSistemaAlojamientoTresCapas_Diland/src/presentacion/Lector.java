/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTES
 */
public class Lector {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static int leerInt(String label){
        
        int valor = 0;
        boolean excepcion;
        do{ 
            try{
                System.out.print(label);
                valor = scanner.nextInt();
                excepcion = false;
            }
            catch(InputMismatchException ime){
                System.out.println("Error: Se requiere valor numerico");
                scanner.nextLine();
                excepcion = true;
            }
        }while(excepcion);
        return valor;
    }
    
    public static int leerNum(String label){
        int valor = 0;
        do{
            System.out.print(label);
            valor = scanner.nextInt();
            if(valor <= 0){
                System.out.println("Ingrese valor un valor coherente");
            }
        }while(valor <= 0);
        return valor;
    }
    
    public static int leerDia(String label){
        int valor = 0;
        do{
            System.out.print(label);
            valor = scanner.nextInt();
            if(valor <= 0 || valor > 31){
                System.out.println("Ingrese un dia correcto");
            }
        }while(valor <= 0 || valor > 31);
        return valor;
    }
    
    public static int leerMes(String label){
        int valor = 0;
        do{
            System.out.print(label);
            valor = scanner.nextInt();
            if(valor <= 0 || valor > 12){
                System.out.println("Ingrese un mes correcto");
            }
        }while(valor <= 0 || valor > 12);
        return valor;
    }
    
    public static int leerAnio(String label){
        int valor = 0;
        do{
            System.out.print(label);
            valor = scanner.nextInt();
            if(valor < LocalDate.now().getYear()){
                System.out.println("Ingrese un año correcto");
            }
        }while(valor < LocalDate.now().getYear());
        return valor;
    }
}
