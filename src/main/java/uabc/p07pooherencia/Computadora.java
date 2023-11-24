/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p07pooherencia;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Computadora extends DispositivoElectronico{
    private Microprocesador cpu; // Mutable
    private long ramMB; // Mutable

    // Constructor
    public Computadora(String fabricante, String numeroSerie, String marca, String nombre, float costo,Microprocesador cpu, long ramMB) {
        super(fabricante,numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }
    

    // Métodos getter y setter para atributos mutables
    public Microprocesador getCpu() {
        return cpu;
    }

    public void setCpu(Microprocesador cpu) {
        this.cpu = cpu;
    }

    public long getRamMB() {
        return ramMB;
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }

    @Override
    public String toString() {
        return "Computadora{" + "cpu=" + cpu + ", ramMB=" + ramMB + '}';
    }
    
}
