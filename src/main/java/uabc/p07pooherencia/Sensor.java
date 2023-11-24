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
public class Sensor extends ComponenteElectronico{
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;

    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, float costo,DispositivoElectronico esParteDe,String tipo, String unidadDeMedida, int valor) {
        super(fabricante,  numeroSerie, marca, nombre, costo, esParteDe);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    // Métodos getter para atributos inmutables
    public String getTipo() {
        return tipo;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Sensor{" + "tipo=" + tipo + ", unidadDeMedida=" + unidadDeMedida + ", valor=" + valor + '}';
    }
    
}
