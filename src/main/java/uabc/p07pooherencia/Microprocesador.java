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
public class Microprocesador extends ComponenteElectronico{
    private final int cacheRAM;
    private final long velocidadHz;

    public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, float costo,DispositivoElectronico esParteDe,int cacheRAM, long velocidadHz) {
        super(fabricante,  numeroSerie, marca, nombre, costo, esParteDe);
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    // Métodos getter para atributos inmutables
    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }

    @Override
    public String toString() {
        return "Microprocesador{" + "cacheRAM=" + cacheRAM + ", velocidadHz=" + velocidadHz + '}';
    }
    
}
