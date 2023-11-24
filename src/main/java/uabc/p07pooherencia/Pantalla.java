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
public class Pantalla extends ComponenteElectronico{
    private final int resolucionX;
    private final int resolucionY;

    public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, float costo,DispositivoElectronico esParteDe,int resolucionX, int resolucionY) {
        super( fabricante,  numeroSerie, marca, nombre, costo, esParteDe);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }
    
    

    // Métodos getter para atributos inmutables
    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "resolucionX=" + resolucionX + ", resolucionY=" + resolucionY + '}';
    }
    
}
