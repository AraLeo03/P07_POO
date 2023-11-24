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
public class ComponenteElectronico extends DispositivoElectronico{
    private DispositivoElectronico esParteDe;
    
    //Constructor con mutables
    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo,DispositivoElectronico esParteDe) {
        super(fabricante,numeroSerie, marca, nombre, costo);
        this.esParteDe = esParteDe;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico{" + "esParteDe=" + esParteDe + '}';
    }
    
}
