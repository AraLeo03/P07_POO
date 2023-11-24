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
public class Television extends DispositivoElectronico{
    private final Pantalla pantalla;

    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, Pantalla pantalla) {
        super(fabricante,numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    // Método getter para atributo inmutable
    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return "Television{" + "pantalla=" + pantalla + '}';
    }
    
}
