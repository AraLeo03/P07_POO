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
public class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    private boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo,boolean encendido) {
        super(fabricante,numeroSerie, marca, nombre, costo);
        this.encendido = encendido;
    }
    

    // Método getter para el atributo mutable
    public boolean isEncendido() {
        return encendido;
    }

    // Método para encender el dispositivo
    public void encender() {
        this.encendido = true;
    }

    // Método para apagar el dispositivo
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public String toString() {
        return "DispositivoElectronicoDeConsumo{" + "encendido=" + encendido + '}';
    }
    
}
